package com.practice;

/**
 * Created by ANN on 05.01.2017.
 */
public class Cat {

    private int age;
    private String poroda;
    private String name;

    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public int setAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public String setPoroda() {
        return poroda;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public void say(){
        System.out.println("Mÿó");

    }


    @Override
    public String toString() {
        return "Cat[name " + name + age + poroda;
    }
}
