package com.example.accessingdatamysql.service.repo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="COURSES") // This tells Hibernate to make a table out of this class
public class CourseEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", updatable=false)	

	@Column(name="NAME")
	private String name;

	@Column(name="CREATED")
	private Timestamp created;

	@Column(name="COURE_ID")
	private Integer course_id;
	@Column(name="MAX_SEAT")
	private Integer max_seat;
	@Column(name="CREDIT")
	private Integer credit;

	public CourseEntity() {
	}

	public CourseEntity(String name, Timestamp created, Integer course_id, Integer max_seat, Integer credit) {
		this.name = name;
		this.created = created;
		this.course_id = course_id;
		this.max_seat = max_seat;
		this.credit = credit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Integer getCourse_id() {
		return this.course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public Integer getMax_seat() {
		return this.max_seat;
	}

	public void setMax_seat(Integer max_seat) {
		this.max_seat = max_seat;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public CourseEntity name(String name) {
		setName(name);
		return this;
	}

	public CourseEntity created(Timestamp created) {
		setCreated(created);
		return this;
	}

	public CourseEntity course_id(Integer course_id) {
		setCourse_id(course_id);
		return this;
	}

	public CourseEntity max_seat(Integer max_seat) {
		setMax_seat(max_seat);
		return this;
	}

	public CourseEntity credit(Integer credit) {
		setCredit(credit);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof CourseEntity)) {
			return false;
		}
		CourseEntity courseEntity = (CourseEntity) o;
		return Objects.equals(name, courseEntity.name) && Objects.equals(created, courseEntity.created) && Objects.equals(course_id, courseEntity.course_id) && Objects.equals(max_seat, courseEntity.max_seat) && Objects.equals(credit, courseEntity.credit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, created, course_id, max_seat, credit);
	}

	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", created='" + getCreated() + "'" +
			", course_id='" + getCourse_id() + "'" +
			", max_seat='" + getMax_seat() + "'" +
			", credit='" + getCredit() + "'" +
			"}";
	}


}
