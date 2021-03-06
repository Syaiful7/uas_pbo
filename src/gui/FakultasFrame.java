/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gen.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FakultasFrame extends javax.swing.JFrame {
    Fakultas fakultas;
    Dosen dosen;
    Jabatan jabatan;
    Program_kerja progker;
    /**
     * Creates new form Fakultas
     */
    public FakultasFrame() {
        initComponents();
    }

    public FakultasFrame(Users user) {
        initComponents();
        dosen = new Dosen().satuDb(user.getusername());
        jabatan = new Jabatan().satuDosenDb(dosen.getnpp());
        fakultas = jabatan.fakultas;
        getProker();
        hideTombol(false);
        halo.setText("Nama : " + dosen.getnama());
        halo1.setText("Jabatan : " + jabatan.getnama_jabatan() + " " + fakultas.getnama_fakultas());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelProker = new javax.swing.JTable();
        setujuProker = new javax.swing.JButton();
        tolakProker = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelSetuju = new javax.swing.JTable();
        tolakSetuju = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelTolak = new javax.swing.JTable();
        setujuTolak = new javax.swing.JButton();
        halo = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        halo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelProker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prodi | Kaprodi", "Id | Nama Program", "Pelaksanaan", "Selesai", "Anggaran", "Lokasi", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelProker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProkerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelProker);

        setujuProker.setText("Setuju");
        setujuProker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuProkerActionPerformed(evt);
            }
        });

        tolakProker.setText("Tolak");
        tolakProker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolakProkerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setujuProker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tolakProker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(setujuProker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tolakProker)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Pengajuan Program Kerja", jPanel1);

        tabelSetuju.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prodi | Kaprodi", "Id | Nama Program", "Pelaksanaan", "Selesai", "Anggaran", "Lokasi", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelSetuju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSetujuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelSetuju);

        tolakSetuju.setText("Tolak");
        tolakSetuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tolakSetujuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tolakSetuju, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tolakSetuju)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Program Kerja Disetujui", jPanel2);

        tabelTolak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prodi | Kaprodi", "Id | Nama Program", "Pelaksanaan", "Selesai", "Anggaran", "Lokasi", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelTolak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTolakMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelTolak);

        setujuTolak.setText("Setuju");
        setujuTolak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuTolakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setujuTolak)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(setujuTolak)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Program Kerja Ditolak", jPanel3);

        halo.setText("jLabel1");

        keluar.setText("Log Out");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        halo1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(halo, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluar))
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(halo1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keluar)
                    .addComponent(halo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(halo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelProkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProkerMouseClicked
        // TODO add your handling code here:
        String setring = tabelProker.getValueAt(tabelProker.getSelectedRow(), 1).toString();
        StringTokenizer token = new StringTokenizer(setring);
        int idProker = Integer.parseInt(token.nextToken(" | "));        
        
        progker = new Program_kerja().satuDb(idProker);
        hideTombol(true);
    }//GEN-LAST:event_tabelProkerMouseClicked

    private void tabelSetujuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSetujuMouseClicked
        // TODO add your handling code here:
        String setring = tabelSetuju.getValueAt(tabelSetuju.getSelectedRow(), 1).toString();
        StringTokenizer token = new StringTokenizer(setring);
        int idProker = Integer.parseInt(token.nextToken(" | "));        
        
        progker = new Program_kerja().satuDb(idProker);
        hideTombol(true);
    }//GEN-LAST:event_tabelSetujuMouseClicked

    private void tabelTolakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTolakMouseClicked
        // TODO add your handling code here:
        String setring = tabelTolak.getValueAt(tabelTolak.getSelectedRow(), 1).toString();
        StringTokenizer token = new StringTokenizer(setring);
        int idProker = Integer.parseInt(token.nextToken(" | "));        
        
        progker = new Program_kerja().satuDb(idProker);
        hideTombol(true);
    }//GEN-LAST:event_tabelTolakMouseClicked

    private void setujuProkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuProkerActionPerformed
        // TODO add your handling code here:
        progker.setstatus("Disetujui");
        progker.updateDb();
        hideTombol(false);
        getProker();
        tabelProker.clearSelection();
    }//GEN-LAST:event_setujuProkerActionPerformed

    private void tolakProkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolakProkerActionPerformed
        // TODO add your handling code here:
        progker.setstatus("Disetujui");
        progker.updateDb();
        hideTombol(false);
        getProker();
        tabelProker.clearSelection();
    }//GEN-LAST:event_tolakProkerActionPerformed

    private void tolakSetujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tolakSetujuActionPerformed
        // TODO add your handling code here:
        progker.setstatus("Ditolak");
        progker.updateDb();
        hideTombol(false);
        getProker();
        tabelSetuju.clearSelection();
    }//GEN-LAST:event_tolakSetujuActionPerformed

    private void setujuTolakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuTolakActionPerformed
        // TODO add your handling code here:
        progker.setstatus("Disetujui");
        progker.updateDb();
        hideTombol(false);
        getProker();
        tabelTolak.clearSelection();
    }//GEN-LAST:event_setujuTolakActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(FakultasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FakultasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FakultasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FakultasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FakultasFrame().setVisible(true);
            }
        });
    }
    
    public void getProker(){
        DefaultTableModel TableBelumAcc = (DefaultTableModel) tabelProker.getModel();
        TableBelumAcc.setRowCount(0);
        DefaultTableModel TableSetuju = (DefaultTableModel) tabelSetuju.getModel();
        TableSetuju.setRowCount(0);
        DefaultTableModel TableTolak = (DefaultTableModel) tabelTolak.getModel();
        TableTolak.setRowCount(0);
        Object[] atribut = new Object[7];
        ArrayList<Program_kerja> list = new Program_kerja().semuaDb();
        Iterator<Program_kerja> tiapList = list.iterator();
        while(tiapList.hasNext()){
            Program_kerja proker = tiapList.next();
            if(fakultas.getId_fakultas().equals(proker.prodi.fakultas.getId_fakultas()))
            {
                atribut[0] = proker.prodi.getnama_prodi() + " | " + proker.prodi.jabatan.dosen.getnama();
                atribut[1] = proker.getId_proker() + " | " + proker.getnama_proker();
                atribut[2] = proker.getTgl_pelaksanaan();
                atribut[3] = proker.getTgl_selesai();
                atribut[4] = proker.getangg_digunakan();
                atribut[5] = proker.getlokasi_proker();
                atribut[6] = proker.geturaian();

                switch(proker.getstatus()){
                    case "Belum Acc" :
                    {
                        TableBelumAcc.addRow(atribut);
                        break;
                    }
                    case "Disetujui" :
                    {
                        TableSetuju.addRow(atribut);
                        break;
                    }
                    
                    case "Ditolak" :
                    {
                        TableTolak.addRow(atribut);
                        break;
                    }
                }
            }
        }
        tabelProker.setModel(TableBelumAcc);
        tabelSetuju.setModel(TableSetuju);
        tabelTolak.setModel(TableTolak);
    }
    
    public void hideTombol(Boolean bool){
        setujuProker.setVisible(bool);
        setujuTolak.setVisible(bool);
        tolakProker.setVisible(bool);
        tolakSetuju.setVisible(bool);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel halo;
    private javax.swing.JLabel halo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton setujuProker;
    private javax.swing.JButton setujuTolak;
    private javax.swing.JTable tabelProker;
    private javax.swing.JTable tabelSetuju;
    private javax.swing.JTable tabelTolak;
    private javax.swing.JButton tolakProker;
    private javax.swing.JButton tolakSetuju;
    // End of variables declaration//GEN-END:variables
}
