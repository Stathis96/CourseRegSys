/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author stathis
 */
public class TheoryCourse extends Course {
    //Προαπαιτούμενα μαθήματα
    private ArrayList<Course> requiredCourses = new ArrayList<>();
    
    public TheoryCourse(String id, String title, String type, int semester, int points) {
        super(id, title, type, semester, points);
    }
    
    //Εισαγωγή προαπαιτούμενων μαθημάτων
    public void addReqCourse(Course course) {
        requiredCourses.add(course);
    }
    
    public ArrayList<Course> getRequiredCourses(){
        return requiredCourses;
    }
    
    public boolean hasRequiedCourse(){
        if(requiredCourses.isEmpty())
            return false;
        else
            return true;
    }
    
    
    public void printRequiredCourses(){
        System.out.println("Course " + getTitle() + "requires ");
        for(Course course: requiredCourses)
            System.out.println("Course " + course.getId() + " " + course.getTitle());       
    }

    @Override
    public String toString() {
        return "Theoria{ " + super.toString();
    }
}
