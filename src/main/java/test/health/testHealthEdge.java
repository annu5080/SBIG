package test.health;

import Pages.Health.HealthEdge.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testHealthEdge extends BaseTest {
    HEHomeScreen heHomeScreen;
    IntroPage introPage;
    PersonalDetails personalDetails;
    PolicyType policyType;
    InsuredDetails insuredDetails;
    HealthQuestionare healthQuestionare;
    ProposerDetails proposerDetails;
    NomineeDetails nomineeDetails;
    EmployeeDiscount employeeDiscount;

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
        heHomeScreen = new HEHomeScreen();
    }

    @AfterMethod
    public void afterMethod() {
    }
    @Test(priority = 1)
    public void heHomeScreen(){
        try {
            heHomeScreen.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            heHomeScreen.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            heHomeScreen.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
            heHomeScreen.Health();
            utils.log().info("Clicked on Health");
            ExtentReportsSBIG.getTest().info("Clicked on Health ");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 2)
    public void introPage(){
        introPage = new IntroPage();
        try {
            introPage.HealthEdge();
            utils.log().info("Clicked on Health Edge");
            ExtentReportsSBIG.getTest().info("Clicked on Health Edge");
            introPage.SkipNow();
            utils.log().info("Clicked on Skip Now");
            ExtentReportsSBIG.getTest().info("Clicked on Skip Now");
            introPage.GetQuote();
            utils.log().info("Scroll and Clicked on Get Quote");
            ExtentReportsSBIG.getTest().info("Scroll and Clicked on Get Quote");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 3)
    public void personalDetails(){
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
    public void policyType(){
        policyType = new PolicyType();
        try {
            policyType.PolicyType();
            utils.log().info("Clicked on Individual in Policy Type");
            ExtentReportsSBIG.getTest().info("Clicked on Individual in Policy Type");
            policyType.InsuredDetails();
            utils.log().info("Clicked on Self");
            ExtentReportsSBIG.getTest().info("Clicked on Self");
            policyType.Gender();
            utils.log().info("Selected Gender");
            ExtentReportsSBIG.getTest().info("Selected Gender");
            policyType.Age();
            utils.log().info("Clicked on Age");
            ExtentReportsSBIG.getTest().info("Clicked on Age");
            policyType.SelectAge();
            utils.log().info("Selected Age");
            ExtentReportsSBIG.getTest().info("Selected Age");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.Compare();
            utils.log().info("Clicked on Compare all plans");
            ExtentReportsSBIG.getTest().info("Clicked on Compare all plans");
            policyType.Select();
            utils.log().info("Selected Plan A");
            ExtentReportsSBIG.getTest().info("Selected Plan A");
            policyType.Proceed();
            utils.log().info("Clicked on Proceed");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed");
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
            utils.log().info("Clicked on Proceed to Buy Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed to Buy Button");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void InsuredDetails(){
        insuredDetails = new InsuredDetails();
        try {
            insuredDetails.Self();
            utils.log().info("Clicked on Self");
            ExtentReportsSBIG.getTest().info("Clicked on Self");
            insuredDetails.MaritialStatus();
            utils.log().info("Selected Unmarried");
            ExtentReportsSBIG.getTest().info("Selected Unmarried");
            insuredDetails.FirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            insuredDetails.LastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
            insuredDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            insuredDetails.Confirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            insuredDetails.Feet();
            utils.log().info("Entered Feet");
            ExtentReportsSBIG.getTest().info("Entered Feet");
            insuredDetails.Inch();
            utils.log().info("Entered Inch");
            ExtentReportsSBIG.getTest().info("Entered Inch");
            insuredDetails.Weight();
            utils.log().info("Entered Weight");
            ExtentReportsSBIG.getTest().info("Entered Weight");
            insuredDetails.SaveDetails();
            utils.log().info("Clicked on Save Details Button");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details Button");
            insuredDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            insuredDetails.ConcurrentPolicy();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            insuredDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void HealthQuestionare(){
        healthQuestionare = new HealthQuestionare();
        try {
            healthQuestionare.HealthQuestionare1();
            utils.log().info("Clicked on Yes");
            ExtentReportsSBIG.getTest().info("Clicked on Yes");
            healthQuestionare.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 7)
    public void ProposerDetails(){
        proposerDetails = new ProposerDetails();
        try {
            proposerDetails.PanNumber();
            utils.log().info("Clicked and Entered Pan Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pan Number");
            proposerDetails.Occupation();
            utils.log().info("Clicked on Occupation");
            ExtentReportsSBIG.getTest().info("Clicked on Occupation");
            proposerDetails.SelectOccupation();
            utils.log().info("Clicked on Self Employed");
            ExtentReportsSBIG.getTest().info("Clicked on Self Employed");
            proposerDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.Pincode();
            utils.log().info("Clicked and Entered Pincode");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pincode");
            proposerDetails.SelectArea();
            utils.log().info("Clicked on Select Area");
            ExtentReportsSBIG.getTest().info("Clicked on Select Area");
            proposerDetails.BengaliMarket();
            utils.log().info("Selected Bengali Market");
            ExtentReportsSBIG.getTest().info("Selected Bengali Market");
            proposerDetails.PlotDoorNumber();
            utils.log().info("Clicked and Entered Plot/Door Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Plot/Door Number");
            proposerDetails.BuildingApartmentName();
            utils.log().info("Clicked and Entered Building/Apartment Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Building/Apartment Name");
            proposerDetails.StreetName();
            utils.log().info("Clicked and Entered Street Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Street Name");
            proposerDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void NomineeDetails(){
        nomineeDetails = new NomineeDetails();
        try {
            nomineeDetails.Gender();
            utils.log().info("Gender Selected");
            ExtentReportsSBIG.getTest().info("Gender Selected");
            nomineeDetails.FirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            nomineeDetails.LastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
            nomineeDetails.NomineeRelation();
            utils.log().info("Clicked on Nominee Relation");
            ExtentReportsSBIG.getTest().info("Clicked on Nominee Relation");
            nomineeDetails.Mother();
            utils.log().info("Selected Mother");
            ExtentReportsSBIG.getTest().info("Selected Mother");
            nomineeDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            nomineeDetails.SelectYear();
            utils.log().info("Clicked Year");
            ExtentReportsSBIG.getTest().info("Clicked Year");
            nomineeDetails.Year();
            utils.log().info("Selected Year");
            ExtentReportsSBIG.getTest().info("Selected Year");
            nomineeDetails.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            nomineeDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            nomineeDetails.EIANumber();
            utils.log().info("Clicked on No in EIA Number");
            ExtentReportsSBIG.getTest().info("Clicked on No in EIA Number");
            nomineeDetails.SelectEIA();
            utils.log().info("Selected option1 in EIA Number");
            ExtentReportsSBIG.getTest().info("Selected option1 in EIA Number");
            nomineeDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 9)
    public void EmployeeDiscount(){
        employeeDiscount = new EmployeeDiscount();
        try {
            employeeDiscount.No();
            utils.log().info("Clicked on No Button");
            ExtentReportsSBIG.getTest().info("Clicked on No Button");
            employeeDiscount.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
