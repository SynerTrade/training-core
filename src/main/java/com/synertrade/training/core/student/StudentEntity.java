package com.synertrade.training.core.student;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by tudorg on 10/18/2016.
 */
@Entity
@Table(name = "`STUDENT`")
@Proxy(lazy = true)
public class StudentEntity {

    /**
     * Unique identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false)
    private Integer								id;

    /**
     * First name
     */
    @Column(name = "`FIRSTNAME`", nullable = false)
    @Type(type = "string")
    private String								firstName;

    /**
     * Last name
     */
    @Column(name = "`LASTNAME`", nullable = false)
    @Type(type = "string")
    private String								lastName;

    /**
     * Faculty
     */
    @Column(name = "`FACULTY`", nullable = false)
    @Type(type = "string")
    private String								faculty;

    /**
     * Year of registration
     */

    @Column(name = "`YEAR`", nullable = false)
    private Integer								year;

    /**
     * Email
     */
    @Column(name = "`EMAIL`", nullable = false)
    @Type(type = "string")
    private String								email;

    /**
     * Phone
     */
    @Column(name = "`PHONE`", nullable = false)
    @Type(type = "string")
    private String								phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
