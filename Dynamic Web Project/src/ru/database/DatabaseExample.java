package ru.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseExample {
	public static List<String> getBooks() {
		List<String> result = new ArrayList<String>();
		
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "7895123")){
			
			System.out.println("My first example by jdbc");
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("Select * from books.books");
			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
			
			}
			
		}
		
		catch (SQLException e) {
			System.out.println("Fail. no");
			e.printStackTrace();
		}
		
		return result;
		
		
	}
}
