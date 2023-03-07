import java.awt.Color;
public class Driver13 extends javax.swing.JFrame {
    public Driver13() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRed = new javax.swing.JButton();
        btnWhite = new javax.swing.JButton();
        btnBlue = new javax.swing.JButton();
        btnYellow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRed.setText("Red");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        btnWhite.setText("White");
        btnWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhiteActionPerformed(evt);
            }
        });

        btnBlue.setText("Blue");
        btnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueActionPerformed(evt);
            }
        });

        btnYellow.setText("Yellow");
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnYellow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWhite, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRed)
                    .addComponent(btnWhite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBlue)
                    .addComponent(btnYellow))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
        getContentPane().setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnYellowActionPerformed
    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_btnRedActionPerformed
    private void btnWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhiteActionPerformed
        getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_btnWhiteActionPerformed
    private void btnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlueActionPerformed
        getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_btnBlueActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver13().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlue;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnWhite;
    private javax.swing.JButton btnYellow;
    // End of variables declaration//GEN-END:variables
}