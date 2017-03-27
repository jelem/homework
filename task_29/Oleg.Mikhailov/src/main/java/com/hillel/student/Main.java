package com.hillel.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Student student = new Student("Oleg", "Mikhailov", 20);

    FileOutputStream file = new FileOutputStream("/home/mikha/Документы/Course/homework/task_29/Oleg.Mikhailov/student.txt");

    ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);

    objectOutputStream.writeObject(student);
    objectOutputStream.flush();
    objectOutputStream.close();

    FileInputStream inputFile = new FileInputStream("/home/mikha/Документы/Course/homework/task_29/Oleg.Mikhailov/student.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(inputFile);


    Student outStudent = (Student) objectInputStream.readObject();
    objectInputStream.close();
    System.out.println(outStudent);

  }
}
