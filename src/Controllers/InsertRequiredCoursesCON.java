/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.Course;
import Model.TheoryCourse;
import View.CourseReqInsertionUI;
import java.util.ArrayList;

/**
 *
 * @author stathis
 */
public class InsertRequiredCoursesCON {
    
    private Athina university;
    private ArrayList<Course> courses;
    private CourseReqInsertionUI criUI;
    
    //Κατασκευαστής, δημιουργεί το GUI για την 
    //εγγραφή νέων φοιτητών από τη γραμματεία 
    public InsertRequiredCoursesCON(Athina university){
        this.university = university;
        this.courses = university.getCourses();
        this.criUI = new CourseReqInsertionUI(this.university, courses, this);
        this.criUI.setVisible(true);
    }
    
    //Προσθήκη προαπαιτούμενου μαθήματος στο επιλεγμένο μάθημα
    public void addRequiredCourse(Course course, Course requiredCourse){
        
        course.addReqCourse(requiredCourse);
        course.printRequiredCourses();
    }
    
    
}
