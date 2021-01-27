package com.ironhack.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ComputerSection extends Section {
    private Integer computerCredit;

    public ComputerSection() {
    }

    public ComputerSection(Integer computerCredit) {
        this.computerCredit = computerCredit;
    }

    public ComputerSection(String courseCode, Integer enrolled, String instructor, Integer capacity, Integer computerCredit) {
        super(courseCode, enrolled, instructor, capacity);
        this.computerCredit = computerCredit;
    }

    public Integer getComputerCredit() {
        return computerCredit;
    }

    public void setComputerCredit(Integer computerCredit) {
        this.computerCredit = computerCredit;
    }
}
