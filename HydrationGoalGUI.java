/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hydrationtracker;

/*
* HydrationGoalGUI.java
* @author: Stefany Rachor Junges
* 09/11/2024
*/

import javax.swing.JOptionPane;

public class HydrationGoalGUI extends javax.swing.JFrame {    
  
    //Declaring array and count
    HydrationGoal hg[];
    int count;
    
    public HydrationGoalGUI() {
        initComponents();
        //Initializing array
        hg = new HydrationGoal[5];
        //Initializing count with a value of -1 because array index starts at 0
        count = -1;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        subtitleLBL = new javax.swing.JLabel();
        lineSPRT = new javax.swing.JSeparator();
        backBTN = new javax.swing.JButton();
        iconLBL = new javax.swing.JLabel();
        secondTitleLBL = new javax.swing.JLabel();
        ageLBL = new javax.swing.JLabel();
        weightLBL = new javax.swing.JLabel();
        exerciseLBL = new javax.swing.JLabel();
        climateLBL = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        weightTF = new javax.swing.JTextField();
        kgLBL = new javax.swing.JLabel();
        lowRB = new javax.swing.JRadioButton();
        moderateRB = new javax.swing.JRadioButton();
        heavyRB = new javax.swing.JRadioButton();
        warmRB = new javax.swing.JRadioButton();
        coldRB = new javax.swing.JRadioButton();
        resultBTN = new javax.swing.JButton();
        resultTA = new javax.swing.JTextArea();
        yearsLBL = new javax.swing.JLabel();
        helpBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        personLBL = new javax.swing.JLabel();
        searchBTN = new javax.swing.JButton();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 153, 255));

        titleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(0, 153, 255));
        titleLBL.setText("HydroGuide");

        subtitleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        subtitleLBL.setForeground(new java.awt.Color(102, 204, 255));
        subtitleLBL.setText("Stay properly hydrated according to your lifestyle.");

        lineSPRT.setForeground(new java.awt.Color(51, 153, 255));

        backBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        backBTN.setForeground(new java.awt.Color(0, 153, 255));
        backBTN.setText("back to homepage");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        iconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hydrationtracker/handicon.png"))); // NOI18N
        iconLBL.setText("jLabel2");

        secondTitleLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        secondTitleLBL.setForeground(new java.awt.Color(0, 153, 255));
        secondTitleLBL.setText("Let's find out a bit about yourself! Feel free to add up to 5 people for analysis!");

        ageLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ageLBL.setForeground(new java.awt.Color(0, 153, 255));
        ageLBL.setText("What's your age?");

        weightLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        weightLBL.setForeground(new java.awt.Color(0, 153, 255));
        weightLBL.setText("What's your weight?");

        exerciseLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        exerciseLBL.setForeground(new java.awt.Color(0, 153, 255));
        exerciseLBL.setText("What's your exercise level?");

        climateLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        climateLBL.setForeground(new java.awt.Color(0, 153, 255));
        climateLBL.setText("What's the climate type where you live?");

        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        weightTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTFActionPerformed(evt);
            }
        });

        kgLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        kgLBL.setForeground(new java.awt.Color(0, 153, 255));
        kgLBL.setText("kg");

        lowRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(lowRB);
        lowRB.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lowRB.setForeground(new java.awt.Color(0, 153, 255));
        lowRB.setText("low");
        lowRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowRBActionPerformed(evt);
            }
        });

        moderateRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(moderateRB);
        moderateRB.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        moderateRB.setForeground(new java.awt.Color(0, 153, 255));
        moderateRB.setText("moderate");

        heavyRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(heavyRB);
        heavyRB.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        heavyRB.setForeground(new java.awt.Color(0, 153, 255));
        heavyRB.setText("heavy");

        warmRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(warmRB);
        warmRB.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        warmRB.setForeground(new java.awt.Color(0, 153, 255));
        warmRB.setText("warm");

        coldRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(coldRB);
        coldRB.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        coldRB.setForeground(new java.awt.Color(0, 153, 255));
        coldRB.setText("cold");

        resultBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        resultBTN.setForeground(new java.awt.Color(0, 153, 255));
        resultBTN.setText("check my goal intake");
        resultBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBTNActionPerformed(evt);
            }
        });

        resultTA.setEditable(false);
        resultTA.setBackground(new java.awt.Color(255, 255, 255));
        resultTA.setColumns(20);
        resultTA.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        resultTA.setForeground(new java.awt.Color(0, 153, 255));
        resultTA.setLineWrap(true);
        resultTA.setRows(10);
        resultTA.setWrapStyleWord(true);

        yearsLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        yearsLBL.setForeground(new java.awt.Color(0, 153, 255));
        yearsLBL.setText("years");

        helpBTN.setBackground(new java.awt.Color(185, 234, 255));
        helpBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        helpBTN.setForeground(new java.awt.Color(0, 153, 255));
        helpBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hydrationtracker/helpicon_.png"))); // NOI18N
        helpBTN.setBorderPainted(false);
        helpBTN.setContentAreaFilled(false);
        helpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBTNActionPerformed(evt);
            }
        });

        addBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        addBTN.setForeground(new java.awt.Color(0, 153, 255));
        addBTN.setText("add new person");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        personLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        personLBL.setForeground(new java.awt.Color(102, 204, 255));
        personLBL.setText("Person 1");

        searchBTN.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        searchBTN.setForeground(new java.awt.Color(0, 153, 255));
        searchBTN.setText("search for person goal");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        nameLBL.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        nameLBL.setForeground(new java.awt.Color(0, 153, 255));
        nameLBL.setText("What's your name?");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultTA)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backBTN)
                                    .addComponent(subtitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(ageLBL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(weightLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(exerciseLBL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lowRB)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(moderateRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(heavyRB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(helpBTN))
                                            .addComponent(kgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(titleLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(climateLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(warmRB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(coldRB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(92, 92, 92))
                                        .addComponent(secondTitleLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(resultBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchBTN)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lineSPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(personLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(backBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLBL)
                    .addComponent(iconLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondTitleLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personLBL)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearsLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLBL)
                    .addComponent(weightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kgLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(heavyRB, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(helpBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exerciseLBL)
                        .addComponent(lowRB)
                        .addComponent(moderateRB)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(climateLBL)
                    .addComponent(warmRB)
                    .addComponent(coldRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultBTN)
                        .addComponent(addBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultTA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        HydrationTrackerGUI hygui = new HydrationTrackerGUI();
        hygui.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    //Methods created to reduce the amount of code in the buttons
    //Method that appends aditional information to the text area
    private void append(){
        resultTA.append(" \nINFO: Weight, age, exercise level and climate"
                    + " affect hydration needs because they influence"
                    + " how much water the body uses and loses! For example, more water"
                    + " is needed to support larger body sizes, younger"
                    + " bodies tend to be more efficient at retaining water,"
                    + " exercising increases fluid loss and hot climates"
                    + " increase sweating. For more details, check the NIH Office of Dietary Supplements website.");
    }
    
    //Method that handles user input
    private HydrationGoal createNewPerson(){
        //Getting value from the text fields
        String name = nameTF.getText();
        int age = Integer.parseInt(ageTF.getText());
        double weight = Double.parseDouble(weightTF.getText());
        String exerciseLevel = defineExerciseLevel();
        String climate = defineClimate();
   
        //Passing the values to the class that will handle calculations
        return new HydrationGoal(name, age, weight, exerciseLevel, climate);
    }
    
    //Method that adds a new person to the array
    private void addPerson(){
            //Person was added, so count goes up
            count++;
            if((count <= hg.length-1)){
            //Assigning the return object of the method to variable person
            HydrationGoal person = createNewPerson();
            //Current index of the array hg is a new person
            hg[count] = person;
            //Displaying which person was added
            resultTA.setText("Person " + (count+1) + " added!\n");
            //Calling the method to clear the text fields
            clearFields();
            
            //If maximum number of possible people have been reached, change label
            if ((count+2)==(hg.length+1)){
                personLBL.setText("Maximum number of persons reached");
            }else{
                //Adding 2 because count starts at -1
                personLBL.setText("Person " + (count+2));
            }
        
        //Displaying message to the user if max index has been reached
        } else {
            JOptionPane.showMessageDialog(null, "Reached maximum number of people added");}
    }
    
    //Method that searches people stored in the array
    private void searchPerson(){
        //Setting an empty placeholder to assign a value later
        HydrationGoal searchPerson = null;
        //Boolean to check if the person was found or not
        boolean found = false;
        //Clearing text area
        resultTA.setText("");
        
            //If the add button hasn't been pressed
            if (count < 0){
                JOptionPane.showMessageDialog(null, "No one was added. Try again!");
            } else {
                //Ask for user input
                String search = JOptionPane.showInputDialog(null, "Input a name");
                //Looping through the array
                for (int i = 0; i < hg.length; i++){
                    //If there's value stored in the array and the name corresponds to one of them
                    if(hg[i] != null && hg[i].getName().equalsIgnoreCase(search)){
                        //Assign current index of the array to the searchPerson
                        searchPerson = hg[i];
                        //Person was found, so true
                        found = true;
                        break;
                    }
                }
        
            //If person hasn't been found, show message to the user
            if (!found){
                JOptionPane.showMessageDialog(null, "This person was not added. Please try again.");
            }

            }

            //If a value has been assigned to searchPerson, show feedback
            if (searchPerson != null){
                resultTA.setText(searchPerson.feedback());
                //Calling method append() for additional information
                append();
                }
    }
    
    //Method that handles and defines user input related to exercise
    private String defineExerciseLevel(){
        //If radio button is selected, return accordingly
        if (lowRB.isSelected()) {
            return "low";
        } else if (moderateRB.isSelected()) {
            return "moderate";
        } else if (heavyRB.isSelected()) {
            return "heavy";
        } else {
            return "Climate not specified";
        }
    }
    
    //Method that handles and defines user input related to climate
    private String defineClimate(){
        //If radio button is selected, return accordingly
        if (coldRB.isSelected()){
            return "cold";
        } else {
            return "warm";
        }
    }
    
    //Method that clears the text fields
    private void clearFields(){
        nameTF.setText("");
        ageTF.setText("");
        weightTF.setText("");
    }
    
    //Method that checks if every field/radio button is filled/selected
    private boolean checkEmpty(){
        
        if (nameTF.getText().isEmpty() || ageTF.getText().isEmpty() || weightTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            return true;
        } else if (!lowRB.isSelected() && !moderateRB.isSelected() && !heavyRB.isSelected()){
            JOptionPane.showMessageDialog(null, "Please check an exercise level");
            return true;
        } else if (!warmRB.isSelected() && !coldRB.isSelected()){
            JOptionPane.showMessageDialog(null, "Please check a climate type");
            return true;
        } else {
            return false;
        }
    }
    
    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void lowRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowRBActionPerformed

    private void weightTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTFActionPerformed

    private void resultBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultBTNActionPerformed

        //Calling the method to check if the text fields and radio buttons are filled/selected
        if (!checkEmpty()){
            //Assigning the return object of the method to variable person
            HydrationGoal person = createNewPerson();
            //Clearing the text area
            resultTA.setText("");
            //Adding feedback() method to the text area
            resultTA.setText(person.feedback());
            //Calling the method append() for additional information
            append(); 
        }
        
    }//GEN-LAST:event_resultBTNActionPerformed

    private void helpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBTNActionPerformed
        //Displaying information to the user and changing the window name
        JOptionPane.showMessageDialog(null, "Low: 1-2 days/week"
            + "\nModerate: 3-4 days/week"
            + "\nHeavy: 5+ days/week");
    }//GEN-LAST:event_helpBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed

        //Calling the method to check if the text fields and radio buttons are filled/selected
        if (!checkEmpty()){
            //Calling method that adds a person to the array
            addPerson();
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        searchPerson();
    }//GEN-LAST:event_searchBTNActionPerformed

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
            java.util.logging.Logger.getLogger(HydrationGoalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HydrationGoalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HydrationGoalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HydrationGoalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HydrationGoalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addBTN;
    private javax.swing.JLabel ageLBL;
    public javax.swing.JTextField ageTF;
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel climateLBL;
    public javax.swing.JRadioButton coldRB;
    private javax.swing.JLabel exerciseLBL;
    public javax.swing.JRadioButton heavyRB;
    private javax.swing.JButton helpBTN;
    private javax.swing.JLabel iconLBL;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kgLBL;
    private javax.swing.JSeparator lineSPRT;
    public javax.swing.JRadioButton lowRB;
    public javax.swing.JRadioButton moderateRB;
    private javax.swing.JLabel nameLBL;
    public javax.swing.JTextField nameTF;
    private javax.swing.JLabel personLBL;
    protected javax.swing.JButton resultBTN;
    private javax.swing.JTextArea resultTA;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel secondTitleLBL;
    private javax.swing.JLabel subtitleLBL;
    private javax.swing.JLabel titleLBL;
    public javax.swing.JRadioButton warmRB;
    private javax.swing.JLabel weightLBL;
    public javax.swing.JTextField weightTF;
    private javax.swing.JLabel yearsLBL;
    // End of variables declaration//GEN-END:variables
}