package aplikasi;

public class Persegi extends javax.swing.JFrame {

    public Persegi() {
        initComponents();
        reset();
    }

    void reset() {
        tSisi.setText("");

        vKeliling.setText("");
        vLuas.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tSisi = new javax.swing.JTextField();
        bHitung = new javax.swing.JToggleButton();
        bReset = new javax.swing.JToggleButton();
        bKembali = new javax.swing.JToggleButton();
        vLuas = new javax.swing.JLabel();
        vKeliling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/square.png"))); // NOI18N
        jLabel1.setText("PERSEGI");

        jLabel2.setText("SISI");

        tSisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSisiActionPerformed(evt);
            }
        });

        bHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/calculate.png"))); // NOI18N
        bHitung.setText("HITUNG");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/circular (1).png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/arrow-left (1).png"))); // NOI18N
        bKembali.setText("KEMBALI");
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        vLuas.setText("jLabel3");

        vKeliling.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vKeliling)
                    .addComponent(vLuas))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bHitung)
                                .addGap(21, 21, 21)
                                .addComponent(bReset)
                                .addGap(32, 32, 32)
                                .addComponent(bKembali)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tSisi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tSisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bHitung)
                    .addComponent(bKembali))
                .addGap(39, 39, 39)
                .addComponent(vLuas)
                .addGap(18, 18, 18)
                .addComponent(vKeliling)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tSisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSisiActionPerformed

    }//GEN-LAST:event_tSisiActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        double sisi = Double.parseDouble(tSisi.getText());
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        vLuas.setText("Luas = " + luas);
        vKeliling.setText("Keliling = " + keliling);
    }//GEN-LAST:event_bHitungActionPerformed

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persegi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bHitung;
    private javax.swing.JToggleButton bKembali;
    private javax.swing.JToggleButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tSisi;
    private javax.swing.JLabel vKeliling;
    private javax.swing.JLabel vLuas;
    // End of variables declaration//GEN-END:variables
}
