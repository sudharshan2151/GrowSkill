package com.growskill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.growskill.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
