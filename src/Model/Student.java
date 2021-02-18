
package Model;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Account log;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }
    
    public void setLog(Account log){
        this.log = log;
    }

    public String getOnoma() {
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    //Επιστρέφουν τα στοιχεία του λογαριασμού του Φοιτητή
    public String getUsername(){
         return log.getUsername();
    }
     
    public String getPassword(){
        return log.getPassword();
    }
     
    public String getPhone(){
        return log.getKinito();
    }
     
    public String getDateOfEnroll(){
        return log.getHmeromEggrafis();
    }
    //Επιστρέφει true αν ο φοιτητής έχει εγγραφεί στο μαθημα course
    public boolean checkIfEnrolled(Course course){
        if(courses.contains(course))
            return true;
        else
            return false;
    }
    
    //Επιστρέφει true αν ο φοιτητής έχει περάσει το μάθημα
    public boolean checkIfPass(Course course){
        double studentGrade = -1;
        if(checkIfEnrolled(course)){//Check αν εχει γραφτεί στο μάθημα
            for(Course c: courses){//βρίσκουμε τομ βαθμό
                if(c.getId().equals(course.getId())){
                    studentGrade = c.getGrade();
                    break;
                }     
            }
            if(studentGrade >= 5)
                return true;
            else
                return false;
            
        }else{//δεν εχει γραφετεί στο μάθημα
            return false;
        }
        
    }
    
    public void printData(){
        System.out.println("Student Created");
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Username " + log.getUsername());
        System.out.println("Password " + log.getPassword());
        System.out.println("Email " + log.getEmail());
        System.out.println("Phone " + log.getKinito());
        System.out.println("Date of enrollment " + log.getHmeromEggrafis());
    }
}
