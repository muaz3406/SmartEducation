package com.muaz.SmartEducation.entities;


import javax.persistence.*;


@Entity
@Table(name = "course")
public class Course  {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "course_id")
    private Long id;

    @Column(name="name")
    private String name;

    private String course_day;

    private String course_start_date;

    private String course_end_date;

    private String course_time;


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

    public String getCourse_day() {
        return course_day;
    }

    public void setCourse_day(String course_day) {
        this.course_day = course_day;
    }

    public String getCourse_start_date() {
        return course_start_date;
    }

    public void setCourse_start_date(String course_start_date) {
        this.course_start_date = course_start_date;
    }

    public String getCourse_end_date() {
        return course_end_date;
    }

    public void setCourse_end_date(String course_end_date) {
        this.course_end_date = course_end_date;
    }

    public String getCourse_time() {
        return course_time;
    }

    public void setCourse_time(String course_time) {
        this.course_time = course_time;
    }
}