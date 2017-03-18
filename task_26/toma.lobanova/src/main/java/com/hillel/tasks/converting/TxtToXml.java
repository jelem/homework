package com.hillel.tasks.converting;

import com.hillel.tasks.student.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TxtToXml {
  private List<Student> students;

  public TxtToXml() {
    students = new ArrayList<>();
  }

  public void readStudents() throws IOException {
    InputStream input = getClass().getResourceAsStream("students.txt");
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {
      String line;
      List<String> studentFields = new ArrayList<>();
      do {
        line = readOneStudentFields(bufferedReader, studentFields);
        addNewStudentToList(studentFields);
      }
      while (line != null);
    }
  }

  private String readOneStudentFields(BufferedReader bufferedReader, List<String> studentFields) throws IOException {
    String line;
    studentFields.clear();
    while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
      studentFields.add(line.substring(line.indexOf(" ") + 1));
    }
    return line;
  }

  private void addNewStudentToList(List<String> studentFields) {
    Student student = new Student.Builder()
        .setLastName(studentFields.get(0))
        .setName(studentFields.get(1))
        .setAge(Integer.parseInt(studentFields.get(2)))
        .build();

    students.add(student);
  }

  public int getStudentsNumber() {
    return students.size();
  }

  public void writeStudents() throws IOException {
    BufferedWriter writer = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream("students_output.txt"), Charset.forName("UTF-8")));
    writer.write("<students>\r\n");
    for (int i = 0; i < students.size(); i++) {
      writer.write("  <student>\r\n");
      writer.write("    <lastname> " + students.get(i).getLastName() + "</lastname>\r\n");
      writer.write("    <name> " + students.get(i).getLastName() + "</name>\r\n");
      writer.write("    <age> " + students.get(i).getLastName() + "</age>\r\n");
      writer.write("  </student>\r\n");
    }
    writer.write("</students>");
    writer.flush();
    writer.close();
  }
}
