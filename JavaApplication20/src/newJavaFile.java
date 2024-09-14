/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rohit
 */ 
import java.util.Scanner;
public class newJavaFile
{

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        int a=12; 
        int b=1313; 
        newJavaFile.show(a,b); 
        int num2[]=new int[3];   
        int num3[]=new int[3]; 
        int num4[]=new int[3]; 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num2.length;i++)
        {    
            System.out.println("Enter the number"+(i+1));
            num2[i]=sc.nextInt();
        } 
        for(int i=0;i<num3.length;i++)
        {    
            System.out.println("Enter the number"+(i+1));
            num3[i]=sc.nextInt();
        }
        for(int i=0;i<num4.length;i++)
        {    
            System.out.println("Enter the number"+(i+1));
            num4[i]=sc.nextInt();
        }
        newJavaFile.show(num2); 
        newJavaFile.show2(num2,num3,num4);
        
    } 
    public static void show(int...num)
    {
        for(int i:num)
        {
            System.out.println(i+" ");
        }
    }   
     
      public static void show2(int[]...num)     // when we pass the group of the array then at the time of the catching the use int[]...num because if if there is only one array or if we pass the number of the elements then automatically it is equaivalent to the 1d array !
    {
        for(int i[]:num)
        {     
             for(int j=0;j<i.length;j++) 
             {
                  System.out.println(i[j]+" ");
             } 
             System.out.println("Array Over");
           
        }
    }
}
