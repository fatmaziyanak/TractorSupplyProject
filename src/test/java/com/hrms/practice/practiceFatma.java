package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class practiceFatma {
//	String dbUsername = "syntax_hrm";
//	String dbPassword = "syntaxhrm123";
//	// jdbc:type driver:host:port/name of the database
//	String dbUrl = "jdbc:mysql://166.62.36.207/syntaxhrm_mysql";

	
	String dbUserName="syntax_hrm";
	String dbPassword="syntaxhrm123";
	String dbUrl="jdbc:mysql://166.62.36.207/syntaxhrm_mysql";
	@Test
	public void getDataFromD() throws SQLException {
		Connection connect=DriverManager.getConnection(dbUrl,dbUserName, dbPassword);
		Statement st=connect.createStatement();
	ResultSet rset=st.executeQuery("select * from ohrm_nationality");
	
//	String data;
	
	while(rset.next()) {
	String	data=rset.getObject("id").toString();
	String	data1=rset.getObject("name").toString();

		System.out.println(data+" "+data1);
	}
	rset.close();
	st.close();
	connect.close();
	
	
	
	}
	
	
}
