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
import View.InsertGradeFromTeacherUI;
import java.util.ArrayList;

/**
 *
 * @author stathis
 */
public class InsertGradesFromTeacherCON {
    private Athina university;
    private Teacher teacher;
    private ArrayList<Statement> statements;
    private InsertGradeFromTeacherUI insertFromTeacherUI;
    
    public InsertGradesFromTeacherCON(Athina university, Teacher teacher){
        this.university = university;
        this.teacher = teacher;
        statements = this.university.getDiloseis();
        this.insertFromTeacherUI = new InsertGradeFromTeacherUI(this.teacher, this.university, this);
        this.insertFromTeacherUI.setVisible(true);
    }
    
    public void addGrade(Student student, Course course, double grade, String dateOfExams){
        //Βρήσκουμε τη δήλωση του φοιτητή
        for(Statement statement:statements){
            if(statement.getStudent().getSurname().equals(student.getSurname()) &&
                statement.getCourse().getId().equals(course.getId())){
                //Παιρνάμε τη βαθμολογία στο statement
                statement.setGrade(grade);
                statement.setDateOfExams(dateOfExams);
                System.out.println("Grades stored in statement");
                break;
            }
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
