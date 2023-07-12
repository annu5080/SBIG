package test.health;

import Pages.Health.ArogyaSupreme.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testArogyaPremier extends BaseTest {
    HomeScreen homeScreen;

    TestUtils utils = new TestUtils();
//    @BeforeClass
//    public void beforeClass() throws Exception {
//        InputStream datais = null;
//        try {
//            String dataFileName = "data/loginUsers.json";
//            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
//            JSONTokener tokener = new JSONTokener(datais);
////            loginUsers = new JSONObject(tokener);
//        } catch(Exception e) {
//            e.printStackTrace();
//            throw e;
//        } finally {
//            if(datais != null) {
//                datais.close();
//            }
//        }
//        closeApp();
//        launchApp();
//    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
        homeScreen = new HomeScreen();
    }

    @AfterMethod
    public void afterMethod() {
    }


    @Test(priority = 1)
    public void HomeScreen(){
        try{
            homeScreen.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            homeScreen.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            homeScreen.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
            homeScreen.Health();
            utils.log().info("Clicked on Health");
            ExtentReportsSBIG.getTest().info("Clicked on Health");
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}