package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task10 {
 public static void main(String[] args) throws Exception {
 ArrayList<Student> list = new ArrayList<>();
 list.add(new Student("A", 1));
 list.add(new Student("B", 2));
 ObjectOutputStream oos = new ObjectOutputStream(new
FileOutputStream("students.ser"));
 oos.writeObject(list);
 oos.close();
 ObjectInputStream ois = new ObjectInputStream(new
FileInputStream("students.ser"));
 ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
 ois.close();
 for (Student s : students)
 System.out.println(s.name + " - " + s.roll);
 }
}
