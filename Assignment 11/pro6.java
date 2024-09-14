/* Q6.Create 2 threads in main().Both set on same object.
One thread will print 1 to 10 and another must print 11 to 20.*/ 
  
 
 class Mythread extends Thread 
 {  
     int x=1;
   synchronized public void run()
	{ 
	   int i;
	   
	   for(i=1;i<=10;i++) 
	   { 
			System.out.println(Thread.currentThread().getName()+"->"+x); 
			x++;
	   }
	}
 }
 class pro6 
 {
	 public static void main(String[]args)
	 {
		Mythread obj1=new Mythread();
		Thread t1=new Thread(obj1,"obj1");  
		Thread t2=new Thread(obj1,"obj2");  
        t1.start();
        t2.start();		
		
	 }
 }