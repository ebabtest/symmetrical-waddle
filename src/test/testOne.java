package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver f=new FirefoxDriver();
		f.get("www.stgtrioblumen.com");
		 f.findElement(By.id("txtOrgCode")).sendKeys("reportsts");
	        f.findElement(By.id("txtUser")).sendKeys("swagatika");
	        f.findElement(By.id("txtPassword")).sendKeys("Bm");
	        f.findElement(By.xpath(".//*[@id='imgSignin']")).click();
		
	}

}
