/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.dataaccess.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.dataaccess.StudentDAO;
import edu.salle.custommoodle.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joser
 */
public class StudentDAOListSimple implements StudentDAO {
//Implementacion de la interfaz para trabajar con archivos
    private static List<Student> studentList = new ArrayList<>();
    
    @Override
    public Student save(Student s) {
        String id = Integer.toString(studentList.size() + 1);
        s.setId(id);
        studentList.add(s);
        return s;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student find(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        
        List<Student> resstudentList = new ArrayList();
        lastName = lastName.toLowerCase().trim(); //trim quita los espacios
        Student res = null;
        for (Student student: studentList) {
            
            if (student.getLastName().toLowerCase().contains(lastName) || student.getName().toLowerCase().contains(lastName)) {
                resstudentList.add(student);
            }
            
        }
        return resstudentList;
        
    }

    @Override
    public void delete(Student student) {
        
        studentList.remove(student);
        
    }

    @Override
    public void update(Student student) {
        
        int pos = studentList.indexOf(student);
        studentList.set(pos, student);
        
    }

    @Override
    public void load() {
        
        try {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("students.json"));

            studentList = gson.fromJson(br, new TypeToken<List<Student>>() {}.getType());
            br.close();
            
            if (studentList == null) {
                studentList = new ArrayList();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void commitChanges() {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("students.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
