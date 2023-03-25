package org.storage;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreports.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",glue="org.stepdefinition",dryRun=false,
plugin= {"html:reports","junit:C:\\Users\\SOMIYAKANNAN\\eclipse-workspace\\Project\\reports//toys.xml","json:reports\\toyssearch.json"})
public class Runner{


@AfterClass
public static void Reports() {
	Report.reportGeneration(System.getProperty("user.dir")+"\\reports\\toyssearch.json");
}

}


