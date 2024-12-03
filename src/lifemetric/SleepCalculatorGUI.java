/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lifemetric;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 *SleepCalculatorGUI.java
 *@author Murilo Carlos Batiuk
 * November 9th 2024 
 */
public class SleepCalculatorGUI extends javax.swing.JFrame {
   
    //Declare and create array
    SleepCalculator sclist[];
    private int count;
    /**
     * Creates new form SleepCalculatorGUI
     */
    public SleepCalculatorGUI() {
        initComponents();
        sclist = new SleepCalculator[5]; //initiate array
        count = -1; //count -1 so the first term can match the index 0
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
        sundayLBL = new javax.swing.JLabel();
        fridayTF = new javax.swing.JTextField();
        mondayLBL = new javax.swing.JLabel();
        sundayTF = new javax.swing.JTextField();
        mondayTF = new javax.swing.JTextField();
        thursdayLBL = new javax.swing.JLabel();
        wednesdayTF = new javax.swing.JTextField();
        wednesdayLBL = new javax.swing.JLabel();
        tuesdayTF = new javax.swing.JTextField();
        saturdayTF = new javax.swing.JTextField();
        thursdayTF = new javax.swing.JTextField();
        saturdayLBL = new javax.swing.JLabel();
        tuesdayLBL = new javax.swing.JLabel();
        fridayLBL = new javax.swing.JLabel();
        asctitleLBL = new javax.swing.JLabel();
        ascsubtitleLBL = new javax.swing.JLabel();
        ascsubtitle2LBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ascmainpageBTN = new javax.swing.JButton();
        ascreturnBTN = new javax.swing.JButton();
        asccalculateBTN = new javax.swing.JButton();
        ascageLBL = new javax.swing.JLabel();
        ascageTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ascdisplayTA = new javax.swing.JTextArea();
        ascnameLBL = new javax.swing.JLabel();
        ascnameTF = new javax.swing.JTextField();
        ascaddBTN = new javax.swing.JButton();
        ascdisplayBTN = new javax.swing.JButton();
        ascsearchBTN = new javax.swing.JButton();
        ascdeleteBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(186, 167, 186));

        sundayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        sundayLBL.setText("Sunday");

        mondayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        mondayLBL.setText("Monday");

        mondayTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayTFActionPerformed(evt);
            }
        });

        thursdayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        thursdayLBL.setText("Thursday");

        wednesdayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        wednesdayLBL.setText("Wednesday");

        saturdayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        saturdayLBL.setText("Saturday");

        tuesdayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        tuesdayLBL.setText("Tuesday");

        fridayLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        fridayLBL.setText("Friday");

        asctitleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        asctitleLBL.setText("Average Sleep Calculator");

        ascsubtitleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        ascsubtitleLBL.setText("Insert your amount of hours of sleep night-by-night.");

        ascsubtitle2LBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascsubtitle2LBL.setText("Please, insert only integer numbers.");

        ascmainpageBTN.setText("RETURN  TO MAIN PAGE");
        ascmainpageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascmainpageBTNActionPerformed(evt);
            }
        });

        ascreturnBTN.setText("RETURN TO SLEEP TRACKER PAGE");
        ascreturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascreturnBTNActionPerformed(evt);
            }
        });

        asccalculateBTN.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        asccalculateBTN.setText("CALCULATE!");
        asccalculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asccalculateBTNActionPerformed(evt);
            }
        });

        ascageLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascageLBL.setText("Age:");

        ascageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascageTFActionPerformed(evt);
            }
        });

        ascdisplayTA.setColumns(20);
        ascdisplayTA.setRows(5);
        jScrollPane1.setViewportView(ascdisplayTA);

        ascnameLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascnameLBL.setText("Name:");

        ascnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascnameTFActionPerformed(evt);
            }
        });

        ascaddBTN.setText("Add");
        ascaddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascaddBTNActionPerformed(evt);
            }
        });

        ascdisplayBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascdisplayBTN.setText("Display");
        ascdisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascdisplayBTNActionPerformed(evt);
            }
        });

        ascsearchBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascsearchBTN.setText("Search");
        ascsearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascsearchBTNActionPerformed(evt);
            }
        });

        ascdeleteBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ascdeleteBTN.setText("Delete");
        ascdeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascdeleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ascsubtitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(asctitleLBL)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mondayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ascsubtitle2LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(ascreturnBTN)
                            .addGap(45, 45, 45)
                            .addComponent(ascmainpageBTN))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(ascnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ascageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ascageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(asccalculateBTN))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ascnameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mondayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tuesdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wednesdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tuesdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wednesdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thursdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thursdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fridayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fridayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saturdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saturdayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sundayLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sundayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(ascaddBTN)
                        .addGap(44, 44, 44)
                        .addComponent(ascdisplayBTN)
                        .addGap(76, 76, 76)
                        .addComponent(ascsearchBTN)
                        .addGap(69, 69, 69)
                        .addComponent(ascdeleteBTN)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(asctitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ascsubtitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ascsubtitle2LBL)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sundayLBL)
                    .addComponent(saturdayLBL)
                    .addComponent(fridayLBL)
                    .addComponent(thursdayLBL)
                    .addComponent(wednesdayLBL)
                    .addComponent(tuesdayLBL)
                    .addComponent(mondayLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mondayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuesdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wednesdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thursdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fridayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saturdayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sundayTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ascageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ascageLBL)
                            .addComponent(ascnameLBL)
                            .addComponent(ascnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(asccalculateBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ascaddBTN)
                    .addComponent(ascdisplayBTN)
                    .addComponent(ascsearchBTN)
                    .addComponent(ascdeleteBTN))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ascreturnBTN)
                    .addComponent(ascmainpageBTN))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    
    private void ascreturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascreturnBTNActionPerformed
        // TODO add your handling code here:
        //code to return to the Sleep Calculator page
        SleepTrackerMainPageGUI stmp = new SleepTrackerMainPageGUI();
        stmp.setVisible(true);
        dispose();

    }//GEN-LAST:event_ascreturnBTNActionPerformed

    private void ascmainpageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascmainpageBTNActionPerformed
       //code to go back to the main page
       MainAppGUI main = new MainAppGUI();
       main.setVisible(true);
       dispose();
    }//GEN-LAST:event_ascmainpageBTNActionPerformed

    private void mondayTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mondayTFActionPerformed

    private void asccalculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asccalculateBTNActionPerformed
        // TODO add your handling code here:
        //this section gets the seven days of the week and stores into an array
        ArrayList <Integer> dailySleep = new ArrayList<>();
        
        String [] inputs = {mondayTF.getText(), tuesdayTF.getText(), wednesdayTF.getText(), thursdayTF.getText(), fridayTF.getText(), saturdayTF.getText(), sundayTF.getText()};
        
        for (int i = 0; i < inputs.length; i++){
            //Assigning a variable to reference the current index
            String userInput = inputs[i];

            //If the current input is not empty, parse it to double and add it to the arraylist
            if (!userInput.isEmpty()){
                dailySleep.add(Integer.parseInt(userInput));
            }
        }
        
        //this section calls the variables and the Compare method (compute) and displays the message 
        int age = Integer.parseInt(ascageTF.getText());
        SleepCalculator tempSC = new SleepCalculator(age);
        String name = ascnameTF.getText();
        tempSC.setName(name);
        
        tempSC.setDailySleep(dailySleep);
        tempSC.compare();
       //capture the msge content in a var and then use in the other method
        ascdisplayTA.setText(tempSC.getMessage());
       
    }//GEN-LAST:event_asccalculateBTNActionPerformed

    private void ascageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ascageTFActionPerformed

    private void ascnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ascnameTFActionPerformed

    private void ascaddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascaddBTNActionPerformed
        // TODO add your handling code here:
        //code to add the profile of a new user
        SleepCalculator tempsc = new SleepCalculator(); //getting the code from the text firlds
        tempsc.setName(ascnameTF.getText());
        tempsc.setAge(Integer.parseInt(ascageTF.getText()));
        
        count++; //set the index for the array of objects
        
        sclist[count] = tempsc; //adding to the temp obj to the array of objects
        
        ascdisplayTA.append("\nNew sleeper added successfully!");
        
        ascnameTF.setText(""); //clearing the textfields
        ascageTF.setText("");
        
    }//GEN-LAST:event_ascaddBTNActionPerformed

    private void ascdisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascdisplayBTNActionPerformed
        // TODO add your handling code here:
        //code to display the users saved
        
        //Check if is there anyone in the system
        //if none, display message
        //if any, display them all
        
        ascdisplayTA.setText("");
        SleepCalculator tempasc = new SleepCalculator();
        
        if(count < 0){
           ascdisplayTA.append("No one in system");
        }else{
            for(int i = 0; i <= count; i++){
                tempasc = sclist[i]; 
                //Take next object from array and store it in temp
                ascdisplayTA.append("\n" + sclist[i].details());
                
            }
        }
    }//GEN-LAST:event_ascdisplayBTNActionPerformed

    private void ascsearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascsearchBTNActionPerformed
        // TODO add your handling code here:
        //code to search users
        
        if(count < 0){
            ascdisplayTA.setText("There is no one in the system.");
        }else{
            String searchterm = JOptionPane.showInputDialog(null, "Enter name to search: ");
            for(int i = 0; i <= count; i++){
                if(sclist[i].getName().equalsIgnoreCase(searchterm)){
                    ascdisplayTA.append("\n" + sclist[i].details());
                }
            }
        }
    }//GEN-LAST:event_ascsearchBTNActionPerformed

    private void ascdeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascdeleteBTNActionPerformed
        // TODO add your handling code here:
        //code to delete users
        
        if(count < 0){
            JOptionPane.showMessageDialog(null, "There is no one in the system.");
        }else{
            String searchterm = JOptionPane.showInputDialog(null, "Enter name to delete.");
            for(int i = 0; i <= count; i++){
                if(sclist[i].getName().equalsIgnoreCase(searchterm)){
                    ascdisplayTA.append("\nSleeper deleted: " + sclist[i].details());
                    if(i != 0){
                        sclist[i] = sclist[i-1];
                        count--;
                    }else{
                        sclist[i] = sclist[i+1];
                        count--;
                    }
                }
            }
        }
    }//GEN-LAST:event_ascdeleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SleepCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SleepCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SleepCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SleepCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SleepCalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ascaddBTN;
    private javax.swing.JLabel ascageLBL;
    private javax.swing.JTextField ascageTF;
    private javax.swing.JButton asccalculateBTN;
    private javax.swing.JButton ascdeleteBTN;
    private javax.swing.JButton ascdisplayBTN;
    private javax.swing.JTextArea ascdisplayTA;
    private javax.swing.JButton ascmainpageBTN;
    private javax.swing.JLabel ascnameLBL;
    private javax.swing.JTextField ascnameTF;
    private javax.swing.JButton ascreturnBTN;
    private javax.swing.JButton ascsearchBTN;
    private javax.swing.JLabel ascsubtitle2LBL;
    private javax.swing.JLabel ascsubtitleLBL;
    private javax.swing.JLabel asctitleLBL;
    private javax.swing.JLabel fridayLBL;
    private javax.swing.JTextField fridayTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mondayLBL;
    private javax.swing.JTextField mondayTF;
    private javax.swing.JLabel saturdayLBL;
    private javax.swing.JTextField saturdayTF;
    private javax.swing.JLabel sundayLBL;
    private javax.swing.JTextField sundayTF;
    private javax.swing.JLabel thursdayLBL;
    private javax.swing.JTextField thursdayTF;
    private javax.swing.JLabel tuesdayLBL;
    private javax.swing.JTextField tuesdayTF;
    private javax.swing.JLabel wednesdayLBL;
    private javax.swing.JTextField wednesdayTF;
    // End of variables declaration//GEN-END:variables
}
