/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.InsertGradesFromGrammateiaCON;
import Model.Athina;
import Model.Student;
import Model.Course;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author stathis
 */
public class InsertGradesFromGrammateiaUI extends javax.swing.JFrame {

    private Athina university;
    private ArrayList<Student> students;
    private Student mainStudent;
    private ArrayList<Course> courses;
    private InsertGradesFromGrammateiaCON igfgCON;
    public InsertGradesFromGrammateiaUI(Athina university, InsertGradesFromGrammateiaCON igfgCON) {
        this.university = university;
        this.igfgCON = igfgCON;
        initComponents();
        
        students = university.getStudents();
        courses = university.getCourses();
        
        //Εμφανίζουμε τα ονοματα των φοιτητών στο comboBox
        for(Student student:students)
            studentsCmb.addItem(student.getSurname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        studentsCmb = new javax.swing.JComboBox<>();
        coursesCmb = new javax.swing.JComboBox<>();
        dateInput = new javax.swing.JTextField();
        gradeInput = new javax.swing.JTextField();
        addGradeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ΓΡΑΜΜΑΤΕΙΑ ΠΑΝΕΠΙΣΤΗΜΙΟΥ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Εισαγωγή Βαθμολογιών");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Επιλογή Φοιτητή: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Επιλογή Μαθήματος:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ημερομηνία Εξέτασης:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Βαθμός:");

        studentsCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsCmbActionPerformed(evt);
            }
        });

        addGradeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addGradeBtn.setText("ΠΡΟΣΘΗΚΗ ΒΑΘΜΟΥ");
        addGradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradeBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("ΠΙΣΩ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addGradeBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentsCmb, 0, 194, Short.MAX_VALUE)
                            .addComponent(coursesCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateInput)
                            .addComponent(gradeInput))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(studentsCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(coursesCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gradeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addGradeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addGradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradeBtnActionPerformed
        //Παίρνουμε τα δεδομένα της φόρμας
        Student student = students.get(studentsCmb.getSelectedIndex());
        Course course = mainStudent.getCourses().get(coursesCmb.getSelectedIndex());
        double grade = Double.parseDouble(gradeInput.getText());
        String date = dateInput.getText();
        
        if(gradeInput == null || grade < 0 || grade > 10 ){
            JOptionPane.showMessageDialog(null, "Please enter a valid grade", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            igfgCON.addGrade(student, course, grade, date);
        }
        
        //Καθαρισμός πεδίων 
        dateInput.setText(null);
        gradeInput.setText(null);
    }//GEN-LAST:event_addGradeBtnActionPerformed

    private void studentsCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsCmbActionPerformed
        //Κάθε φορά που επιλέγουμε έναν φοιτητή 
        //Εμφανίζονται τα μαθήματα που έχει δηλώσει
        //Παίρνουμε τον Φοιτητη
        Student selectedStudent;
        ArrayList<Course> selectedStudentCourses;
        selectedStudent = students.get(studentsCmb.getSelectedIndex());
        mainStudent = selectedStudent;
        //Παίρνουμε τα μαθήματα του επιλεγμένου φοιτητή
        selectedStudentCourses = selectedStudent.getCourses();
        
        //Καθαρίζουμε το comboBox
        coursesCmb.removeAllItems();
        
        //Τοποθετούμε τα μαθήματα του φοιτητή στο δεύτερο comboBox
        for(Course course:selectedStudentCourses)
            coursesCmb.addItem(course.getTitle());
    }//GEN-LAST:event_studentsCmbActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGradeBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> coursesCmb;
    private javax.swing.JTextField dateInput;
    private javax.swing.JTextField gradeInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> studentsCmb;
    // End of variables declaration//GEN-END:variables
}
