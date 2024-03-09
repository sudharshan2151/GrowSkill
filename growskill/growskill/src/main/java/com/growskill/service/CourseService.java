package com.growskill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.growskill.Exception.NotFoundException;
import com.growskill.model.Course;
import com.growskill.repository.CourseRepository;
import com.growskill.repository.InstructorRepository;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepsoitory;

    @Autowired
    public CourseService(CourseRepository courseRepository,InstructorRepository instructorRepsoitory) {
        this.courseRepository = courseRepository;
        this.instructorRepsoitory=instructorRepsoitory;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        return optionalCourse.orElse(null); // Return null if course not found
    }

    public List<Course> getCoursesByInstructor(Long instructorId) {
        return instructorRepsoitory.findByInstructorId(instructorId);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public void updateCourse(Long id, Course courseDetails) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.setName(courseDetails.getName());
            courseRepository.save(course);
        } else {
            throw new NotFoundException("Course not found");
        }
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
