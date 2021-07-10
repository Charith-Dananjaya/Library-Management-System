/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devint;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author -e-
 */
public class SL2 extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;
    
    String s;
    public SL2() {
        initComponents();
        conn = SQLCON.connect();
        jTable1Load();
    }

    private void jTable1Load(){
        int c;
        try {
            pst = conn.prepareStatement("select lib_name, lib_nic, lib_dob, lib_address, lib_email,  lib_password from librarian_registration;");
            rs = pst.executeQuery();
           
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
           
//** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=c; i++)
              {
              v2.add(rs.getString("lib_name"));
              v2.add(rs.getString("lib_nic"));
              v2.add(rs.getString("lib_dob"));
              v2.add(rs.getString("lib_address"));
              v2.add(rs.getString("lib_email"));
              v2.add(rs.getString("lib_password"));
                                     
              }
             d.addRow(v2);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(SL2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jEditDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        InquiryViewbtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
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

        txtName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setText("Username");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, 40));

        txtAddress.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(102, 102, 102));
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setText("Address");
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 320, 40));

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 320, 40));

        txtNIC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtNIC.setForeground(new java.awt.Color(102, 102, 102));
        txtNIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNIC.setText("NIC");
        txtNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        txtNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNICFocusLost(evt);
            }
        });
        jPanel3.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 320, 40));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 320, 38));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 652, 24, 24));

        jCheckBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 253)));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, -1, -1));

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 700, 111, 87));

        jEditDate.setBackground(new java.awt.Color(255, 255, 255));
        jEditDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        jEditDate.setToolTipText("Date of Birth");
        jEditDate.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jEditDate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jEditDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEditDateMouseEntered(evt);
            }
        });
        jPanel3.add(jEditDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 320, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Date Of Birth");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 51, 0));
        kGradientPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name or NIC");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(20, 0, 138, 32);

        jPanel3.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Username");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("NIC");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Email");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Password");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "NIC", "DOB", "Address", "Email", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 490, 440));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 330, 40));

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 51, 0));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Librarian Search");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(165, 165, 165))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 620, 70));

        jLabel11.setText("Update");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 770, -1, -1));

        InquiryViewbtn.setBackground(new java.awt.Color(255, 255, 255));
        InquiryViewbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/View.png"))); // NOI18N
        InquiryViewbtn.setBorder(null);
        InquiryViewbtn.setBorderPainted(false);
        InquiryViewbtn.setContentAreaFilled(false);
        InquiryViewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InquiryViewbtnActionPerformed(evt);
            }
        });
        jPanel3.add(InquiryViewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, 90, 70));

        jLabel13.setText("show");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 770, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/panel2searchback.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 790));

        kGradientPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 1000, -1));

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
        kGradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 90, 40));

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

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        txtName.setText("");
    }//GEN-LAST:event_txtNameFocusGained

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
        txtAddress.setText("");
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICFocusGained
        // TODO add your handling code here:
        txtNIC.setText("");
    }//GEN-LAST:event_txtNICFocusGained

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            txtPassword.setEchoChar((char)0);
        }
        else{
            txtPassword.setEchoChar('*');
        
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    
    
    
    
    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        String adminname=txtName.getText();
        if(adminname.equals("")){
            txtName.setText("Username");
        
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNICFocusLost
        // TODO add your handling code here:
        String adminnic = txtNIC.getText();
        if(adminnic.equals("")){
            txtNIC.setText("NIC");
        }
    }//GEN-LAST:event_txtNICFocusLost

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
        String adminaddress = txtAddress.getText();
        if(adminaddress.equals("")){
            txtAddress.setText("Address");
    }
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        String adminemail = txtEmail.getText();
        if(adminemail.equals("")){
            txtEmail.setText("Email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String libname = txtName.getText();
        String librariannic = txtNIC.getText();
        String librariandob = jEditDate.getDateFormatString();
        String librarianaddress = txtAddress.getText();
        String librarianemail = txtEmail.getText();
        String librarianpassword = txtPassword.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("YYY-MM-DD");
        
        EmailValidator emailValidator = new EmailValidator();
        
        IdentyCardValidator identiyCardValidator = new IdentyCardValidator();
        
        //Sending Email creating the message body
            final String FromEmail = "bookhubworld69@gmail.com";
            final String FromEmailPassword = "cb007874";
            String Subjects = "Book Hub Library Management System";
           
           
           
            Properties properties = new Properties();
           
            properties.put("mail.smtp.starttls.enable","true");
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.port","587");
           
            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
            {
                @Override
                protected PasswordAuthentication getPasswordAuthentication()
                {
                    return new PasswordAuthentication(FromEmail,FromEmailPassword);
                }
               
            });
        //_______________________________________
        
        
        if (libname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (!identiyCardValidator.validate(librariannic.trim()))
        {
            JOptionPane.showMessageDialog(null, "Input a valid ID number");
        }
        else if (librariandob.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (librarianaddress.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (!emailValidator.validate(librarianemail.trim()))
        {
            JOptionPane.showMessageDialog(null, "Input Correct Email Format");
        }
        else if(librarianpassword.equals("")){
            JOptionPane.showMessageDialog(null, "Fill Reuired Fields");
        }
        else
        {
            try
            {
                String memberDOB = sdf.format(jEditDate.getDate());                
                String sql = "update librarian_registration set lib_name = ?, lib_nic = ?, lib_dob = ?, lib_address = ?, lib_email = ?, lib_password = ? where lib_nic = '"+librariannic+"'";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtName.getText());
                pst.setString(2, txtNIC.getText());
                pst.setString(3, memberDOB);
                pst.setString(4, txtAddress.getText());
                pst.setString(5, txtEmail.getText());
                pst.setString(6, txtPassword.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully updated.");
                
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(FromEmail));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(librarianemail));
                message.setSubject(Subjects);
                //message.setText();
                message.setText( "Hi " + libname + "! "+"Your details have been successfully updated.");
                Transport.send(message);
                
                jTable1Load();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jEditDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jEditDateMouseEntered

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void InquiryViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InquiryViewbtnActionPerformed
      int c;
        String libNIC = txtSearch.getText();
        try {
            pst = conn.prepareStatement("select * from librarian_registration where lib_nic ='"+libNIC+"' or lib_name='"+libNIC+"'");
            rs = pst.executeQuery();
           
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
           
//** While loop for load the data
            while(rs.next())
            {
              Vector v2 = new Vector();
              for(int i=1; i<=c; i++)
              {
              v2.add(rs.getString("lib_name"));
              v2.add(rs.getString("lib_nic"));
              v2.add(rs.getString("lib_dob"));
              v2.add(rs.getString("lib_address"));
              v2.add(rs.getString("lib_email"));
              v2.add(rs.getString("lib_password"));
                                     
              }
             d.addRow(v2);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(SL2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InquiryViewbtnActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String libNIC = txtSearch.getText();

       if (libNIC.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Input valid details");
        }
        else{
            try
            {
                Statement st = conn.createStatement();

                String sql = "select * from librarian_registration where lib_name ='"+libNIC+"' or lib_nic = '"+libNIC+"'";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next())
                {
                    //JOptionPane.showMessageDialog(null, "Invalid NIC");
                    String libnic = rs.getString("lib_nic");
                    txtNIC.setText(libnic);
                    String libname = rs.getString("lib_name");
                    txtName.setText(libname);
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
                    String libDOB = rs.getString("lib_dob");
                    java.util.Date libdob = sdf.parse(libDOB);
                    jEditDate.setDate((java.util.Date)libdob);
                    String libaddress = rs.getString("lib_address");
                    txtAddress.setText(libaddress);
                    String libemail = rs.getString("lib_email");
                    txtEmail.setText(libemail);
                    String libpassword = rs.getString("lib_password");
                    txtPassword.setText(libpassword);
                }

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        AdminMenue1 adm = new AdminMenue1();
        adm.setVisible(true);
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
            java.util.logging.Logger.getLogger(SL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SL2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new SL2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InquiryViewbtn;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jEditDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
