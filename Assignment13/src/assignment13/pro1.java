 /*Q1.
Create a button on frame.On button click,close your frame.
Use ActionListener to handle event of button click.*/

import java.awt.*;
import java.awt.event.*;
 
class Myframe1 extends Frame
{ 
    Button btn; 
   
    Myframe1() 
    {
        this.setSize(800,800);  
        this.setTitle("Myframe");
        this.setLocationRelativeTo(null); 
        this.setBackground(Color.yellow); 
        this.setLayout(null);
         
        Myframe1 ref=this;
        WindowAdapter obj=new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                ref.dispose();
            }
        };  
         
        ActionListener obj1=new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { 
                System.out.println("close Sucessfully");
                ref.dispose();
            }
        };
         
        btn=new Button("Press me");
        btn.setBounds(350,350,100,50);
        btn.setBackground(Color.RED);
        btn.setForeground(Color.white); 
        
        this.addWindowListener(obj); 
        this.add(btn); 
        btn.addActionListener(obj1);
        this.setVisible(true);
    } 
        
} 
class pro1
{
    public static void main(String[] args)
    {
        Myframe1 var=new Myframe1();
    }
}