package com.pro;

import java.util.*;

public class StudentImpl {

		private static List<Student> studentattnd;

		 

	    public StudentImpl() {
	        super();
	        // TODO Auto-generated constructor stub
	        initializeStudentCatalog();
	    }
	    public Student searchById(int id) throws Exception 
	    {
	        for(Student p: studentattnd) if(p.getId()==id) return p;
	        throw new Exception("No student found with id " + id );
	    }
	    
	    public Student[] getAllStudents() {
	        Student[] rolls = new Student[studentattnd.size()];
	        int i = 0;
	        for(Student p: studentattnd) {
	            rolls[i]=p;
	            i++;
	        }
	        return rolls;
	        
	    }
	    
	    public void insertStudent(Student product)
	{
	        studentattnd.add(product);}
	    
	    public void initializeStudentCatalog() {
	        if (studentattnd ==null) {
	            studentattnd= new ArrayList<Student>();
	            studentattnd.add(new Student(1,"Nikki"));
	}
	        }
	}