package com.growskill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.growskill.model.Instructor;
import com.growskill.repository.InstructorRepository;
import com.growskill.Exception.*;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor getInstructorById(Long id) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(id);
        return optionalInstructor.orElseThrow(()->new NotFoundException("Instructor not found with Id ")); 
    }

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public void updateInstructor(Long id, Instructor instructorDetails) {
        Optional<Instructor> optionalInstructor = instructorRepository.findById(id);
        if (optionalInstructor.isPresent()) {
            Instructor instructor = optionalInstructor.get();
            instructor.setName(instructorDetails.getName());
            instructorRepository.save(instructor);
        } else {
            throw new RuntimeException("Instructor not found");
        }
    }

    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}

