package com.ironhack.inheritance.repository;

import com.ironhack.inheritance.model.ComputerSection;
import com.ironhack.inheritance.model.MathSection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ComputerSectionRepositoryTest {

    @Autowired
    private ComputerSectionRepository computerSectionRepository;

    @Autowired
    private MathSectionRepository mathSectionRepository;

    @Test
    public void save() {
//        String courseCode, Integer enrolled, String instructor, Integer capacity, Integer computerCredit
        ComputerSection computerSection2 = new ComputerSection("CS101-A", 10, "Víctor Cardozo", 25, 100);
        ComputerSection computerSectionDB2 = computerSectionRepository.save(computerSection2);

        MathSection mathSection = new MathSection("CS102-A", 100, "Julia García", 20, 50);
        MathSection mathSectionDB = mathSectionRepository.save(mathSection);

        ComputerSection computerSection = new ComputerSection("CS101-B", 10, "Juan Perez", 30, 100);
        ComputerSection computerSectionDB = computerSectionRepository.save(computerSection);


        assertNotNull(computerSectionDB.getId());
        assertNotNull(mathSectionDB.getId());
    }

}