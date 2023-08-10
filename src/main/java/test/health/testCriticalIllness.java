package test.health;


import Pages.Health.Critical_Illness.HomePage;
import Pages.Health.Critical_Illness.HealthQuestionare;
import Pages.Health.Critical_Illness.InsuredDetails;
import Pages.Health.Critical_Illness.IntroPage;
import Pages.Health.Critical_Illness.PersonalDetails;
import Pages.Health.Critical_Illness.PolicyType;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testCriticalIllness extends BaseTest {
    HomePage homePage;
    IntroPage introPage;
    PersonalDetails personalDetails;
    PolicyType policyType;
    InsuredDetails insuredDetails;
    HealthQuestionare healthQuestionare;

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
        homePage = new HomePage();
    }

    @AfterMethod
    public void afterMethod() {
    }


    @Test(priority = 1)
    public void HomePage(){
        try{
            homePage.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            homePage.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            homePage.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
            homePage.Health();
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
        try{
            introPage.CriticalIllness();
            utils.log().info("Clicked on Critical Illness");
            ExtentReportsSBIG.getTest().info("Clicked on Critical Illness");
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
        try{
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
            policyType.Employee();
            utils.log().info("Selected Yes in Employeed");
            ExtentReportsSBIG.getTest().info("Selected Yes in Employeed");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.MonthlyIncome();
            utils.log().info("Entered Monthly Income");
            ExtentReportsSBIG.getTest().info("Entered Monthly Income");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.SumInsuredAmount();
            utils.log().info("Sum Insured Amount Selected");
            ExtentReportsSBIG.getTest().info("Sum Insured Amount Selected");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.SelectTimePeriod();
            utils.log().info("Time Period Selected");
            ExtentReportsSBIG.getTest().info("Time Period Selected");
            policyType.ProceedToBuy();
            utils.log().info("Clicked on Proceed To Buy");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed To Buy");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void InsuredDetails(){
        insuredDetails = new InsuredDetails();
        try {
            insuredDetails.FirstName();
            utils.log().info("Entered First Name");
            ExtentReportsSBIG.getTest().info("Entered First Name");
            insuredDetails.LastName();
            utils.log().info("Entered Last Name");
            ExtentReportsSBIG.getTest().info("Entered Last Name");
            insuredDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            insuredDetails.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            insuredDetails.Feet();
            utils.log().info("Entered Feet");
            ExtentReportsSBIG.getTest().info("Entered Feet");
            insuredDetails.Inches();
            utils.log().info("Entered Inches");
            ExtentReportsSBIG.getTest().info("Entered Inches");
            insuredDetails.Weight();
            utils.log().info("Entered Weight");
            ExtentReportsSBIG.getTest().info("Entered Weight");
            insuredDetails.SaveDetails();
            utils.log().info("Entered Save Details");
            ExtentReportsSBIG.getTest().info("Entered Save Details");
            insuredDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void HealthQuestionare(){
        healthQuestionare = new HealthQuestionare();
        try {
            healthQuestionare.HaveCriticalIllness();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            healthQuestionare.HealthQuestionare1();
            utils.log().info("Clicked on Yes");
            ExtentReportsSBIG.getTest().info("Clicked on Yes");
            healthQuestionare.HealthQuestionare2();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.HealthQuestionare3();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.HealthQuestionare4();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
