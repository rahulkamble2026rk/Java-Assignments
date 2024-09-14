/*  
Q2.Write a program to print all available fonts in java.Store them in a file.Use different fonts in your application.*/ 
 
  
import java.awt.*;
import java.awt.event.*;
class pro2 
{
	public static void main(String[]args) 
	{
		String FontList[];
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
	    FontList=ge.getAvailableFontFamilyNames();
		System.out.println("Toatal Fonts"+FontList.length); 
		
		for(String str:FontList)
		{ 
	      System.out.println(str);
		}
	
		
	}
}
