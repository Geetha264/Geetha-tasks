package filehandling;

import java.io.*;
import java.util.*;
class Student implements Serializable {
 String name;
 int roll;
 Student(String n, int r) {
 name = n;
 roll = r;
 }
}