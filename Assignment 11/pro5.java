/* Q5.Define an interface Popcorn having taste() method.Create 2 objects,one is of sweet taste
and another must be of salty taste.
Define a show() method.Define anonymous inner class at actual parameter list of show()
to pass object as a parameter which is sweet in taste.
*/  
interface Popcorn 
{ 
   abstract void taste();
} 
class chopcorn implements Popcorn
{  
   public void taste() // override the method taste () 
   { 
     System.out.println("salty taste");
   } 
 public void show(chopcorn obj) 
   {
	    obj.taste();
   }   
}
 
class pro5 extends chopcorn
{ 
  public static void main(String[]args) 
   { 
      chopcorn obj=new chopcorn();
	  obj.taste();  
	  chopcorn obj2=new chopcorn();
	  obj2.taste(); 
	  obj.show(new chopcorn()
				{ 
	              public  void taste() 
				   { 
				    System.out.println("sweet");
				   }
				}); 
           				
	    
		  
   }    
  
   
}