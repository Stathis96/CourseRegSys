/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import View.ShowStudentsUI;

/**
 *
 * @author stathis
 */
public class ShowStudentsCON {
    private Athina university;
    private ShowStudentsUI ssUI;
    
    public ShowStudentsCON(Athina university){
        this.university = university;
        this.ssUI = new ShowStudentsUI(this.university);
        this.ssUI.setVisible(true);
    }
}
