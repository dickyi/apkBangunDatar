package aplikasi;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bPersegiPanjang = new javax.swing.JButton();
        bPersegi = new javax.swing.JButton();
        bLingkaran = new javax.swing.JButton();
        bSegitiga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/shapes (2).png"))); // NOI18N
        jLabel1.setText("APLIKASI BANGUN DATAR");

        bPersegiPanjang.setBackground(new java.awt.Color(51, 255, 51));
        bPersegiPanjang.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        bPersegiPanjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/rectangle.png"))); // NOI18N
        bPersegiPanjang.setText("PERSEGI PANJANG");
        bPersegiPanjang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiPanjangActionPerformed(evt);
            }
        });

        bPersegi.setBackground(new java.awt.Color(255, 0, 255));
        bPersegi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/square.png"))); // NOI18N
        bPersegi.setText("PERSEGI");
        bPersegi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiActionPerformed(evt);
            }
        });

        bLingkaran.setBackground(new java.awt.Color(51, 255, 0));
        bLingkaran.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        bLingkaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/united-states.png"))); // NOI18N
        bLingkaran.setText("LINGKARAN");
        bLingkaran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLingkaranActionPerformed(evt);
            }
        });

        bSegitiga.setBackground(new java.awt.Color(255, 0, 255));
        bSegitiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/triangle (1).png"))); // NOI18N
        bSegitiga.setText("SEGITIGA");
        bSegitiga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegitigaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(bSegitiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(bPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(bPersegi)
                .addGap(25, 25, 25)
                .addComponent(bLingkaran)
                .addGap(18, 18, 18)
                .addComponent(bSegitiga)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiActionPerformed
        new Persegi().setVisible(true);
    }//GEN-LAST:event_bPersegiActionPerformed

    private void bPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiPanjangActionPerformed
        new PersegiPanjang().setVisible(true);

    }//GEN-LAST:event_bPersegiPanjangActionPerformed

    private void bLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLingkaranActionPerformed
        new Lingkaran().setVisible(true);
    }//GEN-LAST:event_bLingkaranActionPerformed

    private void bSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegitigaActionPerformed
        new Segitiga().setVisible(true);
    }//GEN-LAST:event_bSegitigaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLingkaran;
    private javax.swing.JButton bPersegi;
    private javax.swing.JButton bPersegiPanjang;
    private javax.swing.JButton bSegitiga;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
