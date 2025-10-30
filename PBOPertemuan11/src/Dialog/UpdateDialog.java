/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Dialog;

/**
 *
 * @author Ryo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class UpdateDialog extends javax.swing.JDialog {

    private boolean update = false;

    public UpdateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public UpdateDialog(java.awt.Frame parent, boolean modal, String id, String nama,String tipe, String coach) {
        super(parent, modal);
        initComponents();

        tfIdMember.setText(id);
        tfNama.setText(nama);
        tfTipePaket.setText(tipe);
        tfCoach.setText(String.valueOf(coach));
        tfIdMember.setEditable(false);
    }

    UpdateDialog(MemberFrame aThis, boolean b, String id, String nama, String tipe, String coach) {
        super(aThis, b);
        initComponents();

        tfIdMember.setText(id);
        tfNama.setText(nama);
        tfTipePaket.setText(tipe);
        tfCoach.setText(String.valueOf(coach));
        tfIdMember.setEditable(false);
    }

    

    public boolean isUpdated() {
        return update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfIdMember = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfTipePaket = new javax.swing.JTextField();
        tfCoach = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jId = new javax.swing.JLabel();
        jGenre = new javax.swing.JLabel();
        jJudul = new javax.swing.JLabel();
        jHarga = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("UPDATE DATA MEMBER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        tfIdMember.setEditable(false);
        tfIdMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdMemberActionPerformed(evt);
            }
        });
        getContentPane().add(tfIdMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 149, 367, 38));

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        getContentPane().add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 198, 367, 37));
        getContentPane().add(tfTipePaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 253, 367, 36));
        getContentPane().add(tfCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 307, 367, 37));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 379, -1, 40));

        jId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jId.setText("ID Member");
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 155, -1, -1));

        jGenre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jGenre.setText("Tipe Paket");
        getContentPane().add(jGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 258, -1, -1));

        jJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jJudul.setText("Nama");
        getContentPane().add(jJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 206, 55, 16));

        jHarga.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jHarga.setText("Coach");
        getContentPane().add(jHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 312, 64, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dialog/2222.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      try {
        int id = Integer.parseInt(tfIdMember.getText());
        String nama = tfNama.getText();
        String tipe = tfTipePaket.getText();
        String coach = tfCoach.getText();

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        MemberGym m = em.find(MemberGym.class, id);
        if (m != null) {
            m.setNama(nama);
            m.setTipePaket(tipe); // ✅ pakai camelCase
            m.setCoach(coach);
            em.merge(m); 
        } else {
            JOptionPane.showMessageDialog(this, "⚠️ Data dengan ID " + id + " tidak ditemukan!");
        }

        em.getTransaction().commit();
        em.close();

        JOptionPane.showMessageDialog(this, "✅ Data berhasil diupdate!");
        update = true;
        dispose();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "❌ Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tfIdMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdMemberActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jGenre;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfCoach;
    private javax.swing.JTextField tfIdMember;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTipePaket;
    // End of variables declaration//GEN-END:variables

    void setMemberFrame(MemberFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
