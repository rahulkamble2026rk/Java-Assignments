/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rohit
 */ 
// Q6.Create 3 circles and 3 buttons(RED,BLUE,GREEN) on a frame.Color of all circles should change according to button you click.
 
import java.awt.*;
import java.awt.event.*;

class Myframe6 extends Frame
{ 
    Button btn;
    Myframe6()
    {
        setSize(800,800);
        setLocationRelativeTo(null);
        setTitle("pro6");
        setVisible(true); 
        setBackground(Color.CYAN);
        Myframe6 ref=this;
        this.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e) 
                    {
                       ref. dispose();// here we cannot use the this.dispose() directly beacause here this is the calline object of Myframe$1, so for that use only dispose or save the ref.in any object
                    }
                            
                });  
         
       Button btn=new Button("onclick");   
       btn.setBounds(200,200,100,100);
       btn.setBackground(Color.RED); 
       btn.setForeground(Color.YELLOW);
      
    
    }  
     public void paint(Graphics g) 
        {
           
            g.setColor(Color.YELLOW);
            g.fillOval(this.getWidth()/2-300,this.getHeight()/2-300,300, 300);   
            g.setColor(Color.BLUE);
            g.fillOval(this.getWidth()/2-300,this.getHeight()/2-300,300, 300);  
            g.setColor(Color.WHITE);
            g.fillOval(this.getWidth()/2-300,this.getHeight()/2-300,300, 300); 
            
            
        }
}


        
public class pro6
{
    public static void main(String[] args)
    {
        Myframe6 obj=new Myframe6();
    }
}
