/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import control.c_connect;
import control.controllerToko;
import model.m_toko;
/**
 *
 * @author Fay
 */
public class home extends javax.swing.JFrame {
   String nol_jam, nol_menit, nol_detik;
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        String user = null;
        admin.setText(user);
        setTanggal();
        setJam();
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
        jLabel7 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        cbkategori = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbcari = new javax.swing.JComboBox<>();
        cari = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel7.setText("Admin:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 10, 55, 22);

        admin.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel1.add(admin);
        admin.setBounds(70, 10, 57, 22);

        jLabel9.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel9.setText("Aachen Student Store");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 10, 330, 58);

        tgl.setFont(new java.awt.Font("Squealer", 1, 14)); // NOI18N
        tgl.setText("alaa");
        jPanel1.add(tgl);
        tgl.setBounds(520, 10, 90, 30);

        time.setFont(new java.awt.Font("Squealer", 1, 14)); // NOI18N
        time.setText("jLabel8");
        jPanel1.add(time);
        time.setBounds(520, 40, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 80);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Item Code");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 20, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Item Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 60, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Item Category");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 100, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Packaging Type");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 140, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("Price");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 180, 70, 30);

        kode.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jPanel2.add(kode);
        kode.setBounds(130, 20, 300, 30);

        nama.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama);
        nama.setBounds(130, 60, 300, 30);

        harga.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jPanel2.add(harga);
        harga.setBounds(130, 180, 300, 30);

        cbkategori.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Elektronika", "Tulismenulis", "Baranglain" }));
        jPanel2.add(cbkategori);
        cbkategori.setBounds(130, 100, 300, 30);

        cbjenis.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Unpacked" }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(130, 140, 300, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 80, 460, 220);

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(null);

        simpan.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        simpan.setText("SAVE");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel3.add(simpan);
        simpan.setBounds(20, 20, 90, 30);

        ubah.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        ubah.setText("EDIT");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel3.add(ubah);
        ubah.setBounds(20, 60, 90, 30);

        refresh.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        refresh.setText("RESET");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh);
        refresh.setBounds(20, 100, 90, 30);

        hapus.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        hapus.setText("DELETE");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel3.add(hapus);
        hapus.setBounds(20, 140, 90, 30);

        keluar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        keluar.setText("EXIT");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel3.add(keluar);
        keluar.setBounds(20, 180, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(500, 80, 130, 220);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Search Based on Food Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 310, 270, 30);

        cbcari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cbcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Elektronika", "Tulismenulis", "Baranglain" }));
        getContentPane().add(cbcari);
        cbcari.setBounds(270, 310, 180, 30);

        cari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        cari.setText("Search");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari);
        cari.setBounds(470, 310, 70, 30);

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setLayout(null);

        tb1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Item Name", "Category", "Packaging", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 550, 169);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(30, 350, 580, 190);

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setForeground(new java.awt.Color(153, 255, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/madagascar-sky.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 680, 570);

        setSize(new java.awt.Dimension(660, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_ubahActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_refreshActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_hapusActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        ctoko.CariKategori();
        //ctoko.isiTable();
    }//GEN-LAST:event_cariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String userb = login.user;
        admin.setText(userb);
    }//GEN-LAST:event_formWindowOpened

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
       int baris = tb1.getSelectedRow();
        if(baris != -1){
            kode.setText(tb1.getValueAt(baris, 0).toString());
            nama.setText((String) tb1.getValueAt(baris, 1));
            cbkategori.setSelectedItem(tb1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(tb1.getValueAt(baris, 3).toString());
            harga.setText(tb1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_tb1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

  public JTextField getTxtKode(){
 return kode;
 }
 public JTextField getTxtNama(){
 return nama;
 }
 public JTextField getTxtHarga(){
 return harga;
 }
 public JComboBox getCbKategori(){
 return cbkategori;
 }
 public JComboBox getCbJenis(){
 return cbjenis;
 }
 public JComboBox getCbCariKategori(){
 return cbcari;
 }
 public JButton getButtonHapus(){
 return hapus;
 }

 public JButton getButtonBersih(){
 return refresh;
 }
 public JButton getButtonSimpan(){
 return simpan;
 }
 public JButton getButtonUbah(){
 return ubah;
 }
 public JButton getButtonKeluar(){
 return keluar;
 }
 public JTable getTableData(){
 return tb1;
 }
 public void setTanggal() {
       java.util.Date skrg = new java.util.Date();
       java.text.SimpleDateFormat kal = new
       java.text.SimpleDateFormat("dd/MM/yyyy");
       tgl.setText(kal.format(skrg));
    }
    
    
    
    public void setJam() {
       ActionListener taskPerformer = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                
                
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                
                if (nilai_jam<=9){
                    nol_jam = "0";
                } if (nilai_menit <= 9) {
                    nol_menit = "0";
                } if (nilai_detik <= 9){
                    nol_detik = "0";
                }
               
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                time.setText(jam+":"+menit+":"+detik);
            }
        };
    new Timer(100, taskPerformer).start();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cbcari;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JComboBox<String> cbkategori;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tb1;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel time;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
