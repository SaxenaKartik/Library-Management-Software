 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class New_Registration_form extends javax.swing.JFrame {
  
    /**
     * Creates new form Front_Page
     */
    public New_Registration_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Registration");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 410, 160, 60);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 90, 120, 50);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Library Card Number :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 150, 141, 50);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 90, 180, 50);

        jTextField2.setEditable(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 150, 180, 50);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 210, 110, 50);

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 210, 180, 50);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Address :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 280, 110, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 270, 180, 110);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registration Form");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 40, 400, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(60, 80, 320, 10);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/home 1.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 390, 110, 100);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 330, 480);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/!!!!.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, -50, 800, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a1=jTextField1.getText();
String b=jTextField2.getText();
String c=jTextField3.getText();
String d=jTextArea1.getText();
if(a1.isEmpty()||c.isEmpty()||d.isEmpty())
{
    JOptionPane.showMessageDialog(this,"Information required");
}
else
{
        try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","mysql");
    Statement stmt=con.createStatement();
    String s="insert into Registered_issuers(Name_of_issuer,LibraryCard_Number,Phone_numbers,Address,Date_Registration) values ('"+a1+"','"+b+"','"+c+"','"+d+"',curdate());";
    int p=stmt.executeUpdate(s);
    if(p==1)
    { JOptionPane.showMessageDialog(this,"Successful Registration");
    int i=JOptionPane.showConfirmDialog(this,"Would you like to issue a book?","Message",JOptionPane.YES_NO_OPTION);
   if(i==0)
   {String f=jTextField2.getText();
       Issue_book ob= new Issue_book(f);
     ob.setVisible(true);
     this.dispose();
   } 
   else if(i==1)
           {Front_Page ob= new Front_Page();
     ob.setVisible(true);
     this.dispose();
           }
    }
    stmt.close();
    con.close();
}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 try
{   Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","mysql");
    Statement stmt=con.createStatement();
    Statement stmt1=con.createStatement();
    String s="select LibraryCard_Number from Registered_issuers";
    ResultSet rs=stmt1.executeQuery(s);
    ResultSet rs1=stmt.executeQuery(s);
    rs1.first();
    String k1=rs1.getString(1);
    while(rs.next())
    {
        if(rs.last())
        {
    String a=rs.getString(1);
    String a1=a.substring(1);
    int k=Integer.parseInt(a1);
    k=k+1;
    if(k<10)
    {
    jTextField2.setText("L0"+Integer.toString(k));
    }
    else
    {
        jTextField2.setText("L"+Integer.toString(k));
    }
            
    }
    }
    stmt.close();
    con.close();
                }
                catch(Exception e2)
                {
                    if(e2.getMessage().equals("Illegal operation on empty result set."))
                            {
                                jTextField2.setText("L01");
                            }
                    else
                    {
                        JOptionPane.showMessageDialog(null,e2.getMessage());
                    }
                    
                }          // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Front_Page k=new Front_Page();
k.playSound();
Front_Page ob=new Front_Page();
ob.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
String s=jTextField1.getText();    
int l=s.length();
if(s.isEmpty()==false)
{
for(int i=0;i<l;i++)
{
    char ch=s.charAt(i);
    if(Character.isLetter(ch)==false)
    {
        if(ch==' ')
        {
           continue; 
        }
        JOptionPane.showMessageDialog(this,"Name must be in alphabets");
        jTextField1.setText("");
        break;
    }
}
}
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
String s=jTextField3.getText();    
int l=s.length();
if(l!=10)
{
    JOptionPane.showMessageDialog(this,"Incorrect Phone Number");
    jTextField3.setText("");
}
else
{
if(s.isEmpty()==false)
{
for(int i=0;i<l;i++)
{
    char ch=s.charAt(i);
    if(Character.isDigit(ch)==false)
    {
        JOptionPane.showMessageDialog(this,"Phone Number must be in digits");
        jTextField3.setText("");
        break;
    }
}
}
}// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(New_Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Registration_form().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
