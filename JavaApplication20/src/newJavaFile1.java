/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rohit
 */  
// creating our own package:  

import static java.lang.System.out;  

abstract class newJavaFile1
{
    public static void main(String args[])
    {
        System.out.println("Hello Dude"); 
        child obj=new child();  
        obj.show();
    } 
    abstract public void show(); // abstract method does not have the body, we use the abstract when we don't know the implemnetation or the implemnetatin is the incomplete
}
 
class child extends newJavaFile1 
{
    public void show()
    {
        System.out.println("this is the implementation of the abstract");
    }
}