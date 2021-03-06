/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepustakaan.ui;
import java.util.logging.*;
import perpustakaan.model.Buku;
import java.sql.*;
import javax.swing.JOptionPane;
import perpustakaan.helper.*;

/**
 *
 * @author Arif
 */
public class AddBookJFrame extends javax.swing.JFrame {
    String formTitle = "";
    String penerbit = "";
    int bukuID = 0;
    Buku bukuGlobal;
    /**
     * Creates new form AddBookJFrame
     */
    public AddBookJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public AddBookJFrame(String title, int id){
        initComponents();
        setLocationRelativeTo(null);
        addBookLable.setText(title);
        formTitle = title;
        bukuID = id;
        
        try {
            setBookToComponent(bukuID);
        } catch (SQLException ex) {
            Logger.getLogger(AddBookJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showMessage(String message, int type){
        if (type == 1){
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean validateInput() throws SQLException{
        boolean isCompleted = false;
        Buku buku = new Buku();
        //Judul Buku
        if (bookTitleField.getText().isEmpty()) {
            isCompleted = false;
            bookTitleField.requestFocus();
        } else {
            buku.setJudul_buku(bookTitleField.getText());
            isCompleted = true;
        }
        //Nama Pengarang
        if (bookAuthorField.getText().isEmpty()) {
            isCompleted = false;
            bookAuthorField.requestFocus();
        } else {
            buku.setPengarang(bookAuthorField.getText());
            isCompleted = true;
        }
        //Radio Button
        if (jbrPustakaRadBtn.isSelected()) {
            buku.setPenerbit(jbrPustakaRadBtn.getText());
            isCompleted = true;
        } else if (gramediaRadBtn.isSelected()) {
            buku.setPenerbit(gramediaRadBtn.getText());
            isCompleted = true;
        } else if (polijePressRadBtn.isSelected()) {
            buku.setPenerbit(polijePressRadBtn.getText());
            isCompleted = true;
        } else if (rriLibRadBtn.isSelected()) {
            buku.setPenerbit(rriLibRadBtn.getText());
            isCompleted = true;
        } else {
            isCompleted = false;
        }
        
        buku.setTahun_terbit(Integer.parseInt(thnTerbitComboBox.getSelectedItem().toString()));
        if (formTitle.equalsIgnoreCase("Update Buku")) {
            buku.setId_buku(bukuID);
        }
        bukuGlobal = buku;
        if (!isCompleted) {
            showMessage("Data harus dilengkapi!", 2);
            return false;
        } else {
            dispose();
            return true;
        }
    }
    
    private void setBookToComponent(int bookID) throws SQLException {
        Buku buku = bukuManager.showBook(bookID);
        buku.setId_buku (bookID);
        bookTitleField.setText(buku.getJudul_buku());
        bookAuthorField.setText(buku.getPengarang());
        thnTerbitComboBox.setSelectedItem(String.valueOf(buku.getTahun_terbit()));
        
        if (buku.getPenerbit().equalsIgnoreCase("jember pustaka")){
            jbrPustakaRadBtn.setSelected(true);
        } else if (buku.getPenerbit().equalsIgnoreCase("gramedia")) {
            gramediaRadBtn.setSelected(true);
        } else if (buku.getPenerbit().equalsIgnoreCase("polije press")) {
            polijePressRadBtn.setSelected(true);
        } else {
            rriLibRadBtn.setSelected(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bookTitleField = new javax.swing.JTextField();
        bookAuthorField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbrPustakaRadBtn = new javax.swing.JRadioButton();
        polijePressRadBtn = new javax.swing.JRadioButton();
        gramediaRadBtn = new javax.swing.JRadioButton();
        rriLibRadBtn = new javax.swing.JRadioButton();
        thnTerbitComboBox = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        addBookLable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addBookLable.setText("Tambah Buku");

        jLabel1.setText("Judul");

        jLabel2.setText("Pengarang");

        jLabel3.setText("Penerbit");

        jLabel4.setText("Tahun terbit");

        jbrPustakaRadBtn.setText("Jember Pustaka");

        polijePressRadBtn.setText("Polije Press");

        gramediaRadBtn.setText("Gramedia");

        rriLibRadBtn.setText("RRI Library");

        thnTerbitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        submitBtn.setText("Simpan");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addBookLable))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gramediaRadBtn)
                                    .addComponent(jbrPustakaRadBtn))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(polijePressRadBtn)
                                    .addComponent(rriLibRadBtn)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bookTitleField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(bookAuthorField, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(submitBtn))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(thnTerbitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookLable)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbrPustakaRadBtn)
                    .addComponent(polijePressRadBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gramediaRadBtn)
                    .addComponent(rriLibRadBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(thnTerbitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (formTitle.equalsIgnoreCase("Update Buku")) {
            try {
                if (validateInput()) {
                    bukuManager.updateBook(bukuGlobal);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddBookJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                if (validateInput()) {
                    bukuManager.insertBook(bukuGlobal);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddBookJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddBookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBookLable;
    private javax.swing.JTextField bookAuthorField;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JRadioButton gramediaRadBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jbrPustakaRadBtn;
    private javax.swing.JRadioButton polijePressRadBtn;
    private javax.swing.JRadioButton rriLibRadBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> thnTerbitComboBox;
    // End of variables declaration//GEN-END:variables
}
