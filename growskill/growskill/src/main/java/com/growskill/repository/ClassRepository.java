package com.growskill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.growskill.model.ClassM;

@Repository
public interface ClassRepository extends JpaRepository<ClassM, Long> {
}
