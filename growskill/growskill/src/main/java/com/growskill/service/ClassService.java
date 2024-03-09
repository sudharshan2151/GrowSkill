package com.growskill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.growskill.Exception.NotFoundException;
import com.growskill.model.ClassM;
import com.growskill.repository.ClassRepository;

@Service
public class ClassService {

    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<ClassM> getAllClasses() {
        return classRepository.findAll();
    }

    public ClassM getClassById(Long id) {
        Optional<ClassM> optionalClass = classRepository.findById(id);
        return optionalClass.orElseThrow(()->new NotFoundException("No class with the Id")); 
    }

    public ClassM createClass(ClassM classObj) {
        return classRepository.save(classObj);
    }

    public void updateClass(Long id, ClassM classDetails) {
        Optional<ClassM> optionalClass = classRepository.findById(id);
        if (optionalClass.isPresent()) {
            ClassM classObj = optionalClass.get();
            classObj.setTopic(classDetails.getTopic());
            classObj.setDate(classDetails.getDate());
            classObj.setZoomLink(classDetails.getZoomLink());
            classRepository.save(classObj);
        } 
            throw new NotFoundException("No Class Found with the Id");
        
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}

