package com.apress.bgn.ch4.basic;

/**
 * @author:  r.goshen
 * @date: 10.04.2021
 * @since: 1.0
 */

public abstract class MyHuman {
    public static final int LIFESPAN = 100;
    private String name;
    private int age;
    private float height;
    private MyGender gender;

    public MyHuman(String name, int age, MyGender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public MyHuman(String name, int age, float height, MyGender gender) {
        this(name, age, gender);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public MyGender getGender() {
        return gender;
    }

    public void setGender(MyGender gender) {
        this.gender = gender;
    }

    /**
     * compute and return time to live
     */
    public abstract int computeTtl();
}
