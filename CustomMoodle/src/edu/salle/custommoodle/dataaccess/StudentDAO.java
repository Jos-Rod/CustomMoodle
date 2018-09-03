/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataaccess;

import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author joser
 */
public interface StudentDAO {
    //Operaciones de base de datos, es la interfaz\
    
    
    
    public Student save(Student s);
    
    public List<Student> findAll();
    
    public Student find(String id);
    
}
