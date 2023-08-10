package test.Motor;

import Pages.Motor.TwoWheeler.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testTwoWheeler extends BaseTest {
    HomePage homePage;
    IntroPage introPage;
    PersonalDetails personalDetails;
    RegistrationNumber registrationNumber;
    VehicleDetails vehicleDetails;
    PolicyType policyType;
    OwnerDetails ownerDetails;
    CommunicationDetails communicationDetails;

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
        try {
            homePage.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            homePage.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            homePage.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
            homePage.Motor();
            utils.log().info("Clicked on Motor");
            ExtentReportsSBIG.getTest().info("Clicked on Motor");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 2)
    public void IntroPage(){
        introPage = new IntroPage();
        try {
            introPage.TwoWheeler();
            utils.log().info("Clicked on Two Wheeler");
            ExtentReportsSBIG.getTest().info("Clicked on Two Wheeler");
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
    public void RegistrationNumber(){
        registrationNumber = new RegistrationNumber();
        try {
            registrationNumber.MH();
            utils.log().info("Clicked and Entered MH");
            ExtentReportsSBIG.getTest().info("Clicked and Entered MH");
            registrationNumber.Number();
            utils.log().info("Clicked and Entered 05");
            ExtentReportsSBIG.getTest().info("Clicked and Entered 05");
            registrationNumber.KA();
            utils.log().info("Clicked and Entered CF");
            ExtentReportsSBIG.getTest().info("Clicked and Entered CF");
            registrationNumber.Number2();
            utils.log().info("Clicked and Entered 5008");
            ExtentReportsSBIG.getTest().info("Clicked and Entered 5008");
            registrationNumber.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void VehicleDetails(){
        vehicleDetails = new VehicleDetails();
        try {
            vehicleDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            vehicleDetails.PolicyExpiryDate();
            utils.log().info("Clicked on Policy Expiry Date");
            ExtentReportsSBIG.getTest().info("Clicked on Policy Expiry Date");
            vehicleDetails.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            vehicleDetails.PolicyType();
            utils.log().info("Clicked on Comprehensive in Policy Type");
            ExtentReportsSBIG.getTest().info("Clicked on Comprehensive in Policy Type");
            vehicleDetails.NCB();
            utils.log().info("Clicked on 0% in No Claim Bonus");
            ExtentReportsSBIG.getTest().info("Clicked on 0% in No Claim Bonus");
            vehicleDetails.NCBPopUp();
            utils.log().info("Clicked on Congratulations Pop Up");
            ExtentReportsSBIG.getTest().info("Clicked on Congratulations Pop Up");
            vehicleDetails.SeePlans();
            utils.log().info("Clicked on See Plans");
            ExtentReportsSBIG.getTest().info("Clicked on See Plans");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void PolicyType(){
        policyType = new PolicyType();
        try {
            policyType.ComparePlans();
            utils.log().info("Clicked on Compare Plans");
            ExtentReportsSBIG.getTest().info("Clicked on Compare Plans");
            policyType.Buy();
            utils.log().info("Clicked on Buy");
            ExtentReportsSBIG.getTest().info("Clicked on Buy");
            policyType.PlanType();
            utils.log().info("Clicked on Proceed with Plan A");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed with Plan A");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
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
    @Test(priority = 7)
    public void OwnerDetails(){
        ownerDetails = new OwnerDetails();
        try {
            ownerDetails.OwnerType();
            utils.log().info("Owner Type selected as Individual");
            ExtentReportsSBIG.getTest().info("Owner Type selected as Individual");
            ownerDetails.Gender();
            utils.log().info("Selected Gender as Female");
            ExtentReportsSBIG.getTest().info("Selected Gender as Female");
            ownerDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            ownerDetails.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            ownerDetails.PanNumber();
            utils.log().info("Clicked and Entered Pan Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pan Number");
            ownerDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void CommunicationDetails(){
        communicationDetails = new CommunicationDetails();
        try {
            communicationDetails.Pincode();
            utils.log().info("Entered Pincode");
            ExtentReportsSBIG.getTest().info("Entered Pincode");
            communicationDetails.SelectArea();
            utils.log().info("Clicked on Select Area");
            ExtentReportsSBIG.getTest().info("Clicked on Select Area");
            communicationDetails.BengaliMarket();
            utils.log().info("Selected Bengali Market");
            ExtentReportsSBIG.getTest().info("Selected Bengali Market");
            communicationDetails.PlotDoorNumber();
            utils.log().info("Clicked and Entered Plot/Door Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Plot/Door Number");
            communicationDetails.BuildingApartmentName();
            utils.log().info("Clicked and Entered Building/Apartment Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Building/Apartment Name");
            communicationDetails.StreetName();
            utils.log().info("Clicked and Entered Street Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Street Name");
            communicationDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            communicationDetails.EIANumber();
            utils.log().info("Selected No in EIA Number");
            ExtentReportsSBIG.getTest().info("Selected No in EIA Number");
            communicationDetails.SelectEIANumber();
            utils.log().info("Selected EIA Number");
            ExtentReportsSBIG.getTest().info("Selected EIA Number");
            communicationDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}