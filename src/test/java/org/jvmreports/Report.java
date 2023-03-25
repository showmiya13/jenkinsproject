package org.jvmreports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	public static void reportGeneration(String jsonfilepath)
	{
		File f=new File("C:\\Users\\SOMIYAKANNAN\\eclipse-workspace\\Project\\src\\test\\resources");
		Configuration c=new Configuration(f,"Toys");
		c.addClassifications("browser", "chrome");
		
		List<String> l=new ArrayList<String>();
	l.add(jsonfilepath);
	ReportBuilder r=new ReportBuilder(l,c);
	r.generateReports();
	}
	

}
