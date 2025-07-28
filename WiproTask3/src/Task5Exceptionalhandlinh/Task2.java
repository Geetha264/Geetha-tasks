package Task5Exceptionalhandlinh;
  
import java.io.*;
public class Task2 {
 public static void main(String[] args) {
 BufferedReader reader = null;
 try {
 reader = new BufferedReader(new FileReader("data.txt"));
 System.out.println(reader.readLine());
 } catch (IOException e) {
 System.out.println("Error reading file");
 } finally {
 try {
 if (reader != null) reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 System.out.println("File closed.");
 }
 }
}