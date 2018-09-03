/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.view.StudentWindow;
import java.util.List;

/**
 *
 * @author joser
 */
public class App {
    
    public static void main(String[] args) {
        
//        Student s1 = new Student("Alex", "Cornejo");
//        Student s2 = new Student("Francisco", "Melendez");
//        Student s3 = new Student("Regina", "Farnea");
//        Student s4 = new Student("Gerardo", "Zarandile");
//        
//        StudentBLO sBLO = new StudentBLO();
//        sBLO.save(s1);
//        sBLO.save(s2);
//        sBLO.save(s3);
//        sBLO.save(s4);
//        
//        List<Student> studentList = sBLO.findAll();
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//        
//        System.out.println(s1);

            StudentWindow window = new StudentWindow();
            window.setVisible(true);
        
    }
    
    
}
