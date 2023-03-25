package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
							public static WebDriver driver;
				static Actions a;
				static Select s;
					
				/*This method used to browser launch*/
				
				public static void launchBrowser() {
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();

				}
				 public static void launchBrowserProp(String browserType) {
			   	  if(browserType.equals("chrome")) {
			   		  WebDriverManager.chromedriver().setup();
			   		  driver=new ChromeDriver();
			   		  
			   	  }else if(browserType.equals("edge")) {
			   		  WebDriverManager.iedriver().setup();
			   		  driver=new EdgeDriver();
			   		  
			   	  }

				}

			     public static String  readProperty(String propertyName) throws IOException {
			   	  FileReader f=new FileReader("Config.properties");
			   	  Properties p= new Properties();
			   	  p.load(f);
			   	  String txt = p.getProperty(propertyName);
			   	  return txt;
			   	  
			   	  

				}

			       /*Pass the webpage */	
				
				public static  void launchUrl(String url) {
					driver.get(url);
			 
				}
				/* method to pass the value*/
				
			    public static void enterText(WebElement element,String text) {
			    	element.sendKeys(text);
			        	
				}
				/* method to click the webelement*/
			    
			    public static void clickElement(WebElement element) {
			      element.click();
			    	
				}
				/*maximize the window   */ 
			    
			    public static void windowMaximize() {
			      driver.manage().window().maximize();
			    	
				}
			    
			    /*   delete the cookies   */ 
			    
			    public static void deleteAllCookies() {
			      driver.manage().deleteAllCookies();
			    	
				}
			    
			    /* Wait for webelement  */
			    
			    public  static void WaitElement() {
			    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				}
			    
			    /*  Refresh the page  */
			    
			    public static  void pageRefresh() {

			    	driver.navigate().refresh();
			    	
				}
			    
			    /* DropDown the element by using select class */
			    
			    public static void dropDownElement(WebElement source,WebElement target) {
			    	a=new Actions(driver);
			       a.dragAndDrop(source, target).perform();
				}
			    
			    /*Double click the webelement by using select class */
			    
			    public static void doubleClickElement(WebElement target) {
			        a=new Actions(driver);
			        a.doubleClick(target).perform();
				}
			    
			    /* get the page title */
			    public static String getPageTitle() {
			       String title = driver.getTitle();
			    	return title;
				}
			    
			    /* get the current url of the  webpage  */
			    public static String getCurrentUrlPage() {
			       String url = driver.getCurrentUrl();
			    	return url ;
				}
			    
			    /* select value by index with the help of select class */
			    
			    public static void selectValueddUsingIndex(WebElement element,int index) {
			       s=new Select(element);
			    	s.selectByIndex(index);
				}
			    
			   /* select value by value with the help of select class */
			    
			    public static void selectValueddUsingValue(WebElement element,String value) {
			       s=new Select(element);
			    	s.selectByValue(value);
				}
			    

			     /* select value by text with the help of select class */
			    
			    public static void selectValueddUsingText(WebElement element,String text) {
			       s=new Select(element);
			    	s.selectByVisibleText(text);;
				}
			    
			     /* deselect value by text with the help of select class */
			    
			       public static void deselectValueddUsingText(WebElement element,String text) {
			       s=new Select(element);
			    	s.selectByVisibleText(text);;
				}
			    
			       /* deselect value by value with the help of select class */
			       
			       public static void deselectValueddUsingValue(WebElement element,String value) {
			          s=new Select(element);
			       	s.selectByValue(value);
			   	}
			       
			       /* deselect value by index with the help of select class */
			       
			       public static void deselectValueddUsingIndex(WebElement element,int index) {
			          s=new Select(element);
			       	s.selectByIndex(index);
			   	}
			       
			     /* check the selector is multi */
			       
			       public static void selectMultiple(WebElement element) {
			           s=new Select(element);
			           boolean multiple = s.isMultiple();
			           System.out.println("Given  selector is multi"+multiple);
				}
			       
			    
			    /* get the options in dropdown */
			    
			       public static void getOptiondd(WebElement element) {
			           s=new Select(element);
			         List<WebElement> options = s.getOptions();
			           System.out.println(options);
				}
			   
			       /* get all selected options in dropdwon */
			       public static void getAllSelectedOptiondd(WebElement element) {
			           s=new Select(element);
			           List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

			           System.out.println(allSelectedOptions);
				}
			       
			       /* get first selected options in dropdwon */
			       public static void getFirstSelectedOptiondd(WebElement element) {
			           s=new Select(element);
			           WebElement firstSelectedOption = s.getFirstSelectedOption();

			           System.out.println(firstSelectedOption);
				}
			      
			       /*close the current tab */
			       public static void closeWebPage() {
			           driver.close();
			    	   
				} 
			       /*close the entire tab */
			       public static void quitWebPage() {
			           driver.quit();
			    	   
				} 

			       /*get the text from webpage */
			       
			       public static void getTextWebpage(WebElement element) {
			           String text = element.getText();
			    	   System.out.println(text);
			    	   
				}
			        /*get the given value */
			       
			       public static void getAttributeValue(WebElement element,String name) {
			           String attribute = element.getAttribute(name);
			    	   System.out.println(attribute);
			    	   
				}
			       /* Moveto the element by using select class */
			       
			       public static void moveToTheElement(WebElement target) {
			       	a=new Actions(driver);
			       	a.moveToElement(target).perform();
			       }
			       
			       /*Context click the webelement by using select class */
			       
			       public static void contextClickElement(WebElement target) {
			           a=new Actions(driver);
			           a.contextClick(target).perform();
			   	}
			       
			       /* method to pass the value by using action class*/
			   	
			       public static void enterTextAction(WebElement element,String text) {
			           a=new Actions(driver);
			           a.sendKeys(text).perform();          	
			   	}
			   	/* method to click the webelement by using action class*/
			       
			       public static void clickAction(WebElement element) {
			           a=new Actions(driver);
			           a.click(element).perform();

			   	}
			   	/* keyUp and KeyDown method using action class */
			       public static void keyUpKeyDownAction(String text) {
			           a=new Actions(driver);
			           a.keyDown(Keys.SHIFT).perform();
			    	   a.sendKeys(text).perform();
			    	   a.keyUp(Keys.SHIFT).perform();
				}
			    
			       /*  Handle the alert */
			       public static void alertMsg() {

			    	  Alert a = driver.switchTo().alert();
			    	   a.accept();
			    	   
				}
			       /*  Dismiss the alert */
			       public static void dismissAlert() {

			    	   Alert a = driver.switchTo().alert();
			    	   a.dismiss();
			    	   
				}
			       /*  	insert the value in alert by using sendkeys */
			       public static void passValueInAlert(String text) {

			    	  Alert a = driver.switchTo().alert();
			    	 a.sendKeys(text);
			    	   
				}

			       /*  Dismiss the alert */
			       public static void getTextAlert() {

			    	  Alert at = driver.switchTo().alert();
			    	   String text = at.getText();
			    	   System.out.println(text);
			    	   
				}
			      /*keypress and keyrelease by robot class */
			       public static void keyUpKeyDownRobot() throws AWTException {

			    	   Robot r=new Robot();
			    	   r.keyPress(KeyEvent.VK_ENTER);
			    	   r.keyRelease(KeyEvent.VK_ENTER);

			    	   
				}
			       

			       /*TakesScreenshot */
			       
			       public static void takesScreenshotInWebpage() throws IOException {

			    	   TakesScreenshot tk=(TakesScreenshot)driver;
			    	   File src=tk.getScreenshotAs(OutputType.FILE);
			    	   File des=new File(" ");
			    	   FileUtils.copyFile(src, des);
			    	   
				}
			       
			        /*  Javascript   - Pass the arguments*/
			       public static void javascriptArgument(WebElement element) {
			    	   JavascriptExecutor js=(JavascriptExecutor)driver;
			    	   js.executeScript("arguments[0].setAttribute('value',value we pass)",element );

				}
			       /*  Javascript   - Get the Attribute*/
			       public static void javascriptAttribute(WebElement element) {
			    	   JavascriptExecutor js=(JavascriptExecutor)driver;
			    	   js.executeScript("return arguments[0].getAttribute('value')",element );

				}
			       /*  Javascript   - Click the WebElement*/
			       public static void javascriptClick(WebElement element) {
			    	   JavascriptExecutor js=(JavascriptExecutor)driver;
			    	   js.executeScript("arguments[0].click()",element);

				}

			       /*  Javascript   - Scroll into the WebElement*/
			       public static void javascriptScroll(WebElement element) {
			    	   JavascriptExecutor js=(JavascriptExecutor)driver;
			    	   js.executeScript("arguments[0].scrollIntoView()",element);

				}

			      /* WebDriver wait */
			       private static void webDriverWaitTheWebElement() {
			    	   WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
			    	  // w.until(ExpectedConditions.);

				}
			      
			       /*is enabled method- visibility check method */
			       public static void isEnabledWebElement(WebElement element) {

			    	   boolean enabled = element.isEnabled();
			    	   System.out.println(enabled);
			    	   
				}
			       /*is displayed method- visibility check method */
			       public static void isDisplayedWebElement(WebElement element) {

			    	   boolean displayed = element.isDisplayed();
			    	   System.out.println(displayed);
			    	   
				}

			       /*is selected method- visibility check method */
			       public  static void isSelectedWebElement(WebElement element) {

			    	   boolean selected = element.isSelected();
			    	   System.out.println(selected);
			    	   
				}

			       /* pass the url by navigate */
			       public static void navigationUrl(String url) {
			    	   driver.navigate().to(url);

				}
			       /* refresh the page */
			       
			     public static void navigationRefresh() {

			    	 driver.navigate().refresh();
				}
			     /* back  the webpage */
			     
			      public static void navigationBack() {

			  	 driver.navigate().back();
				}

			       /* back  the webpage */
			   
			     public static void navigationForward() {

				 driver.navigate().forward();
				}

			     public static void toCreateCellInExcel(String filename,String sheetName, int rownumber, int cellnumber, String data) throws IOException {
			    	 File f = new File(filename);
			    	 FileInputStream fis = new FileInputStream(f);
			    	 Workbook w = new XSSFWorkbook(fis);
			    	 Sheet s = w.getSheet(sheetName);
			    	 Row r = s.getRow(rownumber);
			    	 Cell c = r.createCell(cellnumber);
			    	 c.setCellValue(data);
			    	 FileOutputStream fout = new FileOutputStream(f);
			    	 w.write(fout);
			    	 }
			     public static String toGetValueFromExcel(String filepath, String sheet, int rowindex, int cellindex)
			    		 throws IOException {
			    		 File f = new File(filepath);
			    		 FileInputStream fin = new FileInputStream(f);
			    		 Workbook w = new XSSFWorkbook(fin);
			    		 Sheet s = w.getSheet(sheet);
			    		 Row r = s.getRow(rowindex);
			    		 Cell c = r.getCell(cellindex);
			    		 int cellType = c.getCellType();
			    		 String text = "";
			    		 if (cellType == 1) {
			    		 text = c.getStringCellValue();
			    		 } else if (DateUtil.isCellDateFormatted(c)) {
			    		 Date d = (Date) c.getDateCellValue();
			    		 SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			    		 text = sim.format(d);
			    		 } else {
			    		 double dd = c.getNumericCellValue();
			    		 long l = (long) dd;
			    		 text = String.valueOf(l);
			    		 }
			    		 return text;
			    		 }

			     public static String readExcel(String data,int index,int cell) throws IOException {
			    	 
			    	 File f=new File("C:\\Users\\rapri\\eclipse-workspace\\Kidly\\Excel\\Excel1.xlsx");
			    	 FileInputStream fin=new FileInputStream(f);
			    	 Workbook w=new XSSFWorkbook(fin);
			    	 Sheet s = w.getSheet(data);
			    	 Row r = s.getRow(index);
			    	 Cell c = r.getCell(cell);
			    	 int type = c.getCellType();
			    	 String text="";
			    	 if(type==1) {
			    		 text=c.getStringCellValue();
			    	 }else if(DateUtil.isCellDateFormatted(c)) {
			    		 Date d = (Date) c.getDateCellValue();
			    		 SimpleDateFormat sm=new SimpleDateFormat("dd-MM-yyyy");
			    		 text = sm.format(d);
			    	 }else {
			    		 double dd = c.getNumericCellValue();
			    		 long l=(long)dd;
			    		 text = String.valueOf(l);
			    	 }
			    	 return text;
			    	 
			    	 
			     }	 
			    	 
			     
			     /*to create excel sheet */
			     
			     public static void excelWrite(String filename,String sheet,int rowNo,int cellNo,String cellvalue)throws IOException {
			    	 File f=new File(filename);
			    	 Workbook w;
			    	 Sheet s;
			    	 Row r;
			    	 
			    	 if(rowNo==0&&cellNo==0) {
			 			w=new XSSFWorkbook();
			 			s=w.createSheet(sheet);
			 			r=s.createRow(rowNo);	
			 		}
			 		else if (rowNo!=0&&cellNo==0) {
			 			w=new XSSFWorkbook(new FileInputStream(f));
			 			s=w.getSheet(sheet);
			 			r=s.createRow(rowNo);
			 		}
			 		else {
			 			w=new XSSFWorkbook(new FileInputStream(f));
			 			s=w.getSheet(sheet);
			 			r=s.getRow(rowNo);
			 		}
			 		Cell c=r.createCell(cellNo);
			 		c.setCellValue(cellvalue);
			 		FileOutputStream fos=new FileOutputStream(filename);
			 		w.write(fos);
			 	}


			    	 
			    	 
			    	
			   
			      public static String readExcelForAll(String name,String data,int index,int cell) throws IOException {
			    	 
			    	 File f=new File(name);
			    	 FileInputStream fin=new FileInputStream(f);
			    	 Workbook w=new XSSFWorkbook(fin);
			    	 Sheet s = w.getSheet(data);
			    	 
			    	 int noOfRows = s.getPhysicalNumberOfRows();
			    	 System.out.println("No of rows: "+noOfRows);
						String text="";

			    	 for (int i = 0; i < noOfRows; i++) {
						Row r = s.getRow(i);
						int noOfCell = r.getPhysicalNumberOfCells();
						for (int j = 0; j < noOfCell; j++) {
							Cell c = r.getCell(j);
					    	 int type = c.getCellType();

							if(type==1) {
					    		 text=c.getStringCellValue();
					    	 }else if(DateUtil.isCellDateFormatted(c)) {
					    		 java.util.Date d = c.getDateCellValue();
					    		 SimpleDateFormat sm=new SimpleDateFormat("dd-MM-yyyy");
					    		 text = sm.format(d);
					    	 }else {
					    		 double dd = c.getNumericCellValue();
					    		 long l=(long)dd;
					    		 text = String.valueOf(l);
					    	 }

						}

					}
			    	 
			    	 
						return text;

			      }	 
			    	 
			      public static void readExcelForRow(String name,String data,int index,int cell) throws IOException {
			     	 
			     	 File f=new File(name);
			     	 FileInputStream fin=new FileInputStream(f);
			     	 Workbook w=new XSSFWorkbook(fin);
			     	 Sheet s = w.getSheet(data);
			     	 
			     	 int noOfRows = s.getPhysicalNumberOfRows();
			     	 System.out.println("No of rows: "+noOfRows);

			 			Row r = s.getRow(index);
			 			int noOfCell = r.getPhysicalNumberOfCells();
			            System.out.println("No of Cell: "+noOfCell);
			      } 
			    	 
			    	
			}










