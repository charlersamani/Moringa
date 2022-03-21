package com.amani.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amani.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
