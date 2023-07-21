package com.programacionparaaprender.validatedemo;

import java.io.Serializable;
import java.util.List;
import java.util.LinkedList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.programacionparaaprender.models.Student;



@ManagedBean
@ApplicationScoped
public class StudentDataUtilBean implements Serializable {

	private List<Student> students;
	
	public StudentDataUtilBean() {
		loadSampleData();
	}
	
	public void loadSampleData() {
		students = new LinkedList<Student>();
		students.add(new Student("Mary", "Public", "mary@programacionparaaprender.com"));
		students.add(new Student("Jhon", "Doe", "jhon@programacionparaaprender.com"));
		students.add(new Student("Ajay", "Rao", "ajay@programacionparaaprender.com"));
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	
}
