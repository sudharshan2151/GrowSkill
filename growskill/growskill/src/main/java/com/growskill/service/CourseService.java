package com.growskill.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.growskill.model.Course;
import com.growskill.repository.CourseRepository;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    
}
