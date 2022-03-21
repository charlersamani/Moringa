package com.amani.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amani.sms.entity.Student;
import com.amani.sms.repository.StudentRepository;
import com.amani.sms.service.StudentService;

@Service
public class StudentServeceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServeceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
