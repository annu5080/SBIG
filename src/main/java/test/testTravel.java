package test;

import Pages.Travel.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testTravel extends BaseTest {
    HomeScreen homeScreen;
    IntroPage introPage;
    TravelInsuranceDetails travelInsuranceDetails;
    PolicyType policyType;
    HealthQuestionare healthQuestionare;
    ProposerDetails proposerDetails;
    NomineeDetails nomineeDetails;
    SubmitYourDetails submitYourDetails;

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
            homeScreen.Travel();
            utils.log().info("Clicked on Travel");
            ExtentReportsSBIG.getTest().info("Clicked on Travel");
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
    public void TravelInsuranceDetails(){
        travelInsuranceDetails = new TravelInsuranceDetails();
        try{
            travelInsuranceDetails.TripType();
            utils.log().info("Clicked on Single Trip in Trip Type");
            ExtentReportsSBIG.getTest().info("Clicked on Single Trip in Trip Type");
            travelInsuranceDetails.StartDateFrom();
            utils.log().info("Clicked on Choose date from");
            ExtentReportsSBIG.getTest().info("Clicked on Choose date from");
            travelInsuranceDetails.Confirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            travelInsuranceDetails.EndDateTo();
            utils.log().info("Clicked on End date To");
            ExtentReportsSBIG.getTest().info("Clicked on End date To");
//            travelInsuranceDetails.SelectEndDate();
//            utils.log().info("Selected End date");
//            ExtentReportsSBIG.getTest().info("Selected End date");
            travelInsuranceDetails.Confirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            travelInsuranceDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            travelInsuranceDetails.Destination();
            utils.log().info("Clicked No in Does your travel include USA/Canada?");
            ExtentReportsSBIG.getTest().info("Clicked No in Does your travel include USA/Canada?");
            travelInsuranceDetails.SearchCountry();
            utils.log().info("Clicked and Entered in Search Country");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Search Country");
            travelInsuranceDetails.SelectCountry();
            utils.log().info("Selected Country");
            ExtentReportsSBIG.getTest().info("Selected Country");
            travelInsuranceDetails.SaveDetails();
            utils.log().info("Clicked on Save Details");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details");
            travelInsuranceDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            travelInsuranceDetails.ContactDetails();
            utils.log().info("Clicked and Entered in Contact Details");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Contact Details");
            travelInsuranceDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            travelInsuranceDetails.EmailAddress();
            utils.log().info("Clicked and Entered in Email Address");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Email Address");
            travelInsuranceDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            travelInsuranceDetails.Traveller();
            utils.log().info("Clicked on Self");
            ExtentReportsSBIG.getTest().info("Clicked on Self");
            travelInsuranceDetails.Gender();
            utils.log().info("Clicked on Female in Gender");
            ExtentReportsSBIG.getTest().info("Clicked on Female in Gender");
            travelInsuranceDetails.FirstName();
            utils.log().info("Clicked and Entered in First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in First Name");
            travelInsuranceDetails.LastName();
            utils.log().info("Clicked and Entered in Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Last Name");
            travelInsuranceDetails.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            travelInsuranceDetails.SelectYear();
            utils.log().info("Selected Year");
            ExtentReportsSBIG.getTest().info("Selected Year");
            travelInsuranceDetails.Confirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            travelInsuranceDetails.PassportNumber();
            utils.log().info("Clicked and Entered in Passport Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Passport Number");
            travelInsuranceDetails.SaveDetails();
            utils.log().info("Clicked on Save Details");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details");
            travelInsuranceDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            travelInsuranceDetails.Consent();
            utils.log().info("Clicked on All the travellers will be travelling from India");
            ExtentReportsSBIG.getTest().info("Clicked on All the travellers will be travelling from India");
            travelInsuranceDetails.Next();
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
            policyType.CoverageAmount();
            utils.log().info("Coverage Amount selected");
            ExtentReportsSBIG.getTest().info("Coverage Amount selected");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.ProceedToBuy();
            utils.log().info("Clicked on Proceed To Buy Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed To Buy Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void HealthQuestionare(){
        healthQuestionare = new HealthQuestionare();
        try {
            healthQuestionare.GoodHealth();
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
    @Test(priority = 6)
    public void ProposerDetails(){
        proposerDetails = new ProposerDetails();
        try {
            proposerDetails.PanNumber();
            utils.log().info("Clicked and Entered in Pan Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered in Pan Number");
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
            utils.log().info("Clicked on Bengali Market");
            ExtentReportsSBIG.getTest().info("Clicked Bengali Market");
            proposerDetails.PlotDoorNumber();
            utils.log().info("Clicked and Entered Plot/Door Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Plot/Door Number");
            proposerDetails.BuildingApartmentName();
            utils.log().info("Clicked and Entered Building/Apartment Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Building/Apartment Name");
            proposerDetails.StreetName();
            utils.log().info("Clicked and Entered Street Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Street Name");
            proposerDetails.NextAddress();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 7)
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
            nomineeDetails.Done();
            utils.log().info("Clicked on Done Button");
            ExtentReportsSBIG.getTest().info("Clicked on Done Button");
            nomineeDetails.ProceedWithKYC();
            utils.log().info("Clicked on Proceed With KYC");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed With KYC");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void SubmitYourDetails(){
        submitYourDetails = new SubmitYourDetails();
        try {
            submitYourDetails.Upload();
            utils.log().info("Clicked on Upload");
            ExtentReportsSBIG.getTest().info("Clicked on Upload");
            submitYourDetails.FileManger();
            utils.log().info("Clicked on File Manager");
            ExtentReportsSBIG.getTest().info("Clicked on File Manager");
            submitYourDetails.SelectPhoto();
            utils.log().info("Selected Photo");
            ExtentReportsSBIG.getTest().info("Selected Photo");
            submitYourDetails.Proceed();
            utils.log().info("Clicked on Proceed Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed Button");
            submitYourDetails.IDProof();
            utils.log().info("Clicked on ID Proof");
            ExtentReportsSBIG.getTest().info("Clicked on ID Proof");
            submitYourDetails.Passport();
            utils.log().info("Clicked on Passport");
            ExtentReportsSBIG.getTest().info("Clicked on Passport");
            submitYourDetails.PassportNumber();
            utils.log().info("Entered Passport Number");
            ExtentReportsSBIG.getTest().info("Entered Passport Number");
            submitYourDetails.Upload();
            utils.log().info("Clicked on Upload");
            ExtentReportsSBIG.getTest().info("Clicked on Upload");
            submitYourDetails.FileManger();
            utils.log().info("Clicked on File Manager");
            ExtentReportsSBIG.getTest().info("Clicked on File Manager");
            submitYourDetails.SelectPhoto();
            utils.log().info("Selected Photo");
            ExtentReportsSBIG.getTest().info("Selected Photo");
            submitYourDetails.AddFiles();
            utils.log().info("Clicked on Add Files");
            ExtentReportsSBIG.getTest().info("Clicked on Add Files");
            submitYourDetails.FileManger();
            utils.log().info("Clicked on File Manager");
            ExtentReportsSBIG.getTest().info("Clicked on File Manager");
            submitYourDetails.SelectPhoto();
            utils.log().info("Selected Photo");
            ExtentReportsSBIG.getTest().info("Selected Photo");
            submitYourDetails.Proceed();
            utils.log().info("Clicked on Proceed Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed Button");
            submitYourDetails.Submit();
            utils.log().info("Clicked on Submit Button");
            ExtentReportsSBIG.getTest().info("Clicked on Submit Button");
            submitYourDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            submitYourDetails.VerifyOtp();
            utils.log().info("Clicked on Verify OTP");
            ExtentReportsSBIG.getTest().info("Clicked on Verify OTP");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
