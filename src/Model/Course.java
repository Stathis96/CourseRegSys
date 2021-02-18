
package Model;

import java.util.ArrayList;


public abstract class Course {
    private String id;
    private String title;
    private String type;
    private double grade;
    private int semester;
    private int points;
    

    public Course(String id, String title, String type, int semester, int points){
        this.id = id;
        this.title = title;
        this.type = type;
        this.semester = semester;
        this.points = points;
    }
    
    //Εισαγωγή βαθμολογίας μαθήματος
    public void setGrade(double grade){
        this.grade = grade;
    }
    
    //Getters
    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    
    public String getType(){
        return type;
    }

    public double getGrade(){
        return grade;
    }

    public int getSemester(){
        return semester;
    }

    public int getPoints(){
        return points;
    }
   
    public abstract ArrayList<Course> getRequiredCourses();
  
    public abstract void addReqCourse(Course course);
    
    public abstract void printRequiredCourses();
    
    //Override toString() method
    public String toString(){
        return this.id + this.title + this.semester + this.grade + this.points ;
    }
   /* 
   public boolean elegxosData(){
        return !(this.onoma.equals(""));
    }
    */
}
