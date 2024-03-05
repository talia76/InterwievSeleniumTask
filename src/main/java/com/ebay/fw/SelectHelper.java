package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHelper extends BaseHelper{

    public SelectHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnDepartmentLink(String department) {
        // click(By.xpath("(//a[.='" + department + "'])[2]"));
        // click(By.xpath("//div[@id='vl-flyout-nav']/ul/li[6]/a"));
        //click(By.cssSelector("#vl-flyout-nav>ul>li:nth-child(" + department + ")"));
        click(By.cssSelector("#vl-flyout-nav>ul>li:nth-child(" + department + ")"));
    }

    public void selectSection(String type) {
        click(By.cssSelector(".b-visualnav__tile:nth-child(" + type + ")"));


    }

    public void selectBrand(String brand) {
        click((By.xpath("//div[.='" + brand + "']")));
    }
}






















