package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	
	//Dtabase connection

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="Geetha@123";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("Connected to DB!");
			//conn.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		//Insert records
		try {
			String sql="INSERT INTO students(name,email)VALUES(?,?)";
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setString(1, "Alice");;
			stmt.setString(2, "alice@example.com");
			stmt.executeUpdate();
			System.out.println("Record Inserted Successfully");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		//Retreving records
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT * FROM Students"); 
		while (rs.next()) { 
		System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " 
		+ rs.getString("email"));
		}		
		
		//Insert with PreparedStatement
		try {
			String sql="UPDATE Users SET name=? email=? WHERE id=? ";
			PreparedStatement stmt1=conn.prepareStatement(sql);
			stmt1.setString(1, "Charlie");
			stmt1.setString(2, "charlie@example.com");
			stmt1.setInt(1,3);
		    System.out.println("Record successfully updated");
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		//Update a Record 
		String sql = "UPDATE Students SET email = ? WHERE id = ?"; 
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		pstmt.setString(1, "newbob@example.com"); 
		pstmt.setInt(2, 2); 
		pstmt.executeUpdate();
		
		//Delete a Record
		String sql1 = "DELETE FROM Students WHERE id = ?"; 
		PreparedStatement pstmt1 = conn.prepareStatement(sql1); 
		pstmt1.setInt(1, 1); 
		pstmt1.executeUpdate(); 
		System.out.println("Record deleted successfully");
		
		//Serach by name
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter name to search: "); 
		String name = sc.nextLine(); 
		String sql11 = "SELECT * FROM Students WHERE name = ?"; 
		PreparedStatement pstmt11 = conn.prepareStatement(sql11); 
		pstmt11.setString(1, name); 
		ResultSet rs1 = pstmt11.executeQuery(); 
		while (rs1.next()) { 
		System.out.println(rs1.getInt("id") + " - " + rs1.getString("name") + " - " 
		+ rs1.getString("email")); 
		} 
		

	}
}
