/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.Teacher;
import Model.Account;
import View.CreateTeacherUI;

/**
 *
 * @author stathis
 */
public class CreateTeacherCON {
    private Athina university;
    private Teacher teacher;
    private Account log;
    private CreateTeacherUI ctUI;
    
    public CreateTeacherCON(Athina university){
        this.university = university;
        this.ctUI = new CreateTeacherUI(this);
        this.ctUI.setVisible(true);
    }
    
    public void addTeacher(String surname, String name, String specialty, String username, String password,
            String phone, String email, String dateOfEnroll){
        //Κλήση κατασκευαστή Teacher
        teacher = new Teacher(surname, name, specialty);
        //Κλήση κατασκευαστή Account
        log = new Account(username, password, phone, email, dateOfEnroll);
        //Aποθηκεύουμε τον λογαριασμό στον καθηγητή 
        teacher.setLog(log);
        //Προσθήκη του καθηγητη στη λίστα καθηγητών της σχολής
        university.addTeacher(teacher);
        System.out.println("Teacher created. Added to teachers list of university");
    }
}
