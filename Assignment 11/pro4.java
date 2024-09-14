/* Q4.Define a class Popcorn having taste() method.Define 3 objecs of Popcorn out of which
two use default implementation.Third should be of salty taste.
Use anonymous Inner class. */ 
  
 import java.awt.*;
 class Popcorn 
 { 
    void taste()
	{ 
	  System.out.println("salty");
	}
 }  
 class pro4
 {
	 public static void main(String[]args)
	 {
		  Popcorn obj1=new Popcorn();
		  Popcorn obj2=new Popcorn(); 
		  obj1.taste();
		  obj2.taste(); 
		  Popcorn obj3=new Popcorn()
		  { 
		    void taste()
			{ 
			  System.out.println("sweet"+" The currentClass Name is:-> "+getClass().getName());
			}
		  }; 
          
          obj3.taste();	  
		  
		  
	 }
 }