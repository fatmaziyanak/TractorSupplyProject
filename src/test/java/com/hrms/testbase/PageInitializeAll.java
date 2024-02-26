package com.hrms.testbase;

import com.hrms.pages.HomePage;
import com.hrms.pages.ReportsPageElements;

public class PageInitializeAll extends BaseClass {
	protected static HomePage home;
		
	protected static ReportsPageElements report;

	public static void initializeAll() {
		home = new HomePage();

		report=new ReportsPageElements();
	}
}
