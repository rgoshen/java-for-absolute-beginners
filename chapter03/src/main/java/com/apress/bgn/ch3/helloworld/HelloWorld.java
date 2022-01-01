package com.apress.bgn.ch3.helloworld;

import java.util.List;

/*
 * Created on 10.01.2021
 */
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Hello " + args[0] + "!");
        List<String> items = List.of("1", "a", "2", "a", "3", "a");
        items.forEach(item ->{
            if(item.equals("a")){
                System.out.println("A");
            } else {
                System.out.println("Not A");
            }
        });
    }
}
