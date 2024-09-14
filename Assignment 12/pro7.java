//Q6.Create 3 circles and 3 buttons(RED,BLUE,GREEN) on a frame.Color of all circles should change according to button you click. 
import java.awt.*;
import java.awt.event.*;
 
class Myframe7 extends Frame
{ 
    Button btn1,btn2,btn3; 
    Color c;
    Myframe7() 
    {
        this.setSize(800,800);  
        this.setTitle("Myframe");
        this.setLocationRelativeTo(null); 
        this.setBackground(Color.yellow); 
        this.setLayout(null);
         
        Myframe7 ref=this;
        WindowAdapter obj=new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                ref.dispose();
            }
        }; 
         
        MouseAdapter obj1=new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(ref.btn1==e.getSource()) 
                {
                    ref.c=new Color(255, 140, 0);
                } 
                else if(ref.btn2==e.getSource()) 
                { 
                    ref.c=new Color(255, 255, 255);
                    
                } 
                else if(ref.btn3==e.getSource()) 
                {
                   ref.c=new Color(0, 100, 0);
                } 
                ref.repaint();
            }
        };
        btn1=new Button("ORANGE");
        btn1.setBounds(250,700,70,30);  
        btn1.setBackground(new Color(255, 140, 0)); 
        btn1.setForeground(Color.white); 
         
        btn2=new Button("WHITE");
        btn2.setBounds(btn1.getX()+btn1.getWidth()+40,700,70,30);  
        btn2.setBackground(new Color(255, 255, 255)); 
        btn2.setForeground(Color.gray); 
         
        btn3=new Button("GREEN");
        btn3.setBounds(btn2.getX()+btn2.getWidth()+40,700,70,30);  
        btn3.setBackground(new Color(0, 100, 0)); 
        btn3.setForeground(Color.white);  
         
        btn1.addMouseListener(obj1); 
        btn2.addMouseListener(obj1);
        btn3.addMouseListener(obj1); 
        
        this.addWindowListener(obj); 
        this.add(btn1); 
        this.add(btn2); 
        this.add(btn3);
        this.setVisible(true);
    } 
        public void paint(Graphics g)
        { 
             g.setColor(c);
            g.fillOval(100, 150, 200,200); 
            g.setColor(c);   
            g.fillOval(500, 150, 200, 200); 
             g.setColor(c);
            g.fillOval(300,400, 200, 200);  
            g.setColor(Color.BLUE);
            g.fillOval(350,270, 100, 100);
            
        }
} 
class pro7
{
    public static void main(String[] args)
    {
        Myframe7 var=new Myframe7();
    }
}