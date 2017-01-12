package com.practice;

/**
 * Created by ANN on 04.01.2017.
 */
public class Main {

    public static Cat cat;
    static People people;


    public static void main(String[] args) {

        cat = new Cat(2, "persidskiu", "Масик");
        people = new People("Anna", "Kononenko", 29, cat);


        //people.getCat().setName("Джордж");

        System.out.println(people);
        cat.say();
        people.getCat().say();


    }


}

