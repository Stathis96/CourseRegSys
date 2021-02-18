/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.LabCourse;
import Model.Course;
import Model.TheoryCourse;
import View.CourseCreationUI;
import java.util.ArrayList;

/**
 *
 * @author stathis
 */

public class CreateCourseCON {
    private Athina university;
    private Course course;
    private CourseCreationUI ccUI;
    
    //Κατασκευαστής, δημιουργεί το GUI για την 
    //εγγραφή νέων φοιτητών από τη γραμματεία 
    public CreateCourseCON(Athina university){
        this.university = university;
        this.ccUI = new CourseCreationUI(this);
        this.ccUI.setVisible(true);
    }
    
    public void createCourse(String courseId, String courseTitle, String courseType, int semester, int points){
        
        if(courseType.equals("Θ") || courseType.equals("θ")){
            //Δημιουργία θεωριτικού μαθήματος
            this.course = new TheoryCourse(courseId, courseTitle, courseType, semester, points);
            
        }else{
            //Δημιουργία εργαστηριακού μαθήματος
            this.course = new LabCourse(courseId, courseTitle, courseType, semester, points);
        }
        //Προσθήκη μαθήματος στην λίστα μαθημάτων του πανεπιστημίου
        university.addCourse(course);
        
        //Εκτύπωση λίστας μαθημάτων για επαλήθευση
        ArrayList<Course> courseList = university.getCourses();
        
        for(Course course:courseList)
            System.out.println(course.getId() + " " + course.getTitle());
    }
}
