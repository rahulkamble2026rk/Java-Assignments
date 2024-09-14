/* Q3.Create 3 checkboxes on you frame.WINDOWS,LINUX and MACOS.
Create a lable.Label must display only selected operating systems.
Use Panels also to make your design better.
e.g. Ig you have selected WINDOWS and LINUX,then label must display
"WINDOWS LINUX".*/  

import java.awt.*;
import java.awt.event.*;

class Myframe3 extends Frame
{ 
    Panel pnl3; 
    Checkbox chk1,chk2,chk3; 
    Label lbl3;
    Myframe3()
    { 
        Font f=new Font("arial",Font.TYPE1_FONT,20);
        setSize(1000,1000);
        setTitle("pro3");
        setLocationRelativeTo(null);
        setBackground(Color.YELLOW);   
        setLayout(null);
        Myframe3 ref=this; 
         
        pnl3=new Panel(); 
        pnl3.setBounds(100,100,870,700); 
        pnl3.setBackground(Color.GRAY);
        pnl3.setForeground(Color.red);  
        pnl3.setLayout(null);
        
        chk1=new Checkbox("Windows"); 
        chk1.setBounds(0,100,150,75);
        chk1.setBackground(Color.blue); 
        chk1.setForeground(Color.WHITE);  
        chk1.setFont(f);
         
        chk2=new Checkbox("LINUX"); 
        chk2.setBounds(0,chk1.getHeight()+chk1.getY()+40,150,75);
        chk2.setBackground(Color.RED); 
        chk2.setForeground(Color.WHITE);  
        chk2.setFont(f); 
         
        chk3=new Checkbox("MACOS"); 
        chk3.setBounds(0,chk2.getHeight()+chk2.getY()+40,150,75);
        chk3.setBackground(Color.green); 
        chk3.setForeground(Color.WHITE);  
        chk3.setFont(f);
        
        lbl3=new Label("Nothing");
        lbl3.setBounds(300,chk1.getHeight()+chk1.getY()+20,600,100);
        lbl3.setBackground(Color.white);
        lbl3.setForeground(Color.BLACK); 
        lbl3.setFont(f); 
        
        WindowAdapter obj=new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
               ref.dispose();
            }
        }; 
        
        
       
        MyItemListener3 itm=new MyItemListener3(this); 
        
        
        setVisible(true); 
        pnl3.add(chk1); 
        pnl3.add(chk2);
        pnl3.add(chk3);  
        pnl3.add(lbl3);
        this.add(pnl3); 
        chk1.addItemListener(itm); 
        chk2.addItemListener(itm);
        chk3.addItemListener(itm); 
        this.addWindowListener(obj);
    }
} 
class pro3 
{
    public static void main(String[] args)
    {
        Myframe3 var=new Myframe3();
    }
} 
 
class MyItemListener3 implements ItemListener 
{  
    Myframe3 obj;
    MyItemListener3(Myframe3 var)
    {
        obj=var;
    }
    public void itemStateChanged(ItemEvent e)
    {   
         
        /*if(obj.chk1==e.getSource()) 
        {  
            if(obj.chk1.getState()==true) 
            {
            obj.lbl3.setText(obj.chk1.getLabel()); 
            }
        }
        if(obj.chk2==e.getSource())
        { 
            if(obj.chk2.getState()==true) 
            {
            obj.lbl3.setText(""+obj.chk2.getLabel());
            }
           
        }
        if(obj.chk3==e.getSource())
        {
           if(obj.chk3.getState()==true) 
            {
           obj.lbl3.setText(""+obj.chk3.getLabel());
            }
        }
        */   
         
         String selectedOS = "";
        if (obj.chk1.getState()) {
            selectedOS += obj.chk1.getLabel() + " ";
        }
        if (obj.chk2.getState()) {
            selectedOS += obj.chk2.getLabel() + " ";
        }
        if (obj.chk3.getState()) {
            selectedOS += obj.chk3.getLabel() + " ";
        }
        obj.lbl3.setText(selectedOS.trim());
    }
} 



 