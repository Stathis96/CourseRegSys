
package Model;

import Enum.Examino;
import java.sql.Time;
import java.util.ArrayList;

public class Athina {
      private String university;
      private ArrayList<Student> students;
      private ArrayList<Teacher> teachers;
      private ArrayList<Course> courses;
      private ArrayList<Statement> diloseis;
      
      public Athina(){
          students = new ArrayList<>();
          teachers = new ArrayList<>();
          courses = new ArrayList<>();
          diloseis = new ArrayList<>();
      }
      
      //Setters
      public void addStudent(Student student){
          students.add(student);
      }
      
      public void addTeacher(Teacher teacher){
          teachers.add(teacher);
      }
      
      public void addCourse(Course course){
          courses.add(course);
      }
      
      public void addDilosh(Statement dilosh){
          diloseis.add(dilosh);
      }
      
      //Getters
      public ArrayList<Student> getStudents(){
          return students;
      }
      
      public ArrayList<Teacher> getTeachers(){
          return teachers;
      }
      
      public ArrayList<Course> getCourses(){
          return courses;
      }
      
      public ArrayList<Statement> getDiloseis(){
          return diloseis;
      }
}
