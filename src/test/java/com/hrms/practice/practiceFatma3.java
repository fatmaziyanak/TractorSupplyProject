package com.hrms.practice;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.DbUtils;

public class practiceFatma3 extends DbUtils {
	
	@Test
	public void selftry() throws SQLException {

		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		DbUtils.createConnection();
		Statement st = conn.createStatement();
		// ResultSet rset= st.executeQuery("select emp_number, emp_firstname,
		// emp_lastname from hs_hr_employees\r\n" +
		// "where emp_number=6206;");
		ResultSet rset = st.executeQuery(ConfigsReader.getProperty("dbQuery"));
	//	ResultSet rset = st.executeQuery("select * from ohrm_nationality");
		

		ResultSetMetaData rsetMetaData = rset.getMetaData();
		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> RowMap = null;

		while (rset.next()) {
			RowMap = new LinkedHashMap<>();

			for (int i = 1; i <= rsetMetaData.getColumnCount(); i++) {
				RowMap.put(rsetMetaData.getColumnName(i), rset.getObject(i).toString());
			}
			listData.add(RowMap);
		}
		for (Map<String, String> map : listData) {
			// System.out.println(map);

			Set<Entry<String, String>> a = map.entrySet();
			for (Entry<String, String> entry : a) {

				System.out.println(entry.getKey() + " : " + entry.getValue());

			}

			System.out.println("input from map");
		}

		System.out.println(listData);
	}
}
