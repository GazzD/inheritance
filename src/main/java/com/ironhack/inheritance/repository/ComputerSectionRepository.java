package com.ironhack.inheritance.repository;

import com.ironhack.inheritance.model.ComputerSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerSectionRepository extends JpaRepository<ComputerSection, Integer> {

}
