/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hydrationtracker;

/*
* AverageGUI.java
* @author: Stefany Rachor Junges
* 09/11/2024
*/

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AverageGUI extends javax.swing.JFrame {
   
    public AverageGUI() {
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

        whiteJPANEL = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        subtitleLBL = new javax.swing.JLabel();
        inputLBL = new javax.swing.JLabel();
        day1TF = new javax.swing.JTextField();
        day2TF = new javax.swing.JTextField();
        day3TF = new javax.swing.JTextField();
        day4TF = new javax.swing.JTextField();
        day5TF = new javax.swing.JTextField();
        day6TF = new javax.swing.JTextField();
        day7TF = new javax.swing.JTextField();
        literls2LBL = new javax.swing.JLabel();
        literls1LBL = new javax.swing.JLabel();
        literls3LBL = new javax.swing.JLabel();
        literls4LBL = new javax.swing.JLabel();
        literls5LBL = new javax.swing.JLabel();
        literls6LBL = new javax.swing.JLabel();
        literls7LBL = new javax.swing.JLabel();
        checkBTN = new javax.swing.JButton();
        iconLBL = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        resultTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        whiteJPANEL.setBackground(new java.awt.Color(255, 255, 255));

        titleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(0, 153, 255));
        titleLBL.setText("HydroCheck");

        jSeparator1.setForeground(new java.awt.Color(51, 153, 255));

        subtitleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        subtitleLBL.setForeground(new java.awt.Color(102, 204, 255));
        subtitleLBL.setText("Monitor your hydration levels for overall wellness.");

        inputLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        inputLBL.setForeground(new java.awt.Color(0, 153, 255));
        inputLBL.setText("Input your water intake on the last few days (min. 3, max. 7)");

        day1TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day1TF.setForeground(new java.awt.Color(102, 204, 255));
        day1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1TFActionPerformed(evt);
            }
        });

        day2TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day2TF.setForeground(new java.awt.Color(102, 204, 255));
        day2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2TFActionPerformed(evt);
            }
        });

        day3TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day3TF.setForeground(new java.awt.Color(102, 204, 255));

        day4TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day4TF.setForeground(new java.awt.Color(102, 204, 255));

        day5TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day5TF.setForeground(new java.awt.Color(102, 204, 255));

        day6TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day6TF.setForeground(new java.awt.Color(102, 204, 255));

        day7TF.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        day7TF.setForeground(new java.awt.Color(102, 204, 255));

        literls2LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls2LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls2LBL.setText("liters");

        literls1LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls1LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls1LBL.setText("liters");

        literls3LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls3LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls3LBL.setText("liters");

        literls4LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls4LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls4LBL.setText("liters");

        literls5LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls5LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls5LBL.setText("liters");

        literls6LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls6LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls6LBL.setText("liters");

        literls7LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        literls7LBL.setForeground(new java.awt.Color(51, 153, 255));
        literls7LBL.setText("liters");

        checkBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        checkBTN.setForeground(new java.awt.Color(0, 153, 255));
        checkBTN.setText("hydroCHECK!");
        checkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTNActionPerformed(evt);
            }
        });

        iconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hydrationtracker/handicon.png"))); // NOI18N
        iconLBL.setText("jLabel1");

        backBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        backBTN.setForeground(new java.awt.Color(0, 153, 255));
        backBTN.setText("back to homepage");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        resultTA.setColumns(20);
        resultTA.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        resultTA.setForeground(new java.awt.Color(51, 153, 255));
        resultTA.setLineWrap(true);
        resultTA.setRows(5);
        resultTA.setWrapStyleWord(true);

        javax.swing.GroupLayout whiteJPANELLayout = new javax.swing.GroupLayout(whiteJPANEL);
        whiteJPANEL.setLayout(whiteJPANELLayout);
        whiteJPANELLayout.setHorizontalGroup(
            whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteJPANELLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteJPANELLayout.createSequentialGroup()
                        .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBTN)
                            .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1)
                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                    .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                    .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(subtitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(whiteJPANELLayout.createSequentialGroup()
                                            .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                                    .addComponent(day3TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(literls3LBL))
                                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                                    .addComponent(day2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(literls2LBL))
                                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                                    .addComponent(day1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(literls1LBL)))
                                            .addGap(18, 18, 18)
                                            .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(day4TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(day6TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(day5TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(literls5LBL)
                                                .addGroup(whiteJPANELLayout.createSequentialGroup()
                                                    .addComponent(literls4LBL)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(day7TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(literls7LBL))
                                                .addComponent(literls6LBL))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(resultTA, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(whiteJPANELLayout.createSequentialGroup()
                        .addComponent(checkBTN)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        whiteJPANELLayout.setVerticalGroup(
            whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteJPANELLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconLBL)
                    .addComponent(titleLBL))
                .addGap(2, 2, 2)
                .addComponent(subtitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLBL)
                .addGap(18, 18, 18)
                .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls1LBL)
                    .addComponent(day4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls4LBL)
                    .addComponent(day7TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls7LBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls2LBL)
                    .addComponent(day5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls5LBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whiteJPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls3LBL)
                    .addComponent(day6TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(literls6LBL))
                .addGap(18, 18, 18)
                .addComponent(checkBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultTA, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whiteJPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whiteJPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void day1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day1TFActionPerformed

    private void day2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day2TFActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        //Creating an instance of HydrationTrackerGUI
        HydrationTrackerGUI hygui = new HydrationTrackerGUI();
        //Opening HydrationTrackerGUI
        hygui.setVisible(true);
        //Closing current window
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    //methods to make the button code cleaner
    //for insufficient average amount of water
    private void appendInsufficient(){
        resultTA.append("\nINFO: Although it may seem like a lot, you're drinking"
                + " less water than recommended! The general recommendation"
                + " is to drink about 2.5l of water per day. Insufficient hydration can"
                + " affect important bodily functions and cause headaches,"
                + " fatigue and even kidney strain. For more details, check"
                + " the National Institute on Aging website."
                + "\n\nNote: this result uses a fixed base for calculation. For a tailored"
                + " recommended daily water intake, please check HydroGuide.");
    }
    
    //for sufficient average amount of water
    private void appendSufficient(){
        resultTA.append("\nINFO: You're drinking the amount of water recommended!"
                + " Drinking enough water supports overall health, energy and the"
                + " body's ability to flush out toxins. For more details, check"
                + " the National Institute on Aging website."
                + "\n\nNote: this result uses a fixed base for calculation. For a tailored"
                + " recommended daily water intake, please check HydroGuide.");
    }
    
    //for excessive average amount of water
    private void appendExcessive(){
        resultTA.append("\nINFO: Caution! You're drinking more water than what's"
                + " generally recommended for a healthy balance. Drinking excessive"
                + " water can strain your kidneys and may lead to water intoxication."
                + " For more details, check the Mayo Clinic website."
                + "\n\nNote: this result uses a fixed base for calculation. For a tailored"
                + " recommended daily water intake, please check HydroGuide.");
    }
    
    private void checkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTNActionPerformed
        //Creating an arraylist to store user input after parsed
        ArrayList <Double> dailyWaterIntake = new ArrayList<>();
        //Storing user input in an array
        String[] inputs = {day1TF.getText(), day2TF.getText(), day3TF.getText(), day4TF.getText(),day5TF.getText(), day6TF.getText(), day7TF.getText()};
        
            //Looping through array of inputs
            for (int i = 0; i < inputs.length; i++){
                //Assigning a variable to reference the current index
                String userInput = inputs[i];
                
                //If the current input is not empty, parse it to double and add it to the arraylist
                if (!userInput.isEmpty()){
                    dailyWaterIntake.add(Double.parseDouble(userInput));
                }
            }
            
            //If the arraylist size is less than 3, show message to user
            if (dailyWaterIntake.size() < 3){
                JOptionPane.showMessageDialog(null, "Please input your water intake for at least 3 days.");
            } else {
                //If arraylist size is more than 3, call method feedback()
                Average avg = new Average(dailyWaterIntake);
                resultTA.setText(avg.averageFeedback());
                
                //If the week average is less than 2.5, call method for additional information
                if (avg.weekAverage() < 2.5){
                     appendInsufficient();
                } else if ((avg.weekAverage() >= 2.5) && (avg.weekAverage() < 3.5)){
                    appendSufficient();
                } else {
                    appendExcessive();
                }
        }          
    }//GEN-LAST:event_checkBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AverageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AverageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AverageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AverageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AverageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton checkBTN;
    private javax.swing.JTextField day1TF;
    private javax.swing.JTextField day2TF;
    private javax.swing.JTextField day3TF;
    private javax.swing.JTextField day4TF;
    private javax.swing.JTextField day5TF;
    private javax.swing.JTextField day6TF;
    private javax.swing.JTextField day7TF;
    private javax.swing.JLabel iconLBL;
    private javax.swing.JLabel inputLBL;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel literls1LBL;
    private javax.swing.JLabel literls2LBL;
    private javax.swing.JLabel literls3LBL;
    private javax.swing.JLabel literls4LBL;
    private javax.swing.JLabel literls5LBL;
    private javax.swing.JLabel literls6LBL;
    private javax.swing.JLabel literls7LBL;
    private javax.swing.JTextArea resultTA;
    private javax.swing.JLabel subtitleLBL;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JPanel whiteJPANEL;
    // End of variables declaration//GEN-END:variables
}