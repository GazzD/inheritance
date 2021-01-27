package com.ironhack.inheritance.repository;

import com.ironhack.inheritance.model.MathSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathSectionRepository extends JpaRepository<MathSection, Integer> {
}
