package test;


import Pages.Home.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testHome extends BaseTest {
    HomeScreen homeScreen;
    IntroPage introPage;
    PolicyType policyType;
    ContactDetails contactDetails;
    StructureDetails structureDetails;
    CoveragePeriod coveragePeriod;
    InsuredPropertyAddress insuredPropertyAddress;
    ProposerDetails proposerDetails;

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
        try {
            homeScreen.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            homeScreen.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            homeScreen.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
            homeScreen.SeeMoreProducts();
            utils.log().info("Clicked on See More Options");
            ExtentReportsSBIG.getTest().info("Clicked on See More Options");
            homeScreen.Home();
            utils.log().info("Clicked on Home");
            ExtentReportsSBIG.getTest().info("Clicked on Home");
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
            introPage.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            introPage.OkGotIt();
            utils.log().info("Clicked on Ok,Got It");
            ExtentReportsSBIG.getTest().info("Clicked on Ok,Got It");
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
    public void PolicyType(){
        policyType = new PolicyType();
        try {
            policyType.CustomerType();
            utils.log().info("Selected Customer Type as Landlord");
            ExtentReportsSBIG.getTest().info("Selected Customer Type as Landlord");
            policyType.CustomerCategory();
            utils.log().info("Selected Customer Category as Individual");
            ExtentReportsSBIG.getTest().info("Selected Customer Category as Individual");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.CoverType();
            utils.log().info("Selected Cover Type as Structure");
            ExtentReportsSBIG.getTest().info("Selected Cover Type as Structure");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.StructureOnly();
            utils.log().info("Clicked on Secure Structure Only");
            ExtentReportsSBIG.getTest().info("Clicked on Secure Structure Only");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 4)
    public void ContactDetails(){
        contactDetails = new ContactDetails();
        try {
            contactDetails.FirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            contactDetails.LastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
            contactDetails.MobileNumber();
            utils.log().info("Clicked and Entered Mobile Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Mobile Number");
            contactDetails.EmailAddress();
            utils.log().info("Clicked and Entered Email Address");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Email Address");
            contactDetails.TermsandConditions();
            utils.log().info("Clicked on Terms and Conditions Checkbox");
            ExtentReportsSBIG.getTest().info("Clicked on Terms and Conditions Checkbox");
            contactDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void StructureDetails(){
        structureDetails = new StructureDetails();
        try {
            structureDetails.CarpetArea();
            utils.log().info("Clicked and Entered Carpet Area");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Carpet Area");
            structureDetails.YearofConstruction();
            utils.log().info("Clicked on Year of Construction");
            ExtentReportsSBIG.getTest().info("Clicked on Year of Construction");
            structureDetails.SelectYearofConstructions();
            utils.log().info("Select Year of Construction");
            ExtentReportsSBIG.getTest().info("Selected Year of Construction");
            structureDetails.Multistorey();
            utils.log().info("Clicked on Multistorey");
            ExtentReportsSBIG.getTest().info("Clicked on Multistorey");
            structureDetails.Calculate();
            utils.log().info("Clicked on Calculate");
            ExtentReportsSBIG.getTest().info("Clicked on Calculate");
            structureDetails.Done();
            utils.log().info("Clicked on Done Button");
            ExtentReportsSBIG.getTest().info("Clicked on Done Button");
            structureDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            structureDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void CoveragePeriod(){
        coveragePeriod = new CoveragePeriod();
        try {
            coveragePeriod.CoveragePeriod();
            utils.log().info("Clicked on Coverage Period");
            ExtentReportsSBIG.getTest().info("Clicked on Coverage Period");
            coveragePeriod.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            coveragePeriod.ProceedToBuy();
            utils.log().info("Clicked on Proceed To Buy");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed To Buy");
            coveragePeriod.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 7)
    public void InsuredPropertyAddress(){
        insuredPropertyAddress = new InsuredPropertyAddress();
        try {
            insuredPropertyAddress.PlotDoorNumber();
            utils.log().info("Clicked and Entered Plot/Door Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Plot/Door Number");
            insuredPropertyAddress.FloorNumber();
            utils.log().info("Clicked and Entered Floor Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Floor Number");
            insuredPropertyAddress.BuildingApartmentName();
            utils.log().info("Clicked and Entered Building/Apartment Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Building/Apartment Name");
            insuredPropertyAddress.StreetName();
            utils.log().info("Clicked and Entered Street Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Street Name");
            insuredPropertyAddress.Pincode();
            utils.log().info("Clicked and Entered Pincode");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pincode");
            insuredPropertyAddress.SelectArea();
            utils.log().info("Clicked on Select Area");
            ExtentReportsSBIG.getTest().info("Clicked on Select Area");
            insuredPropertyAddress.BengaliMarket();
            utils.log().info("Clicked on Bengali Market");
            ExtentReportsSBIG.getTest().info("Clicked on Bengali Market");
            insuredPropertyAddress.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void ProposerDetails(){
        proposerDetails = new ProposerDetails();
        try {
            proposerDetails.Gender();
            utils.log().info("Clicked on Female as Gender");
            ExtentReportsSBIG.getTest().info("Clicked on Female as Gender");
            proposerDetails.FirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            proposerDetails.LastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
            proposerDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            proposerDetails.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            proposerDetails.PanNumber();
            utils.log().info("Clicked and Entered Pan Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pan Number");
            proposerDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.NextAddress();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.NextAddress();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.EIANumber();
            utils.log().info("Clicked on EIA Number");
            ExtentReportsSBIG.getTest().info("Clicked on EIA Number");
            proposerDetails.SelectEIANumber();
            utils.log().info("Selected EIA Number");
            ExtentReportsSBIG.getTest().info("Selected EIA Number");
            proposerDetails.NextAddress();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.Done();
            utils.log().info("Clicked on Done Button");
            ExtentReportsSBIG.getTest().info("Clicked on Done Button");
            proposerDetails.VerifyOTP();
            utils.log().info("Clicked on Verify OTP Button");
            ExtentReportsSBIG.getTest().info("Clicked on Verify OTP Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
