package com.base;

import org.openqa.selenium.WebDriver;

public abstract class PoDriverClass {
	
    public static WebDriver driver = null;
    public static boolean bResult;

    public PoDriverClass(WebDriver driver) {
    	PoDriverClass.driver = driver;
    	PoDriverClass.bResult = true;
    }

    public static WebDriver poGetDriver() {
        return PoDriverClass.driver;
    }

    public static void poSetDriver(WebDriver driver) {
    	PoDriverClass.driver = driver;
    }

}
