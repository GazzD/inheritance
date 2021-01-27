package com.ironhack.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ScienceSection extends Section{
    private Integer scienceCredit;
    private Integer labRoomNum;

    public ScienceSection() {
    }

    public ScienceSection(Integer scienceCredit, Integer labRoomNum) {
        this.scienceCredit = scienceCredit;
        this.labRoomNum = labRoomNum;
    }

    public ScienceSection(String courseCode, Integer enrolled, String instructor, Integer capacity, Integer scienceCredit, Integer labRoomNum) {
        super(courseCode, enrolled, instructor, capacity);
        this.scienceCredit = scienceCredit;
        this.labRoomNum = labRoomNum;
    }

    public Integer getScienceCredit() {
        return scienceCredit;
    }

    public void setScienceCredit(Integer scienceCredit) {
        this.scienceCredit = scienceCredit;
    }

    public Integer getLabRoomNum() {
        return labRoomNum;
    }

    public void setLabRoomNum(Integer labRoomNum) {
        this.labRoomNum = labRoomNum;
    }
}
