/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calorietrackeruser;

/**
 *
 * @author paneq
 */
public class CalorieTrackerGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalorieTrackerGUI
     */
    public CalorieTrackerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        subtitleLB = new javax.swing.JLabel();
        bmiBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bmrTF = new javax.swing.JTextArea();
        bmrBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bmiTF = new javax.swing.JTextArea();
        bananaLB = new javax.swing.JLabel();
        scaleLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLB.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        titleLB.setForeground(new java.awt.Color(0, 204, 51));
        titleLB.setText("Calorie Tracker");

        jSeparator1.setForeground(new java.awt.Color(102, 255, 51));

        subtitleLB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subtitleLB.setText("Check your BMI and BMR");

        bmiBTN.setBackground(new java.awt.Color(0, 102, 0));
        bmiBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bmiBTN.setForeground(new java.awt.Color(102, 255, 0));
        bmiBTN.setText("BMI Calculator");
        bmiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiBTNActionPerformed(evt);
            }
        });

        bmrTF.setEditable(false);
        bmrTF.setBackground(new java.awt.Color(153, 255, 153));
        bmrTF.setColumns(20);
        bmrTF.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bmrTF.setRows(5);
        bmrTF.setText("A BMR (Basal Metabolic Rate) calculator estimates the number\nof calories your body needs to function at rest, based on\nfactors like age, gender, weight, and height. \nThis value represents the minimum energy needed\nfor basic bodily functions like breathing, circulating\nblood, and maintaining body temperature.");
        jScrollPane1.setViewportView(bmrTF);

        bmrBTN.setBackground(new java.awt.Color(0, 102, 0));
        bmrBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bmrBTN.setForeground(new java.awt.Color(102, 255, 0));
        bmrBTN.setText("BMR Calculator");
        bmrBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmrBTNActionPerformed(evt);
            }
        });

        bmiTF.setEditable(false);
        bmiTF.setBackground(new java.awt.Color(153, 255, 153));
        bmiTF.setColumns(20);
        bmiTF.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bmiTF.setLineWrap(true);
        bmiTF.setRows(5);
        bmiTF.setText("A BMI (Body Mass Index) calculator measures body fat based\non weight and height. By dividing a person’s weight by the \nsquare of their height, it categorizes them as underweight, \nnormal weight, overweight,or obese.  ");
        jScrollPane2.setViewportView(bmiTF);

        bananaLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calorietrackeruser/imgs/banana1.jpg"))); // NOI18N

        scaleLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calorietrackeruser/imgs/scale1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLB, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(subtitleLB, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bmrBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scaleLB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bmiBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bananaLB))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bananaLB)
                    .addComponent(bmiBTN, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bmrBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scaleLB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiBTNActionPerformed
        BmiCalculatorGUI bmiCalculator = new BmiCalculatorGUI();
        bmiCalculator.setVisible(true);
        dispose();
    }//GEN-LAST:event_bmiBTNActionPerformed

    private void bmrBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmrBTNActionPerformed
        BmrCalculatorGUI bmrApp = new BmrCalculatorGUI();
        bmrApp.setVisible(true);
        dispose();
    }//GEN-LAST:event_bmrBTNActionPerformed

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
            java.util.logging.Logger.getLogger(CalorieTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalorieTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalorieTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalorieTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalorieTrackerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bananaLB;
    private javax.swing.JButton bmiBTN;
    private javax.swing.JTextArea bmiTF;
    private javax.swing.JButton bmrBTN;
    private javax.swing.JTextArea bmrTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel scaleLB;
    private javax.swing.JLabel subtitleLB;
    private javax.swing.JLabel titleLB;
    // End of variables declaration//GEN-END:variables
}