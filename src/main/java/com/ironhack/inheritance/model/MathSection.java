package com.ironhack.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class MathSection extends Section {
    private Integer mathCredit;

    public MathSection() {
    }

    public MathSection(Integer mathCredit) {
        this.mathCredit = mathCredit;
    }

    public MathSection(String courseCode, Integer enrolled, String instructor, Integer capacity, Integer mathCredit) {
        super(courseCode, enrolled, instructor, capacity);
        this.mathCredit = mathCredit;
    }

    public Integer getMathCredit() {
        return mathCredit;
    }

    public void setMathCredit(Integer mathCredit) {
        this.mathCredit = mathCredit;
    }
}
