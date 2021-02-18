/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.Student;
import Model.Account;
import View.DiaxeirisiLogariasmwnUI;


public class DilosiLogariasmwnCON {
    private Athina university;
    private Student student;
    private Account log;
    private DiaxeirisiLogariasmwnUI dpUI;
    
    //Κατασκευαστής, δημιουργεί το GUI για την 
    //εγγραφή νέων φοιτητών από τη γραμματεία 
    public DilosiLogariasmwnCON(Athina university){
        this.university = university;
        this.dpUI = new DiaxeirisiLogariasmwnUI(this);
        this.dpUI.setVisible(true);
    }
    
    
    public void addStudent(String surname, String name, String username, String password,
            String phone, String email, String dateOfEnroll){
        //Κλήση κατασκευαστή Foititi
        student = new Student(name, surname);
        //Κλήση κατασκευαστή Account
        log = new Account(username, password, phone, email, dateOfEnroll);
        //Aποθηκεύουμε τον λογαριασμό στον φοιτητή 
        student.setLog(log);
        //Προσθήκη του φοιτητή στη λίστα φοιτητών της σχολής
        university.addStudent(student);
        
        System.out.println("Student created and added to students list of university");
    }
    
}
 

