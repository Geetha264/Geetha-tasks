package service;

import model.Student;

public class StudentService {


 public void printStudent(Student s) {
 System.out.println("Name: " + s.name + ", Age: " + s.age);
}
}