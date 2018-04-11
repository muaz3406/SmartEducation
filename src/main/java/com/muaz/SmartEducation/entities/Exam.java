package com.muaz.SmartEducation.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "exam")
public class Exam  {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "exam_id")
    private Long id;

    @Column(name="name")
    private String name;

    private String date;

    private String time;

    private int result;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
