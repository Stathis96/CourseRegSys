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
public class LabCourse extends Course {
    private ArrayList <ErgastiriakoTmima> lab = new  ArrayList<>(3); 
    private ArrayList<Course> theoryCourses = new ArrayList<>();

    public LabCourse(String id, String title, String type, int semester, int points) {
        super(id, title, type, semester, points);
        //3. Δημιουργία εργαστ. τμημάτων
        lab.add(new ErgastiriakoTmima("T1", 25));
        lab.add(new ErgastiriakoTmima("T2", 25));
        lab.add(new ErgastiriakoTmima("T3", 25));
    }
    
    //override addReqCourse
    public void addReqCourse(Course course){
        theoryCourses.add(course);
    }
    
    //override printRequiredCourse
    public void printRequiredCourses(){
        System.out.println("Course " + getTitle() + "requires ");
        for(Course course: theoryCourses)
            System.out.println("Course " + course.getId() + " " + course.getTitle());       
    }
    
    public ArrayList<Course> getRequiredCourses(){
        return theoryCourses;
    }
    
  
    
    @Override
    public String toString() {
        return "Ergastirio{ " + super.toString();
    }
}
