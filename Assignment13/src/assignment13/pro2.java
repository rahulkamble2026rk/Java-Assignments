/* Q2.
Create a combobox on frame containing 4 colors option(red,blue,green and black)..Draw a circle on frame.
Change the color of circle according to selection in combobox.*/ 
 
import java.awt.*;

import java.awt.event.*; 
 
class Myframe2 extends Frame
{ 
    Choice ch; 
    Color c;
    Myframe2() 
    {
        this.setSize(1000,1000);
        this.setTitle("Pro2");
        this.setLocationRelativeTo(null);
        this.setBackground(Color.GRAY);
        this.setLayout(null);  
        Myframe2 ref=this;
         
        ch=new Choice();
        ch.add("RED");  
        ch.add("BLUE");   
        ch.add("GREEN");  
        ch.add("BLACK");  
        ch.setBounds(200,400,200,400); 
        ch.setBackground(Color.magenta); 
        ch.setForeground(Color.yellow); 
        ch.setFont(new Font("arial",Font.BOLD,25));
       
        WindowAdapter obj=new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                ref.dispose();
            }
        }; 
         
        MyItemListener mll1=new MyItemListener(this);
    
        this.add(ch);
        this.addWindowListener(obj); 
        ch.addItemListener(mll1);
        this.setVisible(true);
    } 
    public void paint(Graphics g)
    { 
         
        g.setColor(c);
        g.fillOval(600,300,300,300);  
        
    }
} 
class pro2
{
    public static void main(String[] args)
    {
        Myframe2 var=new Myframe2();
    }
} 
 
class MyItemListener implements ItemListener 
{  
    Myframe2 temp; 
    MyItemListener(Myframe2 var) 
    {
        temp=var; 
       
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(temp.ch.getSelectedItem().equals("RED")) 
        {
            temp.c=Color.RED;  
        }
        else if(temp.ch.getSelectedItem().equals("BLUE")) 
        { 
           temp.c=Color.BLUE; 
        } 
        else if(temp.ch.getSelectedItem().equals("GREEN")) 
        {
            temp.c=Color.GREEN;
        }   
        else if(temp.ch.getSelectedItem().equals("BLACK")) 
        {
            temp.c=Color.BLACK;
        } 
        temp.repaint();
        
    }
}
