
import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame
{

    Button btnclick;
    Label lbl;
    boolean isHello = true;

    Myframe()
    {
        setSize(800, 800);
        setTitle("This is pro5");
        setLocationRelativeTo(null);
        setVisible(true);
        setBackground(Color.CYAN);
        setLayout(null);

        btnclick = new Button("Click");
        btnclick.setBounds(200, 300, 140, 100);
        btnclick.setFont(new Font("Arial", Font.BOLD, 20));
        btnclick.setBackground(Color.WHITE);
        btnclick.setForeground(Color.YELLOW);

        lbl = new Label("Hello Rahul");
        lbl.setBounds(100, 200, 200, 80);
        lbl.setForeground(Color.WHITE); // This is used for changing the color of the sentence of the label
        lbl.setFont(new Font("Arial", Font.BOLD, 40));
        lbl.setAlignment(Label.CENTER);

        // Adding ActionListener using an anonymous inner class
        btnclick.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (isHello)
                {
                    lbl.setText("Byy");
                } else
                {
                    lbl.setText("Hello RK");
                }
                isHello = !isHello;
            }
        });

        MywindowListener mwl = new MywindowListener(this);  // This is the registration of

        this.addWindowListener(mwl);
        this.add(btnclick);
        this.add(lbl);
    }
}

class pro5
{

    public static void main(String[] args)
    {
        Myframe obj = new Myframe();
    }
}

class MywindowListener extends WindowAdapter
{

    Myframe obj;

    MywindowListener(Myframe var)
    {
        obj = var;
    }

    public void windowClosing(WindowEvent e)
    {
        obj.dispose();
    }
}
