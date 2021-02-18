/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


/**
 *
 * @author FUJITSU USER
 */
import Model.Athina;
import Model.Course;
import Model.Statement;
import Model.Student;
import View.EnrollInCoursesUI;
import java.util.ArrayList;

public class DilosiMathimatwnCON {
    private Athina university;
    private EnrollInCoursesUI ecUI;
    private Student student;
    private Statement enrollment;
        
        
        
    public DilosiMathimatwnCON(Athina university, Student student) {
        this.university = university;
        this.student = student;
        this.ecUI = new EnrollInCoursesUI(this.student, this.university, this);
        this.ecUI.setVisible(true);
    }
    
    public boolean createStatement(Student student, Course course, String date){
        //Δημιουργία δήλωσης του φοιτητή
        Statement statement = new Statement(student, course, date);
        
        //Αποθήκευση της δήλωσης στις δηλώσεις του πανεπιστημίου
        university.addDilosh(statement);
        
        //Εξέταση της δήλωσης ως προς την εγκυρότητά της
        //Αν το μάθημα είναι θεωρητικό εξετάζουμε αν έχει προαπαιτούμενα μαθήματα
        ArrayList<Course> requiredCourses;
        boolean validStatement =  true;
        
        //Αν το μάθημα είναι θεωρητικό
        if(course.getType().equals("θ") || course.getType().equals("Θ")){
            //Παίρνουμε για το συγκεκριμένο μάθημα τα προαπαιτούμενά του
            requiredCourses = course.getRequiredCourses();
            if(requiredCourses.isEmpty() == false){//Το μάθημα έχει προαπαιτούμενα
                System.out.println(course.getTitle() + " has required courses");
                for(Course requiredCourse : requiredCourses){
                       System.out.println(requiredCourse.getTitle());
                       //Αν ο φοιτητής έχει εγγραφεί και εσει περάσει το μάθημα
                       if(student.checkIfEnrolled(requiredCourse) && student.checkIfPass(requiredCourse))
                           validStatement = true;
                       else{
                           validStatement = false;
                           break;
                       }
                }
            }
        }
        
        //Αν το μάθημα είναι εργαστηριακό 
        if(course.getType().equals("ε") || course.getType().equals("Ε")){
            //Παίρνουμε για το συγκεκριμένο μάθημα το προαπαιτούμενό του
            requiredCourses = course.getRequiredCourses();
            if(requiredCourses.isEmpty() == false){//Το μάθημα έχει προαπαιτούμενα
                System.out.println(course.getTitle() + " has required courses");
                for(Course requiredCourse : requiredCourses){
                       System.out.println(requiredCourse.getTitle());
                       //Αν ο φοιτητής έχει εγγραφεί και εσει περάσει το μάθημα
                       if(student.checkIfEnrolled(requiredCourse) || student.checkIfPass(requiredCourse))
                           validStatement = true;
                       else{
                           validStatement = false;
                           break;
                       }
                }
            }
        }
        
        //Προσθήκη του μαθήματος στον Φοιτητή αν η δήλωση είναι έγκυρη
        if(validStatement){
            student.addCourse(course);
            System.out.println("Course added to student");
            statement.setMessage("Επιτυχής");
            return true;
        }else{
            System.out.println("Course did not added to student");
            statement.setMessage("Μη Επιτυχής");
            return false;
        }
        
    }
    
    
    
}

    
    
    

