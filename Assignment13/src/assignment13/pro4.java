
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame {
    Panel pnl14;
    Panel pnl24;
    TextField txt1;
    TextField txt2;
    TextField txt3;
    TextArea txt4;
    Label lbl1;
    Label lbl2;
    Label lbl3;
    Button btn;

    MyFrame4() {
        Font f = new Font("arial", Font.PLAIN, 20);
        setSize(1000, 1000);
        setTitle("pro3");
        setLocationRelativeTo(null);
        setBackground(Color.YELLOW);
        setLayout(null);

        pnl14 = new Panel();
        pnl14.setBounds(50, 50, 900, 900);
        pnl14.setBackground(Color.GRAY);
        pnl14.setForeground(Color.red);
        pnl14.setLayout(null);

        pnl24 = new Panel();
        pnl24.setBounds(20, 50, 300, 900);
        pnl24.setBackground(Color.orange);
        pnl24.setForeground(Color.red);
        pnl24.setLayout(null);

        lbl1 = new Label("FirstName");
        lbl1.setBounds(10, 50, 110, 40);
        lbl1.setBackground(Color.GREEN);
        lbl1.setForeground(Color.white);
        lbl1.setFont(f);

        lbl2 = new Label("MiddleName");
        lbl2.setBounds(10, lbl1.getY() + lbl1.getHeight() + 40, 110, 40);
        lbl2.setBackground(Color.GREEN);
        lbl2.setForeground(Color.white);
        lbl2.setFont(f);

        lbl3 = new Label("Age");
        lbl3.setBounds(10, lbl2.getY() + lbl2.getHeight() + 40, 110, 40);
        lbl3.setBackground(Color.GREEN);
        lbl3.setForeground(Color.white);
        lbl3.setFont(f);

        txt1 = new TextField("");
        txt1.setBounds(lbl1.getX() + lbl1.getWidth() + 20, 50, 140, 40);
        txt1.setBackground(Color.WHITE);
        txt1.setForeground(Color.red);
        txt1.setFont(f);

        txt2 = new TextField("");
        txt2.setBounds(lbl1.getX() + lbl1.getWidth() + 20, lbl1.getY() + lbl1.getHeight() + 40, 140, 40);
        txt2.setBackground(Color.WHITE);
        txt2.setForeground(Color.red);
        txt2.setFont(f);

        txt3 = new TextField("");
        txt3.setBounds(lbl1.getX() + lbl1.getWidth() + 20, lbl2.getY() + lbl2.getHeight() + 40, 140, 40);
        txt3.setBackground(Color.WHITE);
        txt3.setForeground(Color.red);
        txt3.setFont(f);

        txt4 = new TextArea("");
        txt4.setBounds(10, lbl3.getY() + lbl3.getHeight() + 140, 280, 220);
        txt4.setBackground(Color.WHITE);
        txt4.setForeground(Color.red);
        txt4.setFont(f);

        btn = new Button("Submit");
        btn.setBounds(80, lbl3.getY() + lbl3.getHeight() + 40, 100, 30);
        btn.setBackground(Color.white);
        btn.setForeground(Color.CYAN);
        btn.setFont(f);

        WindowAdapter obj = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        };

        setVisible(true);
        pnl14.add(pnl24);
        this.add(pnl14);
        pnl24.add(txt1);
        pnl24.add(txt2);
        pnl24.add(txt3);
        pnl24.add(txt4);
        pnl24.add(lbl1);
        pnl24.add(lbl2);
        pnl24.add(lbl3);
        pnl24.add(btn);
        this.addWindowListener(obj);

        MyActionListener obj1 = new MyActionListener(txt1, txt2, txt3, txt4, btn, this);
        MyKeyListener obj2 = new MyKeyListener();
        btn.addActionListener(obj1);
        txt1.addKeyListener(obj2);
        txt2.addKeyListener(obj2);
        txt3.addKeyListener(obj2);
    }
}

class Pro4 {
    public static void main(String[] args) 
    {
        MyFrame4 obj = new MyFrame4();
    }
}

class MyActionListener implements ActionListener 
{
    TextField t1, t2, t3;
    TextArea txt4;
    Button btn;
    MyMsg mm;
    Frame ff;

    MyActionListener(TextField t1, TextField t2, TextField t3, TextArea txt4, Button btn, Frame parent) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.txt4 = txt4;
        this.btn = btn;
        ff = parent;
    }

    public void actionPerformed(ActionEvent e) {
        if (t1.getText().isBlank() || t2.getText().isBlank() || t3.getText().isBlank()) {
            mm = new MyMsg(ff);
        } else {
            txt4.setText("FirstName: " + t1.getText() + "\nMiddleName: " + t2.getText() + "\nAge: " + t3.getText());
        }
    }
}

class MyKeyListener implements KeyListener 
{
    public void keyPressed(KeyEvent e) 
    { }

    public void keyTyped(KeyEvent e)
    {
        char c = e.getKeyChar();
        TextField source = (TextField) e.getSource();
        if (source.getName().equals("age")) 
        {
            if (!Character.isDigit(c))
            {
                e.consume(); // Ignore the event
            }
        } else 
        {
            if (!Character.isAlphabetic(c)) 
            {
                e.consume(); // Ignore the event
            }
        }
    }

    public void keyReleased(KeyEvent e) {}
}

class MyMsg extends Dialog  
{
    MyMsg(Frame obj)  
    {
        super(obj);  // give the name of the frame for which the dialog box will work  
        this.setSize(600, 400);
        this.setTitle("Dialog Box");
        this.setLocationRelativeTo(obj);
        this.add(new Label("All fields must be filled"), BorderLayout.CENTER);

        MyWindowAdapter ob = new MyWindowAdapter(this);
        this.addWindowListener(ob);
        this.setVisible(true);
    }
}

class MyWindowAdapter extends WindowAdapter {
    MyMsg msg;

    MyWindowAdapter(MyMsg my) {
        msg = my;
    }

    public void windowClosing(WindowEvent e) {
        msg.dispose();
    }
}
