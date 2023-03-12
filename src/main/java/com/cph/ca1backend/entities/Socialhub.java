package com.cph.ca1backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "socialhub")
public class Socialhub {
    @Id
    @Size(max = 45)
    @Column(name = "hobbyname", nullable = false, length = 45)
    private String id;

    @Size(max = 90)
    @NotNull
    @Column(name = "hobbylink", nullable = false, length = 90)
    private String hobbylink;

    @Size(max = 45)
    @NotNull
    @Column(name = "personname", nullable = false, length = 45)
    private String personname;

    @NotNull
    @Column(name = "personage", nullable = false)
    private Integer personage;

    @NotNull
    @Column(name = "experience", nullable = false)
    private Integer experience;

    @NotNull
    @Column(name = "zipcode", nullable = false)
    private Integer zipcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHobbylink() {
        return hobbylink;
    }

    public void setHobbylink(String hobbylink) {
        this.hobbylink = hobbylink;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public Integer getPersonage() {
        return personage;
    }

    public void setPersonage(Integer personage) {
        this.personage = personage;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

}