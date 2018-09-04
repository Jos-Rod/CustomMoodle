/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataaccess.StudentDAO;
import edu.salle.custommoodle.dataaccess.imple.StudentDAOListSimple;
import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author joser
 */
public class StudentBLO {
    //Business logic object
    
    private StudentDAOListSimple studentDAO = new StudentDAOListSimple(); 
    
    public StudentBLO () {
        
    }
    
    public Student save(Student s) {
        return studentDAO.save(s);
    }
    
    public List<Student> findAll() {
        return studentDAO.findAll();
    }
    
    public Student find(String id) {
        return studentDAO.find(id);
    }
    
    public Student findByLastName(String lastName) {
        return studentDAO.findByLastName(lastName);
    }
    
    public void delete(Student student) {
        studentDAO.delete(student);
    }
    
    public void update(Student student) {
        studentDAO.update(student);
    }
    
}
