/* 
Q1.Create a frame of 800px X 600px having title QUESTION1.Set gray background color.
Write message "This is 'YourName'".
Exactly below string draw a red colorfilled rectangle of 400px X 200px.
Implement WindowClosing event using independant class and exit() method. */ 

 
import java.awt.*; 
import java.awt.event.*;
class Myframe extends Frame 
{ 
   Myframe()
   {
	setSize(800,00);
    setTitle("Qestion1");
    setBackground(Color.GRAY);
    setLocationRelativeTo(null);
	setVisible(true); 
	// registration 
	this.addWindowListener(new MyWindowListener());
   } 
   public void paint(Graphics g) // paint() methods get's automatically call when the event source get created
   {  
      g.setColor(Color.blue); 
	  g.setFont(new Font("AERIAL",Font.BOLD,40));
      g.drawString("This is RK's App",400,400);   
	  g.setColor(Color.yellow);
	  g.fillRect(400,400,800,600);
	  
   }
}  
class MyWindowListener implements WindowListener 
{ 
       @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e)  
	{
        System.out.println("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
class pro1 
{
	public static void main(String[]args) 
	{ 
	  Myframe obj=new Myframe();
	}
}