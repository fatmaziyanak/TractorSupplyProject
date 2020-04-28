package com.hrms.practice;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class JdbcJobTitles {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	String dbUrl="jdbc:mysql://166.62.36.207/syntaxhrm_mysql";
	
	@Test
	public void TaskSQDB() throws SQLException {
		
	Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
	
	System.out.println("connection is created");
	
	
	Statement st=conn.createStatement();
	
	ResultSet result=st.executeQuery("select * from  ohrm_job_title ");
	
	ArrayList<String> arrData=new ArrayList<>();
	
	while(result.next()) {
		arrData.add(result.getString("job_title"));
	}
	
	
for(String data:arrData) {
	System.out.println(data);
}
	
	
	result.close();
	st.close();
	conn.close();
}}
