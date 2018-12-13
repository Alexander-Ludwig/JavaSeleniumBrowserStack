package com.amazon;

import org.apache.commons.lang3.SystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class baseTestTheHomePage {



        public static String mode;
        public static String acceptSslCerts;
        public static String valueToBeSearched;
        public static String valueToBeSearched1;
        public static String valueToBeSearched2;


        @BeforeClass
        public static void startup() {




            mode = System.getProperty("mode", "local");

            acceptSslCerts = System.getProperty("acceptSslCerts", "true");

            if ("local".equalsIgnoreCase(mode)) {

                System.setProperty("selenide.reportsFolder", "C:\\dev\\gitProjects\\custOnBoardingImages");

                // only chrome for local for now.
                if (SystemUtils.IS_OS_WINDOWS) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\IdeaProjects\\webDrivers\\chromedriver_win32\\chromedriver.exe");
                }
//            if (SystemUtils.IS_OS_WINDOWS) {
//                System.setProperty("webdriver.ie.driver", "C:\\dev\\gitProjects\\drivers\\ie11\\IEDriverServer.exe");
//            }
                if (SystemUtils.IS_OS_LINUX) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\IdeaProjects\\HelloWorldSelenium\\src\\test\\resources\\chrome\\chromedriver.exe");
                }
                if (SystemUtils.IS_OS_MAC) {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\IdeaProjects\\HelloWorldSelenium\\src\\test\\resources\\chrome\\chromedriver.exe");
                }
            }
        }


        public static void GetGlobalVariables() {
            valueToBeSearched = System.getProperty("valueToBeSearched", "SAP ERP");
            valueToBeSearched1 = System.getProperty("valueToBeSearched1", "SAP ERP");
            valueToBeSearched2 = System.getProperty("valueToBeSearched2", "Add New Employee");
        }
        @AfterClass
        public static void tearDown(){

            System.out.println("***closed down browser, Test finished Successfully ");
        }



}


