package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface will automatically provide CRUD operations for the Student entity
    // No need to implement any methods, JpaRepository does it for us



}
