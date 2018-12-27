package com.instarem.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.instarem.base.GetDriver;

public class TestCases {

	public void getImages() {

		GetDriver.driver.get("https://www.amazon.in/");
		GetDriver.driver.manage().window().maximize();

		List<WebElement> listImages = GetDriver.driver.findElements(By
				.tagName("img"));
		System.out.println("No. of Images: " + listImages.size());
		for (WebElement link : listImages) {
			System.out.println(link.getAttribute("src"));

		}
	}
	
	public void malaysiaBankData(){
		
		GetDriver.driver.get("https://www.theswiftcodes.com/malaysia/");
		GetDriver.driver.manage().window().maximize();
		
		List<WebElement> row  = GetDriver.driver.findElements(By.tagName("td"));
	
		
		List<WebElement>  col = GetDriver.driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr[1]/th"));
		System.out.println("No of cols are : " +col.size());
		int colSize = col.size();
		
		
		List<WebElement> rows = GetDriver.driver.findElements(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr"));
		System.out.println("No of rows are : " +rows.size());
		int rowSize = rows.size();
		String bankName;
		String swiftCode;
	
		for(int i=2;i<rowSize;i++){
			try{
				bankName= GetDriver.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr["+i+"]/td[2]")).getText();
				swiftCode= GetDriver.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr["+i+"]/td[5]")).getText();
			System.out.println("bank name ==>"+bankName);
			System.out.println("swift code ==>"+swiftCode);
			System.out.println(" ");
			
			}
			catch(Exception e){
				
			}
		}
	}
	
	
	
	
}
