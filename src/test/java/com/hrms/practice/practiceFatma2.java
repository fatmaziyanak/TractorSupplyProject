package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class practiceFatma2 {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
//	// jdbc:type driver:host:port/name of the database
	String dbUrl = "jdbc:mysql://166.62.36.207/syntaxhrm_mysql";
@Test
	public void test() throws SQLException {
	
Connection 	conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

Statement st = conn.createStatement();

ResultSet rset = st.executeQuery("select * from ohrm_nationality");

List<Map<String, String>> a=new ArrayList<>();

ResultSetMetaData mataData=rset.getMetaData();

Map<String, String> rowMap;
while(rset.next()) {
	
	rowMap = new LinkedHashMap<>();
	for(int i=1; i<=mataData.getColumnCount(); i++) {
		rowMap.put(mataData.getColumnName(i), rset.getObject(i).toString());
	
	a.add(rowMap);
	}
}

	

System.out.println(a);
//System.out.println(rset.next());
//System.out.println("sys");

}}

