/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication14;
import javax.swing.JOptionPane;
/**
 *
 * @author rohit
 */
public class pro2 extends javax.swing.JFrame
{

    /**
     * Creates new form pro2
     */
    public pro2()
    {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Input = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        Option = new javax.swing.JButton();
        Message = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 192, 238));

        jPanel2.setBackground(new java.awt.Color(13, 85, 158));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(0, 0, 51), new java.awt.Color(51, 0, 102)));
        jPanel2.setForeground(new java.awt.Color(100, 225, 75));

        Input.setBackground(new java.awt.Color(51, 192, 238));
        Input.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Input.setForeground(new java.awt.Color(33, 75, 25));
        Input.setText("Input");
        Input.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(51, 0, 102)));
        Input.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Input.setOpaque(true);
        Input.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                InputActionPerformed(evt);
            }
        });

        Confirm.setBackground(new java.awt.Color(51, 192, 238));
        Confirm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Confirm.setForeground(new java.awt.Color(33, 75, 25));
        Confirm.setText("Confirm");
        Confirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(51, 0, 102)));
        Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirm.setOpaque(true);
        Confirm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConfirmActionPerformed(evt);
            }
        });

        Option.setBackground(new java.awt.Color(51, 192, 238));
        Option.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Option.setForeground(new java.awt.Color(33, 75, 25));
        Option.setText("Option");
        Option.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(51, 0, 102)));
        Option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Option.setOpaque(true);
        Option.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OptionActionPerformed(evt);
            }
        });

        Message.setBackground(new java.awt.Color(51, 192, 238));
        Message.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Message.setForeground(new java.awt.Color(33, 75, 25));
        Message.setText("Message");
        Message.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 0, 255), new java.awt.Color(255, 255, 0)));
        Message.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Message.setOpaque(true);
        Message.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Option, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MessageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MessageActionPerformed
    {//GEN-HEADEREND:event_MessageActionPerformed
       String name;
        JOptionPane.showMessageDialog(this,"Welcome to Flight 2845Mumbai-Pune");
    }//GEN-LAST:event_MessageActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_InputActionPerformed
    {//GEN-HEADEREND:event_InputActionPerformed
        JOptionPane.showInputDialog("Enter your Seat Number");
    }//GEN-LAST:event_InputActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmActionPerformed
    {//GEN-HEADEREND:event_ConfirmActionPerformed
        
        //JOptionPane.showConfirmDialog(this, "Confirm your seat"); 
        int num=JOptionPane.showConfirmDialog(this, "Confirm your Leave your seat","Udaan",JOptionPane.YES_NO_OPTION); 
         
        if(num==JOptionPane.YES_OPTION)
        {
            this.dispose();
        } 
        
    }//GEN-LAST:event_ConfirmActionPerformed

    private void OptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OptionActionPerformed
    {//GEN-HEADEREND:event_OptionActionPerformed
        String str[]={"Economy class","Business Class","First class"};
        JOptionPane.showOptionDialog(this, "Choose Your flight option", "Akasha Airline", JOptionPane.YES_NO_OPTION ,JOptionPane.PLAIN_MESSAGE,null,str, null); 
        //JOptionPane.showConfirmDialog(rootPane, Message, title, WIDTH, HEIGHT, icon)
    }//GEN-LAST:event_OptionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(pro2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(pro2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(pro2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(pro2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new pro2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JButton Input;
    private javax.swing.JButton Message;
    private javax.swing.JButton Option;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}