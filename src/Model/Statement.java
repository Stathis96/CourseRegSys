
package Model;

import java.util.ArrayList;

public class Statement {
    private Student student;
    private Course course;
    private String dateOfEnrollment;
    private String message;
    private String dateOfExams;
    private double grade;

    public Statement(Student student, Course course, String dateOfEnrollment){
        this.student = student;
        this.course = course;
        this.dateOfEnrollment = dateOfEnrollment;
    }
    
    //Setters
    public void setMessage(String message){
        this.message = message;
    }
    
    public void setDateOfExams(String date){
        this.dateOfExams = date;
    }
    
    public void setGrade(Double grade){
        this.grade = grade;
    }
    
    //Getters
    public Student getStudent(){
        return student;
    }
    
    public Course getCourse(){
        return course;
    }
    
    public String getDateOfEnrollment(){
        return dateOfEnrollment;
    }
    
    public String getMessage(){
        return message;
    }
    
    public String getDateOfExams(){
        return dateOfExams;
    }
    
    public double getGrade(){
        return grade;
    }
    
    
}
