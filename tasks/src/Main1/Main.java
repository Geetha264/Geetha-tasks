package Main1;


import model.Student;
import service.StudentService;

public class Main {
 public static void main(String[] args) {
 Student s = new Student();
 s.name = "Arjun";
 s.age = 21;
 StudentService ss = new StudentService();
 ss.printStudent(s);
 }
}