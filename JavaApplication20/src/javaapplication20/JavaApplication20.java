/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;
import java.util.Scanner;
/**
 *
 * @author rohit
 */
public class JavaApplication20
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int num[][]; 
        num=new int[3][4]; 
        Scanner sc=new Scanner(System.in);
 
          int y=0;
         for(int x[]:num )
         {
             for(int i=0;i<=x.length-1;i++ ) 
             {   
                 System.out.println("Enter the "+(y+1)+" value");
                 x[i]=sc.nextInt(); 
                 y++;
             }
         }
//         for(int i=0;i<num.length;i++)
//        {
//            for(int j=0;j<num[i].length;j++) 
//            {
//                System.out.println(num[i][j]);
//            }
//        }  

         for(int x[]:num )
         {
             for(int i=0;i<=x.length-1;i++ ) 
             {   
                x[i]=-200; 
                 
             }
         }   
         
          for(int x[]:num )
         {
             for(int i=0;i<=x.length-1;i++ ) 
             {   
                 System.out.println( x[i]);
                
             }
         }
         
        
    }
    
}
