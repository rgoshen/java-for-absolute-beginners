package com.apress.bgn.ch4.basic;

/**
 * @author:  r.goshen
 * @date: 10.04.2021
 * @since: 1.0
 */

public class MyBasicHumanDemo {
    public static void main(String[] args) {
//        MyHuman rick = new MyHuman("Rick", 48, 1.91f);
//        rick.name = "Rick";
//        rick.setName("Rick");
//        rick.setAge(48);
//        rick.setHeight(1.91f);

//        MyHuman hung = new MyHuman("Hung", 40);
//        MyHuman hung = new MyHuman();
//        hung.name = "Hung";
//        hung.setName("Hung");
//        hung.setAge(41);
//        hung.setHeight(1.42f);

//        System.out.println("name: " + rick.getName());
//        System.out.println("age: " + rick.getAge() + " lifespan: " + rick.LIFESPAN);
//        System.out.println("height: " + rick.getHeight());
//        System.out.println("Time to live: " + rick.computeTtl() + " years");

//        System.out.println("\n" +
//                "name: " + hung.getName());
//        System.out.println("age: " + hung.getAge());
//        System.out.println("Time to live: " + hung.computeTtl());

        MyMusician human = new MyMusician("John", 40, 1.91f, MyGender.MALE, "self taught", "country");

        System.out.println("name: " + human.getName());
        System.out.println("age: " + human.getAge());
        System.out.println("height: " + human.getHeight());
        System.out.println("gender: " + human.getGender().name());
        System.out.println("music school: " + human.getMusicSchool());
        System.out.println("genre: " + human.getGenre());
        System.out.println("ttl: " + human.computeTtl());
    }
}
