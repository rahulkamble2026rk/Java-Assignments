/* Q2.Create a frame of 800px X 600px having title QUESTION2.
Draw 3 rectangles on frame filled with red,green and blue colors.
Implement WindowClosing event using independant class and dispose() method.
*/ 
import java.awt.*; 
import java .awt.event.*;
class Myframe extends Frame 
{ 
     Myframe() 
	 { 
	   setSize(800,600);
	   setTitle("QUESTION2");
	   setLocationRelativeTo(null);
	   setBackground(Color.black);
	   setVisible(true);  
	   MyWindowListener var=new MyWindowListener(this);
	   // registration 
	   
	   this.addWindowListener(var);
	 }  
	 public void paint(Graphics g) 
	 {  
	    g.setColor(Color.red);
	   g.fillRect(200,0,600,200);
	   g.setColor(Color.green);
	   g.fillRect(200,200,600,400);
	   g.setColor(Color.blue);
	   g.fillRect(200,400,600,600);
	 } 
} 
class pro2 
{
	public static void main(String[]args) 
	{
		Myframe obj=new Myframe();// this is nothing but the event source on which we doing the event(activity)
	    
	 }
} 
class MyWindowListener implements WindowListener 
{  
     Myframe obj;
    MyWindowListener(Myframe obj) 
	{ 
	  this.obj=obj;
	}
    
    public void windowOpened(WindowEvent e) {}

    
    public void windowClosing(WindowEvent e)  
	{
        System.out.println("Window closing");
        obj.dispose();
    }

    
    public void windowClosed(WindowEvent e) {}

 
    public void windowIconified(WindowEvent e) {}

    
    public void windowDeiconified(WindowEvent e) {}

    
    public void windowActivated(WindowEvent e) {}

    
    public void windowDeactivated(WindowEvent e) {}
}