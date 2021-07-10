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
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author -e-
 */
public class BorrowingBooks extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Connection conn;
    PreparedStatement pst, pst1;
    String s;
    public BorrowingBooks() {
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
        memberName = new javax.swing.JTextField();
        bookISBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        memberNIC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        bookName = new javax.swing.JTextField();
        bookStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCopies = new javax.swing.JTextField();
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

        memberName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        memberName.setForeground(new java.awt.Color(102, 102, 102));
        memberName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        memberName.setText("Member Name");
        memberName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        memberName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        memberName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                memberNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                memberNameFocusLost(evt);
            }
        });
        jPanel3.add(memberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, 50));

        bookISBN.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bookISBN.setForeground(new java.awt.Color(102, 102, 102));
        bookISBN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookISBN.setText("Book ISBN");
        bookISBN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        bookISBN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookISBNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookISBNFocusLost(evt);
            }
        });
        jPanel3.add(bookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 320, 50));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 652, 24, 24));

        memberNIC.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        memberNIC.setForeground(new java.awt.Color(102, 102, 102));
        memberNIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        memberNIC.setText("Member NIC");
        memberNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        memberNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                memberNICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                memberNICFocusLost(evt);
            }
        });
        jPanel3.add(memberNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 320, 50));

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

        jDate.setBackground(new java.awt.Color(255, 255, 255));
        jDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        jDate.setToolTipText("Date of Birth");
        jDate.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateMouseEntered(evt);
            }
        });
        jPanel3.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 320, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Due Date");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 51, 0));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Borrowing");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(60, 60, 60))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 270, 60));

        bookName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bookName.setForeground(new java.awt.Color(102, 102, 102));
        bookName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookName.setText("Book Name");
        bookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        bookName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookNameFocusLost(evt);
            }
        });
        jPanel3.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 50));

        bookStatus.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bookStatus.setForeground(new java.awt.Color(102, 102, 102));
        bookStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Borrowed" }));
        bookStatus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        bookStatus.setOpaque(false);
        jPanel3.add(bookStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 320, 50));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Book availability");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        txtCopies.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtCopies.setForeground(new java.awt.Color(102, 102, 102));
        txtCopies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCopies.setText("Number of copies");
        txtCopies.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 102, 0)));
        jPanel3.add(txtCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 320, 50));

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
        kGradientPanel2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, -10, -1, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devint/r/previous.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 90, 40));

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

    private void memberNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberNameFocusGained
        // TODO add your handling code here:
        memberName.setText("");
    }//GEN-LAST:event_memberNameFocusGained

    private void bookISBNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookISBNFocusGained
        // TODO add your handling code here:
        bookISBN.setText("");
    }//GEN-LAST:event_bookISBNFocusGained

    private void memberNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberNICFocusGained
        // TODO add your handling code here:
        memberNIC.setText("");
    }//GEN-LAST:event_memberNICFocusGained
    
        
    
    
    private void memberNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberNameFocusLost
        // TODO add your handling code here:
        String adminname=memberName.getText();
        if(adminname.equals("")){
            memberName.setText("Username");
        
        }
    }//GEN-LAST:event_memberNameFocusLost

    private void memberNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memberNICFocusLost
        // TODO add your handling code here:
        String adminnic = memberNIC.getText();
        if(adminnic.equals("")){
            memberNIC.setText("Member NIC");
        }
    }//GEN-LAST:event_memberNICFocusLost

    private void bookISBNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookISBNFocusLost
        // TODO add your handling code here:
        String adminaddress = bookISBN.getText();
        if(adminaddress.equals("")){
            bookISBN.setText("Book ISBN");
    }
    }//GEN-LAST:event_bookISBNFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String membername = memberName.getText();
        String membernic = memberNIC.getText();
        String bookname = bookName.getText();
        String bookisbn = bookISBN.getText();
        if (bookname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (bookisbn.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if (membername.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else if(membernic.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill Required fields");
        }
        else
        {
            String sql = "INSERT INTO borrwed_books (member_name, member_nic, book_name, book_isbn, book_status, due_date) VALUES (?,?,?,?,?,?)";
            String sql1 = "UPDATE book_registration SET no_of_copies = no_of_copies - 1";
            SimpleDateFormat sdf = new SimpleDateFormat("YYY-MM-DD");
            String duedate = sdf.format(jDate.getDate());
            try
            {
                pst = conn.prepareStatement(sql);
                pst1 = conn.prepareStatement(sql1);
                //InputStream is = new FileInputStream(new File(s));
                pst.setString(1, memberName.getText());
                pst.setString(2, memberNIC.getText());
                pst.setString(3, bookName.getText());
                pst.setString(4, bookISBN.getText());
                pst.setString(5, bookStatus.getSelectedItem().toString());
                pst.setString(6, duedate);
                pst.execute();
                pst1.execute();
                JOptionPane.showMessageDialog(null, "Successfully added!!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                
            }
            memberName.setText(null);
            memberNIC.setText(null);
            bookName.setText(null);
            bookISBN.setText(null);
            txtCopies.setText(null);
            jDate.setDate(null);
            bookStatus.setSelectedItem(1);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateMouseEntered

    private void bookNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookNameFocusGained
        bookName.setText("");
    }//GEN-LAST:event_bookNameFocusGained

    private void bookNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookNameFocusLost
         String adminnic = bookName.getText();
        if(adminnic.equals("")){
            bookName.setText("Book Name");
        }
     
    }//GEN-LAST:event_bookNameFocusLost

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        LibrarianMenue1 lb1 = new LibrarianMenue1();
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
            java.util.logging.Logger.getLogger(BorrowingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowingBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BorrowingBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookISBN;
    private javax.swing.JTextField bookName;
    private javax.swing.JComboBox<String> bookStatus;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField memberNIC;
    private javax.swing.JTextField memberName;
    private javax.swing.JTextField txtCopies;
    // End of variables declaration//GEN-END:variables
}
