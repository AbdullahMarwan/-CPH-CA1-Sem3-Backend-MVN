package com.cph.ca1backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cityinfo")
public class Cityinfo {
    @Id
    @Column(name = "zipcode", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "cityname", nullable = false, length = 45)
    private String cityname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

}