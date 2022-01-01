package com.apress.bgn.ch4.basic;

import java.util.List;

/**
 * @author:  r.goshen
 * @date: 10.04.2021
 * @since: 1.0
 */

public class MyActor extends MyHuman{
    private String actingSchool;
    private List<String> films;

    public MyActor(String name, int age, float height, MyGender gender, String actingSchool) {
        super(name, age, height, gender);
        this.actingSchool = actingSchool;
    }

    public String getActingSchool() {
        return actingSchool;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public void addFilm(String film){
        this.films.add(film);
    }

    @Override
    public int computeTtl() {
        return (LIFESPAN - getAge()) / 2;
    }
}
