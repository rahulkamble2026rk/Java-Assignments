/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rohit
 */
public class Subtraction extends javax.swing.JFrame
{

    /**
     * Creates new form Subtraction
     */
    public Subtraction()
    {
        initComponents(); 
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panel2 = new java.awt.Panel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        button1 = new java.awt.Button();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(911, 677));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(14, 129, 203));

        textField1.setText("textField1");

        textField2.setBackground(new java.awt.Color(50, 201, 201));
        textField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textField2ActionPerformed(evt);
            }
        });
        textField2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                textField2KeyTyped(evt);
            }
        });

        textField3.setText("textField3");

        textField4.setBackground(new java.awt.Color(50, 201, 201));
        textField4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textField4.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                textField4KeyTyped(evt);
            }
        });

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(205, 54, 54));
        label1.setText("X=");

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(205, 54, 54));
        label2.setText("Y=");

        button1.setBackground(new java.awt.Color(35, 200, 97));
        button1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(205, 54, 54));
        button1.setLabel("Submit");
        button1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                button1ActionPerformed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(50, 201, 201));
        label3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        label4.setAlignment(java.awt.Label.RIGHT);
        label4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(205, 54, 54));
        label4.setText("Subtraction=");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textField2ActionPerformed
    {//GEN-HEADEREND:event_textField2ActionPerformed
        
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textField2KeyTyped
    {//GEN-HEADEREND:event_textField2KeyTyped
        char ch=evt.getKeyChar();
        if(Character.isDigit(ch)==false)
        {
            evt.consume();
        }
    }//GEN-LAST:event_textField2KeyTyped

    private void textField4KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textField4KeyTyped
    {//GEN-HEADEREND:event_textField4KeyTyped
        char ch=evt.getKeyChar();
        if(Character.isDigit(ch)==false)
        {
            evt.consume();
        }
    }//GEN-LAST:event_textField4KeyTyped

    private void button1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button1ActionPerformed
    {//GEN-HEADEREND:event_button1ActionPerformed
           
           if(this.textField2.getText().equals("")&& this.textField4.getText().equals("")) 
          { 
             this.label3.setText(""); 
          }
          else if(!(this.textField2.getText().equals("")) && this.textField4.getText().equals(""))
          { 
             this.label3.setText(this.textField2.getText()); 
          }
          
           else if(!(this.textField4.getText().equals("")) && this.textField2.getText().equals("") )
          { 
             this.label3.setText(this.textField4.getText()); 
          }
        else 
        {int x=Integer.parseInt(this.textField2.getText()); 
          int y=Integer.parseInt(this.textField4.getText());// this is used for the coversion of the string to int value
                                    
           int z=x-y;
           this.label3.setText(Integer.toString(z));
                }

    }//GEN-LAST:event_button1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Panel panel2;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
