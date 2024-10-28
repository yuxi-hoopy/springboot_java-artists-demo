package com.yuxi.xiao.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="painter")
public class Painter {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="birthYear")
    private Integer birthYear;

    @Column(name="deathYear")
    private Integer deathYear;

    @Column(name="nationality")
    private String nationality;

    @Column(name="famousWork")
    private String famousWork;

    @Column(name="style")
    private String style;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamousWork() {
        return famousWork;
    }

    public void setFamousWork(String famousWork) {
        this.famousWork = famousWork;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

