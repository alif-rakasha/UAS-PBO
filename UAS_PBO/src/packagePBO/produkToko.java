package packagePBO;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class produkToko extends javax.swing.JFrame {
    
    private void form_empty(){
        txtKode.setEditable(true);
        txtKode.setText(null);
        txtNama.setText(null);
        cbKategori.setSelectedItem(this);
        txtProdusen.setText(null);
        txtDesc.setText(null);
        txtHarga.setText(null);
    }
    
    private void display_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Kategori Produk");
        model.addColumn("Nama Produsen");
        model.addColumn("Deskripsi Produk");
        model.addColumn("Harga Produk");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM produktoko";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4),
                res.getString(5),res.getInt(6)});
            }
            tbProduk.setModel(model);
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    private void textBoxOff(){
        txtKode.setEnabled(false);
        txtNama.setEnabled(false);
        cbKategori.setEnabled(false);
        txtProdusen.setEnabled(false);
        txtDesc.setEnabled(false);
        txtHarga.setEnabled(false);
    }
   
    private void textBoxOn(){
        txtKode.setEnabled(true);
        txtNama.setEnabled(true);
        cbKategori.setEnabled(true);
        txtProdusen.setEnabled(true);
        txtDesc.setEnabled(true);
        txtHarga.setEnabled(true);
    }
    
    public produkToko() {
        initComponents();
        display_data();
        form_empty();
        txtKode.requestFocus();
        btAdd.setEnabled(true);
        btSave.setEnabled(false);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOff();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtProdusen = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduk = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pendataan Produk Toko");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA PRODUK TOKO");

        jLabel2.setText("Kode Produk              :");

        jLabel3.setText("Nama Produk             :");

        jLabel4.setText("Kategori Produk         :");

        jLabel5.setText("Nama Produsen          :");

        jLabel6.setText("Deskripsi Produk         :");

        jLabel7.setText("Harga Produk              :");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtDesc.setColumns(10);
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan Kecil (Snack)", "Minuman", "Kue dan Biskuit", "Susu dan Makanan Bayi", "Selai/Madu", "Gula-Gula/Coklat", "Obat-Obatan", "Alat Tulis", "Peralatan Rumah Tangga", "Keperluan Bayi", "Mainan Anak", "Peralatan Memasak", "Bumbu Dapur", "Perlengkapan Kamar Mandi", "Pembersih Rumah", "Kebutuhan Peliharaan" }));

        tbProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduk);

        btAdd.setText("Add New Data");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btSave.setText("Save Data");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btEdit.setText("Update");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdusen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btEdit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProdusen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btCancel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        form_empty();
        txtKode.requestFocus();
        btAdd.setEnabled(false);
        btSave.setEnabled(true);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(true);
        btExit.setEnabled(true);
        textBoxOn();
    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        try{    
            String sql = "UPDATE produktoko SET kodeProduk = '"
                    +txtKode.getText()+"', namaProduk ='"+txtNama.getText()
                    +"', kategoriProduk ='"+cbKategori.getSelectedItem()+
                    "', namaProdusen ='"+txtProdusen.getText()
                    +"', deskripsiProduk ='"+txtDesc.getText()
                    +"', hargaProduk ='"+txtHarga.getText()
                    +"' WHERE kodeProduk ='"+txtKode.getText()
                    +"'";
                    java.sql.Connection conn = (Connection)config.configDB();
                    java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.execute();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diedit!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        display_data();
        form_empty();
        txtKode.requestFocus();
        btAdd.setEnabled(true);
        btSave.setEnabled(false);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOff();
    }//GEN-LAST:event_btEditActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO produktoko VALUES ('"+txtKode.getText()+
                    "','"+txtNama.getText()+"','"+cbKategori.getSelectedItem()+
                    "','"+txtProdusen.getText()+"','"+txtDesc.getText()+"','"+
                    txtHarga.getText()+"')";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
            display_data();
            form_empty();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        txtKode.requestFocus();
        btAdd.setEnabled(true);
        btSave.setEnabled(false);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOff();
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdukMouseClicked
        // TODO add your handling code here:
        int baris = tbProduk.rowAtPoint(evt.getPoint());
        String kode = tbProduk.getValueAt(baris, 1).toString();
        txtKode.setText(kode);
        
        String nama = tbProduk.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String kategori = tbProduk.getValueAt(baris, 3).toString();
        cbKategori.setSelectedItem(kategori);
        
        String produsen = tbProduk.getValueAt(baris, 4).toString();
        txtProdusen.setText(produsen);
        
        String deskripsi = tbProduk.getValueAt(baris, 5).toString();
        txtDesc.setText(deskripsi);
        
        String harga = tbProduk.getValueAt(baris, 6).toString();
        txtHarga.setText(harga);
        
        txtKode.requestFocus();
        btAdd.setEnabled(false);
        btSave.setEnabled(false);
        btEdit.setEnabled(true);
        btDelete.setEnabled(true);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOn();
    }//GEN-LAST:event_tbProdukMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM produktoko WHERE kodeProduk = '"+
                txtKode.getText()+"'";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        display_data();
        form_empty();
        txtKode.requestFocus();
        btAdd.setEnabled(true);
        btSave.setEnabled(false);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOff();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        form_empty();
        txtKode.requestFocus();
        btAdd.setEnabled(true);
        btSave.setEnabled(false);
        btEdit.setEnabled(false);
        btDelete.setEnabled(false);
        btCancel.setEnabled(false);
        btExit.setEnabled(true);
        textBoxOff();
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(produkToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produkToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produkToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produkToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new produkToko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbProduk;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtProdusen;
    // End of variables declaration//GEN-END:variables
}
