package com.apress.bgn.ch4.basic;

import java.util.List;

/**
 * @author:  r.goshen
 * @date: 10.04.2021
 * @since: 1.0
 */

public class MyMusician extends MyHuman{
    private String musicSchool;
    private String genre;
    private List<String> songs;

    public MyMusician(String name, int age, float height, MyGender gender, String musicSchool, String genre) {
        super(name, age, height, gender);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }

    public String getMusicSchool() {
        return musicSchool;
    }

    public void setMusicSchool(String musicSchool) {
        this.musicSchool = musicSchool;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public void addSong(String song){
        this.songs.add(song);
    }

    @Override
    public int computeTtl() {
        return (LIFESPAN - getAge()) / 2;
    }
}
