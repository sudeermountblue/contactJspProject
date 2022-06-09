package com.sudeer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet ("/JspServlet")
public class JspServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String Name = request.getParameter("name");
		String Email = request.getParameter("email");
		String Message = request.getParameter("message");
		String Status ="false";
		
		
		String url = "jdbc:postgresql://localhost:5432/ContactUsApp";
		String Username = "postgres";
		String Password = "Sudeer@7904";
		
		String sqlQuery = String.format("INSERT INTO contactinfo VALUES('%s','%s','%s','%s')",Name,Email,Message,Status);
		
		 try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(url,Username,Password);
			Statement statement = connection.createStatement();
			 statement.executeUpdate(sqlQuery);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
