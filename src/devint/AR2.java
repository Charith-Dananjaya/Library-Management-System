/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devint;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author -e-
 */
public class AR2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Connection conn;
    PreparedStatement pst;
    String s;
    public AR2() {
        initComponents();
        conn = SQLCON.connect();
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
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        adminName = new javax.swing.JTextField();
        adminAddress = new javax.swing.JTextField();
        adminEmail = new javax.swing.JTextField();
        adminNIC = new javax.swing.JTextField();
        adminPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        imgagelbl1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1500, 1000));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adminName.setForeground(new java.awt.Color(102, 102, 102));
        adminName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminName.setText("Username");
        adminName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 255)));
        adminName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adminName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminNameFocusLost(evt);
            }
        });
        jPanel3.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 320, 40));

        adminAddress.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adminAddress.setForeground(new java.awt.Color(102, 102, 102));
        adminAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminAddress.setText("Address");
        adminAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 255)));
        adminAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminAddressFocusLost(evt);
            }
        });
        jPanel3.add(adminAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 516, 320, 40));

        adminEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adminEmail.setForeground(new java.awt.Color(102, 102, 102));
        adminEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminEmail.setText("Email");
        adminEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 255)));
        adminEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminEmailFocusLost(evt);
            }
        });
        adminEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEmailActionPerformed(evt);
            }
        });
        jPanel3.add(adminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 562, 320, 40));

        adminNIC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adminNIC.setForeground(new java.awt.Color(102, 102, 102));
        adminNIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminNIC.setText("NIC");
        adminNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 255)));
        adminNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminNICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminNICFocusLost(evt);
            }
        });
        jPanel3.add(adminNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 390, 320, 40));

        adminPassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        adminPassword.setForeground(new java.awt.Color(102, 102, 102));
        adminPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminPassword.setText("Password");
        adminPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 253)));
        adminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(adminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 608, 320, 38));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 652, 24, 24));

        jCheckBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 253)));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 661, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/verify.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 703, 111, 87));

        imgagelbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 253)));
        jPanel3.add(imgagelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 119, 233, 145));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Add Profile picture");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 253)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 282, 131, 33));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 253)));
        jDateChooser2.setToolTipText("Date of Birth");
        jDateChooser2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDateChooser2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseEntered(evt);
            }
        });
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 448, 320, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Date Of Birth");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 494, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 51, 0));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin Registration");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel3.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 38, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/panel2back.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 790));

        kGradientPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 420, -1));

        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/close.png"))); // NOI18N
        closebtn.setBorder(null);
        closebtn.setContentAreaFilled(false);
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, -20, -1, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/previous.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/backgroundnew.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        jPanel2.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(1355, 850));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNameFocusGained
        // TODO add your handling code here:
        adminName.setText("");
    }//GEN-LAST:event_adminNameFocusGained

    private void adminAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminAddressFocusGained
        // TODO add your handling code here:
        adminAddress.setText("");
    }//GEN-LAST:event_adminAddressFocusGained

    private void adminEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminEmailFocusGained
        // TODO add your handling code here:
        adminEmail.setText("");
    }//GEN-LAST:event_adminEmailFocusGained

    private void adminEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEmailActionPerformed

    private void adminNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNICFocusGained
        // TODO add your handling code here:
        adminNIC.setText("");
    }//GEN-LAST:event_adminNICFocusGained

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            adminPassword.setEchoChar((char)0);
        }
        else{
            adminPassword.setEchoChar('*');
        
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             imgagelbl1.setIcon(ResizeImage(path));
             s = path;
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(imgagelbl1.getWidth(), imgagelbl1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }            
    
    
    private void adminNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNameFocusLost
        // TODO add your handling code here:
        String adminname=adminName.getText();
        if(adminname.equals("")){
            adminName.setText("Username");
        
        }
    }//GEN-LAST:event_adminNameFocusLost

    private void adminNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminNICFocusLost
        // TODO add your handling code here:
        String adminnic = adminNIC.getText();
        if(adminnic.equals("")){
            adminNIC.setText("NIC");
        }
    }//GEN-LAST:event_adminNICFocusLost

    private void adminAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminAddressFocusLost
        // TODO add your handling code here:
        String adminaddress = adminAddress.getText();
        if(adminaddress.equals("")){
            adminAddress.setText("Address");
    }
    }//GEN-LAST:event_adminAddressFocusLost

    private void adminEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminEmailFocusLost
        // TODO add your handling code here:
        String adminemail = adminEmail.getText();
        if(adminemail.equals("")){
            adminEmail.setText("Email");
        }
    }//GEN-LAST:event_adminEmailFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String adminname = adminName.getText();
        String adminnic = adminNIC.getText();
        String admindob = jDateChooser2.getDateFormatString();
        String adminaddress = adminAddress.getText();
        String adminemail = adminEmail.getText();
        String adminpassword = adminPassword.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        
        
        if (adminname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (adminnic.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (admindob.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (adminaddress.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(adminemail.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(adminpassword.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else
        {
            String adminDOB = sdf.format(jDateChooser2.getDate());
            String sql = "INSERT INTO admin_registration (admin_name,admin_nic,admin_dob,admin_address,admin_email,admin_password,admin_image) VALUES (?,?,?,?,?,?,?)";
            try 
            {
                pst = conn.prepareStatement(sql);
                InputStream is = new FileInputStream(new File(s));
                pst.setString(1, adminName.getText());
                pst.setString(2, adminNIC.getText());
                pst.setString(3, adminDOB);
                pst.setString(4, adminAddress.getText());
                pst.setString(5, adminEmail.getText());
                pst.setString(6, adminPassword.getText());
                pst.setBlob(7,is);
                //JOptionPane.showMessageDialog(null, "Seccessfully Added!!");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Added!!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
            }
        }
        
        
        adminName.setText(null);
        adminNIC.setText(null);
        //adminDOB.setText(null);
        adminAddress.setText(null);
        adminEmail.setText(null);
        adminPassword.setText(null);
        jDateChooser2.setDate(null);
        imgagelbl1.setIcon(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseEntered

    private void adminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPasswordActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        MainMenue2 lb1 = new MainMenue2();
        lb1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AR2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AR2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminAddress;
    private javax.swing.JTextField adminEmail;
    private javax.swing.JTextField adminNIC;
    private javax.swing.JTextField adminName;
    private javax.swing.JPasswordField adminPassword;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel imgagelbl1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
