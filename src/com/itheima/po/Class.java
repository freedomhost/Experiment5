package com.itheima.po;

import java.util.List;

public class Class {
	Integer id;
	String specialty;
	Integer gradeno;
	Integer classno;
	List<Student> studentlist;

	public Integer getId() {
		return id;
	}

	public List<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Integer getGradeno() {
		return gradeno;
	}

	public void setGradeno(Integer gradeno) {
		this.gradeno = gradeno;
	}

	public Integer getClassno() {
		return classno;
	}

	public void setClassno(Integer classno) {
		this.classno = classno;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", specialty=" + specialty + ", gradeno=" + gradeno + ", classno=" + classno
				+ ", studentlist=" + studentlist + "]";
	}

}
