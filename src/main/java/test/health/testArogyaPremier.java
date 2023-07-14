package test.health;

import Pages.Health.ArogyaPremier.*;
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
    IntroPage introPage;
    PersonalDetails personalDetails;
    PolicyType policyType;

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
    @Test(priority = 2)
    public void IntroPage(){
        introPage = new IntroPage();
        try {
            introPage.ArogyaPremier();
            utils.log().info("Clicked on Arogya Premier");
            ExtentReportsSBIG.getTest().info("Clicked on Arogya Premier");
            introPage.GetQuote();
            utils.log().info("Clicked on Get Quote");
            ExtentReportsSBIG.getTest().info("Clicked on Get Quote");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 3)
    public void PersonalDetails(){
        personalDetails = new PersonalDetails();
        try {
            personalDetails.MobileNumber();
            utils.log().info("Entered Mobile Number");
            ExtentReportsSBIG.getTest().info("Entered Mobile Number");
            personalDetails.EmailAddress();
            utils.log().info("Entered Email Address");
            ExtentReportsSBIG.getTest().info("Entered Email Address");
            personalDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 4)
    public void PolicyType(){
        policyType = new PolicyType();
        try {
            policyType.SelectPolicy();
            utils.log().info("Clicked on Individual in Policy Type");
            ExtentReportsSBIG.getTest().info("Clicked on Individual in Policy Type");
            policyType.Self();
            utils.log().info("Clicked on Self");
            ExtentReportsSBIG.getTest().info("Clicked on Self");
            policyType.Gender();
            utils.log().info("Selected Gender as Female");
            ExtentReportsSBIG.getTest().info("Selected Gender as Female");
            policyType.Age();
            utils.log().info("Clicked on Age");
            ExtentReportsSBIG.getTest().info("Clicked on Age");
            policyType.SelectAge();
            utils.log().info("Selected Age");
            ExtentReportsSBIG.getTest().info("Selected Age");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
