/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.Statement;
import Model.Student;
import Model.Teacher;
import Model.Course;
import View.InsertGradesFromGrammateiaUI;
import java.util.ArrayList;

/**
 *
 * @author stathis
 */
public class InsertGradesFromGrammateiaCON {
    private Athina university;
    private ArrayList<Statement> statements = new ArrayList<>();
    private InsertGradesFromGrammateiaUI insertFromGrammateiaUI;
    
    public InsertGradesFromGrammateiaCON(Athina university){
        this.university = university;
        this.insertFromGrammateiaUI = new InsertGradesFromGrammateiaUI(this.university, this);
        this.insertFromGrammateiaUI.setVisible(true);
    }
    
    public void addGrade(Student student, Course course, double grade, String dateOfExams){
        //Βρήσκουμε τη δήλωση του φοιτητή
        boolean found = false;
        Statement state = null;
        statements = this.university.getDiloseis();
        System.out.println("Statements size " + statements.size());
        for(Statement statement:statements){
            if(statement.getStudent().getSurname().equals(student.getSurname()) &&
                statement.getCourse().getId().equals(course.getId())){
                found = true;
                state = statement;
                break;
            }
        }
        
        if(found){
            //Παιρνάμε τη βαθμολογία στο statement
                state.setGrade(grade);
                state.setDateOfExams(dateOfExams);
                System.out.println("Grades stored in statement");
        }
        
        //Παιρνάμε τη βαθμολογία και στο μάθημα του φοιτητή
        ArrayList<Course> studentCourses = student.getCourses();
        for(Course c: studentCourses){
            if(c.getId().equals(course.getId())){
                c.setGrade(grade);
                System.out.println("Grade stored in student");
                break;
            }
        }
    }
}
