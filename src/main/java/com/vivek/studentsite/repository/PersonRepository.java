package com.vivek.studentsite.repository;

import com.vivek.studentsite.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Student, Integer> {
}
