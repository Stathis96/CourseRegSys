/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Athina;
import Model.Course;
import Model.Student;
import Model.TheoryCourse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class DilosiMathimatwnCONTest {
    
    public DilosiMathimatwnCONTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createStatement method, of class DilosiMathimatwnCON.
     */
    @Test
    public void testCreateStatement() {
        System.out.println("createStatement");
        //Δημιουργία αντικειμένου Αθηνά 
        Athina university = new Athina();
        //Δημιουργία αντικειμένου Student
        Student student = new Student("Nick", "Kalathes");
        //Προσθήκη του student στη λίστα της σχολής
        university.addStudent(student);
        //Δημιορυγία μαθημάτων
        Course apTheory = new TheoryCourse("1205-Θ","Object Oriented Programming","Θ",1,25);
        Course ddTheory = new TheoryCourse("1305-Θ","Data Structures & Algorithms","Θ",1,25);
        //Προσθήκη μαθημάτων στη λίστα μαθημάτων
        university.addCourse(apTheory);
        university.addCourse(ddTheory);
        ddTheory.addReqCourse(apTheory);
        //Δήλωση μαθήματος ddTheory από φοιτητή χωρίς να δηλώσει το apTheory που είναι προαπαιτούμενο
        String date = "1/1/1";
        DilosiMathimatwnCON instance = new DilosiMathimatwnCON(university, student);
        instance.createStatement(student, ddTheory, date);
        //Τιμη που περιμένουμε να επιστρέψει η createStatement
        boolean expected = false;
        //Tιμή που επιστρέφει η createStatement
        boolean actual = instance.createStatement(student, ddTheory, date);
        assertEquals(expected, actual);
    }
    
}
