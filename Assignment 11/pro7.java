/* Q7.WAP to find n th prime number.Your program must find n th prime for 3 different values of n.
Write first program using mainthread only.Calculate total time taken to find n th prime number
for 3 different values of n.Write second program in which you will start new thread to find 
n th prime number.Calculate total time taken in seconds*/ 
 

class pro7 
{
	public static void main(String[]args) 
	{   
	 
    
    if(isprime(4)) 
	{ 
         System.out.println(":-> is prime Number");
	}  
    else  
	{ 
        System.out.println(":-> is not prime Number");
	}  
	}	
	static boolean  isprime(int n)
	{ 
	    for(int i=2;i<=n-1;i++)
		{ 
	       if(n%i==0)
		   { 
	          return false;
		   }
		}
		return true;
	} 
	
	
	
}