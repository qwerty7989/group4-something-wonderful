package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {

	private Integer id;
    private int course_id;
	private String name;
    private int credit;
    private int max_seat;

    public Course() {
    }

    public Course(Integer id, int course_id, String name, int credit, int max_seat) {
        this.id = id;
        this.course_id = course_id;
        this.name = name;
        this.credit = credit;
        this.max_seat = max_seat;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCourse_id() {
        return this.course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getMax_seat() {
        return this.max_seat;
    }

    public void setMax_seat(int max_seat) {
        this.max_seat = max_seat;
    }

    public Course id(Integer id) {
        setId(id);
        return this;
    }

    public Course course_id(int course_id) {
        setCourse_id(course_id);
        return this;
    }

    public Course name(String name) {
        setName(name);
        return this;
    }

    public Course credit(int credit) {
        setCredit(credit);
        return this;
    }

    public Course max_seat(int max_seat) {
        setMax_seat(max_seat);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Course)) {
            return false;
        }
        Course course = (Course) o;
        return Objects.equals(id, course.id) && course_id == course.course_id && Objects.equals(name, course.name) && credit == course.credit && max_seat == course.max_seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course_id, name, credit, max_seat);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", course_id='" + getCourse_id() + "'" +
            ", name='" + getName() + "'" +
            ", credit='" + getCredit() + "'" +
            ", max_seat='" + getMax_seat() + "'" +
            "}";
    }

<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
