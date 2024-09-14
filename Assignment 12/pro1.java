import java.awt.*;
import java.awt.event.*;
  
 class Myframe extends Frame 
 {  
     int flag=1; 
	 int x;
     Myframe() 
	 { 
	    this.setSize(500,500);
		this.setTitle("pro1.java");
		this.setLocationRelativeTo(null);
		this.setBackground(Color.WHITE); 
		this.setVisible(true); 
		MyWindowListener ml=new MyWindowListener(this); 		
		this.addWindowListener(ml); 
		MyMouseListener mml=new MyMouseListener(this);
		this.addMouseListener(mml);
	 } 
	 public void paint(Graphics g) 
	 { 
	   //g.setFont(new Font("Monospace",Font.BOLD,40 ));
	   
	   //g.drawString("Hello RK",250,250); 
	  
	   if(flag==0) 
	   { 
        g.setColor(Color.red); 
		 g.fillOval(this.getWidth()/2-100,this.getHeight()/2-100,200,200); 
	   } 
	   else 
	   { 
         g.setColor(Color.blue); 
		 g.fillOval(this.getWidth()/2-100,this.getHeight()/2-100,200,200); 
	   }
	 }
 } 
 
 class pro1 
 { 
   public static void main(String[]args) 
   { 
      Myframe mf=new Myframe();
   }
 } 
  
  class MyWindowListener extends WindowAdapter 
  { 
    Myframe obj;
	MyWindowListener(Myframe ref) 
	{ 
	  obj=ref;
	} 
	public void windowClosing(WindowEvent e) // WindowEvent e parameter is also impotant 
	{ 
	  obj.dispose();
	}
  }  
  class MyMouseListener extends MouseAdapter 
  {   
    Myframe var; 
	
    MyMouseListener(Myframe obj)
	{ 
	  var=obj; 
	} 
	
    public void mouseClicked(MouseEvent e) 
	{   
	  var.x=e.getButton(); 
	  if(var.x==1) 
	  {
		  
	  var.flag=0; 
	  } 
	  else if(var.x==3) 
	  { 
        var.flag=1;
	  } 
	  var.repaint();// this is imporatant after the every click we want to again the exection of the paint() method
	  System.out.println("This is the click"); 
	  
	}  
	
	
	
  }
  