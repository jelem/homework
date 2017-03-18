package com.hillel.convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Converter {

  private List<Student> students;
  private List<String> studentsParam;

  public Converter() {
    this.students = new ArrayList<>();
    this.studentsParam = new ArrayList<>();
  }


  public void readList() {
    InputStream inputStream = getClass().getResourceAsStream("students.txt");
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      int count = 0;
      while ((line = bufferedReader.readLine()) != null && count != 4) {
        int startInfo = line.indexOf(" ") + 1;
        studentsParam.add(line.substring(startInfo));
        count++;
        if (count < 4 || line.equals(" ")) {
          continue;
        }
        count = 0;
        addStudentParam(studentsParam);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void addStudentParam(List<String> studentsParam) {
    String lastname = studentsParam.get(0);
    String firstname = studentsParam.get(1);
    int age = Integer.parseInt(studentsParam.get(2));
    Student student = new Student(lastname, firstname, age);
    students.add(student);
    studentsParam.clear();
  }

  public void writeList() {
    try (BufferedWriter bufferedWriter = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream(
            "/home/mikha/Документы/Course/homework/task_26/Oleg.Mikhailov/src/main/"
                + "resources/com/hillel/convert/output_student.txt")))) {
      bufferedWriter.write("<students>\n");
      for (Student std : students) {
        bufferedWriter.write("  <student>\r\n");
        bufferedWriter.write("    <lastname> " + std.getLastname() + "</lastname>\r\n");
        bufferedWriter.write("    <name> " + std.getFirstname() + "</name>\r\n");
        bufferedWriter.write("    <age> " + std.getAge() + "</age>\r\n");
        bufferedWriter.write("  </student>\r\n");
      }

      bufferedWriter.write("</students>\n");
      bufferedWriter.flush();
      bufferedWriter.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
