package com.growskill.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.growskill.model.Course;
import com.growskill.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

	@Query("select a.courses from Instructor a where a.id=:instructorId")
	List<Course> findByInstructorId(@Param("instructorId") Long instructorId);
}
