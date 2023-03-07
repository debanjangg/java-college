public class GUIClass extends javax.swing.JFrame {
    DBClass DB;
    public GUIClass() {
        initComponents();
        DB = new DBClass();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpGender = new javax.swing.ButtonGroup();
        btnDbReg = new javax.swing.JButton();
        btnDbConn = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnCreateTable = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAadhar = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtAadhar = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        rdOthers = new javax.swing.JRadioButton();
        rdNone = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpnOut = new javax.swing.JTextPane();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDbReg.setText("DB Register");
        btnDbReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbRegActionPerformed(evt);
            }
        });

        btnDbConn.setText("DB Connect");
        btnDbConn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbConnActionPerformed(evt);
            }
        });

        btnCreateTable.setText("Create Table");
        btnCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTableActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblAadhar.setText("Aadhar No.:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        btngrpGender.add(rdMale);
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        btngrpGender.add(rdFemale);
        rdFemale.setText("Female");

        btngrpGender.add(rdOthers);
        rdOthers.setText("Others");

        btngrpGender.add(rdNone);
        rdNone.setText("None");
        rdNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoneActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtpnOut);

        btnInsert.setLabel("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAadhar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdFemale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdOthers)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdNone))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnDbReg)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDbConn))
                                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(txtName)))))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDbReg)
                    .addComponent(btnDbConn))
                .addGap(9, 9, 9)
                .addComponent(btnCreateTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdMale)
                    .addComponent(rdFemale)
                    .addComponent(rdOthers)
                    .addComponent(rdNone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsert)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoneActionPerformed
    }//GEN-LAST:event_rdNoneActionPerformed

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
    }//GEN-LAST:event_rdMaleActionPerformed

    private void btnDbRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDbRegActionPerformed
        txtpnOut.setText(DB.dbRegister());
    }//GEN-LAST:event_btnDbRegActionPerformed

    private void btnDbConnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDbConnActionPerformed
        txtpnOut.setText(txtpnOut.getText() + DB.dbConnect());
    }//GEN-LAST:event_btnDbConnActionPerformed

    private void btnCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTableActionPerformed
        String res = DB.createTable();
        txtpnOut.setText(txtpnOut.getText() + res);
    }//GEN-LAST:event_btnCreateTableActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = "";
        if (rdMale.isSelected())
            gender = "Male";
        else if (rdFemale.isSelected())
            gender = "Female";
        else if (rdOthers.isSelected())
            gender = "Other";
        else if (rdNone.isSelected())
            gender = "None";
        String aadhar = txtAadhar.getText();
        String str = txtpnOut.getText();
        str += DB.insertData(name, age, gender, aadhar);
        txtpnOut.setText(str);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
    }//GEN-LAST:event_txtAgeActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIClass().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTable;
    private javax.swing.JButton btnDbConn;
    private javax.swing.JButton btnDbReg;
    private javax.swing.JButton btnInsert;
    private javax.swing.ButtonGroup btngrpGender;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAadhar;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JRadioButton rdNone;
    private javax.swing.JRadioButton rdOthers;
    private javax.swing.JTextField txtAadhar;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextPane txtpnOut;
    // End of variables declaration//GEN-END:variables
}
