
package Model;

import java.util.ArrayList;
import java.util.Date;

public class Teacher {
    private String name;
    private String surname;
    private String specialty;
    private Account log;


    public Teacher(String surname, String name, String specialty){
        this.surname = surname;
        this.name = name;
        this.specialty = specialty;
    }
    
    public void setLog(Account log){
        this.log = log;
    }
    
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
    
    public String getSpecialty(){
        return specialty;
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
     
      
}
