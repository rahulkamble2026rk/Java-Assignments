

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rohit
 */ 
  
class Container
{  
     boolean flag=true; 
     int no;
  
    synchronized public void produce(int num) throws InterruptedException
    {
        no=num;
        System.out.println("Producer produce "+no); 
        notifyAll();
        wait();
    }  
    synchronized public void consume()throws InterruptedException 
    {
        System.out.println("Consumer consume"+no); 
        notifyAll();
        wait();
    }
}  
 
class Producer extends Thread
{ 
    Container var; 
    Thread t;
    Producer(Container obj) 
    {
        var=obj; 
        t=new Thread(this);
    }  
    public void run() 
    { 
        int i=1; 
        
        while(var.flag) 
        { 
            try
            {
                Thread.sleep(10); 
                var.produce(i);
            } 
            catch(InterruptedException e) 
            {
                
            }
           i++;
        } 
    } 
    void startThread() 
    {
        t.start();
    }
} 
class Consumer extends Thread
{
    Container var; 
    Thread t;
    Consumer(Container obj)
    {
        var=obj;
        t=new Thread(this);
        
    }   
    public void run() 
    {
        while(var.flag)
        {
            try
            {
                Thread.sleep(10); 
                var.consume();
            }catch(InterruptedException e)
            {
                
            }
        }
    }
    void startThread() 
    { 
       t.start();
        
    }
    
}
public class pro4 
{
    public static void main(String args[]) throws InterruptedException
    {
       Container obj=new Container(); 
       Producer pro=new Producer(obj);
       Consumer con=new Consumer(obj); 
       pro.startThread();
       con.startThread(); 
       Thread.sleep(500);
       obj.flag=false;
       obj.flag=false;
       
    }
}
