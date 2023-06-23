package test;

import Pages.*;

import Reports.ExtentReportsSBIG;
import org.json.JSONTokener;
import org.testng.annotations.*;
import qa.BaseTest;
import utils.TestUtils;

import java.io.InputStream;
import java.lang.reflect.Method;

//@Listeners({ITestListener.class})
public class testCase1 extends BaseTest {

    PreHomeScreen preHomeScreen;
    HomeScreen homeScreen;
    PersonalDetails personalDetails;
    ArogyaSupreme arogyaSupreme;
    InsuredDetails insuredDetails;
    HealthQuestionare healthQuestionare;
    ProposerDetails proposerDetails;
    PDAddressPage pdAddressPage;
    NomineeDetails nomineeDetails;
    PolicySummary policySummary;
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
        preHomeScreen = new PreHomeScreen();
    }

    @AfterMethod
    public void afterMethod() {
    }

    @Test(priority = 1)
    public void preHomeScreen() {
//        preHomeScreen = new PreHomeScreen();
        try{
            preHomeScreen.No();
            utils.log().info("Clicked on No button");
            ExtentReportsSBIG.getTest().info("Clicked on No button");
            preHomeScreen.Skip();
            utils.log().info("Clicked on Skip button");
            ExtentReportsSBIG.getTest().info("Clicked on Skip button");
            preHomeScreen.PopUp();
            utils.log().info("Clicked on PopUp");
            ExtentReportsSBIG.getTest().info("Clicked on PopUp");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 2)
    public void homescreen(){
        homeScreen = new HomeScreen();
        try{
            homeScreen.Hamburger();
            utils.log().info("Clicked on Hamburger Menu");
            ExtentReportsSBIG.getTest().info("Clicked on Hamburger Menu");
            homeScreen.BuyHealthInsurance();
            utils.log().info("Clicked on Buy Health Insurance");
            ExtentReportsSBIG.getTest().info("Clicked on Buy Health Insurance");
            homeScreen.ArogyaSupreme();
            utils.log().info("Clicked on Arogya Supreme");
            ExtentReportsSBIG.getTest().info("Clicked on Arogya Supreme");
            homeScreen.next();
            utils.log().info("Clicked on Next button");
            ExtentReportsSBIG.getTest().info("Clicked on Next button");
            homeScreen.next();
            utils.log().info("Clicked on Next button");
            ExtentReportsSBIG.getTest().info("Clicked on Next button");
            homeScreen.OKGotIt();
            utils.log().info("Clicked on Ok Got It");
            ExtentReportsSBIG.getTest().info("Clicked on Ok Got It");
            homeScreen.GetQuote();
            utils.log().info("Clicked on Get Quote");
            ExtentReportsSBIG.getTest().info("Clicked on Get Quote");
        }catch (Exception e){
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
            ExtentReportsSBIG.getTest().info("Clicked on Next button");
            personalDetails.EmailId();
            utils.log().info("Entered Email Id");
            ExtentReportsSBIG.getTest().info("Entered Email Id");
            personalDetails.Next();
            utils.log().info("Clicked on Next button");
            ExtentReportsSBIG.getTest().info("Clicked on Next button");
            personalDetails.PinCode();
            utils.log().info("Entered Pincode");
            ExtentReportsSBIG.getTest().info("Entered Pincode");
            personalDetails.SelectPincode();
            utils.log().info("Selected Pincode");
            ExtentReportsSBIG.getTest().info("Selected Pincode");
            personalDetails.Next();
            utils.log().info("Clicked on Next button");
            ExtentReportsSBIG.getTest().info("Clicked on Next button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 4)
    public void arogyaSupreme(){
        arogyaSupreme = new ArogyaSupreme();
        try {
            arogyaSupreme.Compare();
            utils.log().info("Clicked on Compare and scrolled");
            ExtentReportsSBIG.getTest().info("Clicked on Compare and scrolled");
            arogyaSupreme.SelectPlan();
            utils.log().info("Clicked on Select plan");
            ExtentReportsSBIG.getTest().info("Clicked on Select Plan");
            arogyaSupreme.PolicyType();
            utils.log().info("Clicked on Policy Type");
            ExtentReportsSBIG.getTest().info("Clicked on Policy Type");
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void insuredDetails() {
        insuredDetails = new InsuredDetails();
        try {
            insuredDetails.Self();
            utils.log().info("Clicked on Self");
            ExtentReportsSBIG.getTest().info("Clicked on Self");
            insuredDetails.IDGender();
            utils.log().info("Clicked on Gender");
            ExtentReportsSBIG.getTest().info("Clicked on Gender");
            insuredDetails.IDAge();
            utils.log().info("Clicked on Age");
            ExtentReportsSBIG.getTest().info("Clicked on Age");
            insuredDetails.SelectIDAge();
            utils.log().info("Selected Age");
            ExtentReportsSBIG.getTest().info("Selected Age");
            insuredDetails.IDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            insuredDetails.SumInsuredAmount();
            utils.log().info("Clicked on Sum Insured Amount");
            ExtentReportsSBIG.getTest().info("Clicked on Sum Insured Amount");
            insuredDetails.IDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            insuredDetails.CoveragePackage();
            utils.log().info("Clicked on Coverage Package");
            ExtentReportsSBIG.getTest().info("Clicked on Coverage Package");
            insuredDetails.CoveragePeriod();
            utils.log().info("Clicked on Coverage Period");
            ExtentReportsSBIG.getTest().info("Clicked on Coverage Period");
            insuredDetails.ReviewQuote();
            utils.log().info("Clicked on Review Quote");
            ExtentReportsSBIG.getTest().info("Clicked on Review Quote");
            insuredDetails.IDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            insuredDetails.Unmarried();
            utils.log().info("Clicked on Unmarried");
            ExtentReportsSBIG.getTest().info("Clicked on Unmarried");
            insuredDetails.IDFirstName();
            utils.log().info("Entered First Name");
            ExtentReportsSBIG.getTest().info("Entered First Name");
            insuredDetails.IDLastName();
            utils.log().info("Entered Last Name");
            ExtentReportsSBIG.getTest().info("Entered Last Name");
            insuredDetails.IDDOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            insuredDetails.IDConfirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            insuredDetails.IDSaveDetails();
            utils.log().info("Clicked on Save Details");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void healthQuestionare(){
        healthQuestionare = new HealthQuestionare();
        try {
            healthQuestionare.AnyOtherPolicy();
            utils.log().info("Select if Having Any Other Policy");
            ExtentReportsSBIG.getTest().info("Select if Having Any Other Policy");
            healthQuestionare.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            healthQuestionare.No1();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.No2();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.No3();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.No4();
            utils.log().info("Clicked on No");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestionare.No5();
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
    @Test(priority = 7)
    public void proposerDetails(){
        proposerDetails = new ProposerDetails();
        try {
            proposerDetails.PanNumber();
            utils.log().info("Entered Pan Number");
            ExtentReportsSBIG.getTest().info("Entered Pan Number");
            proposerDetails.Occupation();
            utils.log().info("Clicked on Occupation");
            ExtentReportsSBIG.getTest().info("Clicked on Occupation");
            proposerDetails.SelectOccupation();
            utils.log().info("Selected Occupation");
            ExtentReportsSBIG.getTest().info("Selected Occupation");
            proposerDetails.PDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void pdAddressPage(){
        pdAddressPage = new PDAddressPage();
        try {
            pdAddressPage.SelectArea();
            utils.log().info("Clicked on Select Area");
            ExtentReportsSBIG.getTest().info("Clicked on Select Area");
            pdAddressPage.BengaliMarket();
            utils.log().info("Clicked on Bengali Market");
            ExtentReportsSBIG.getTest().info("Clicked on Bengali Market");
            pdAddressPage.PlotNumber();
            utils.log().info("Clicked and Entered Plot Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Plot Number");
            pdAddressPage.BuildingApartmentName();
            utils.log().info("Clicked and Entered Building/Apartment");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Building/Apartment");
            pdAddressPage.StreetName();
            utils.log().info("Clicked and Entered Street Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Street Name");
            pdAddressPage.PDANext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 9)
    public void nomineeDetails(){
        nomineeDetails = new NomineeDetails();

        try {
            nomineeDetails.NDGender();
            utils.log().info("Clicked on Gender");
            ExtentReportsSBIG.getTest().info("Clicked on Gender");
            nomineeDetails.NDFirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            nomineeDetails.NDLastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
            nomineeDetails.NomineeRelation();
            utils.log().info("Clicked on Nominee Relation");
            ExtentReportsSBIG.getTest().info("Clicked on Nominee Relation");
            nomineeDetails.Mother();
            utils.log().info("Clicked on Mother");
            ExtentReportsSBIG.getTest().info("Clicked on Mother");
            nomineeDetails.NDOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            nomineeDetails.SelectYear();
            utils.log().info("Clicked on Select Year");
            ExtentReportsSBIG.getTest().info("Clicked on Select Year");
            nomineeDetails.Year();
            utils.log().info("Clicked on Year");
            ExtentReportsSBIG.getTest().info("Clicked on Year");
            nomineeDetails.Confirm();
            utils.log().info("Clicked on Confirm Button");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm Button");
            nomineeDetails.NDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            nomineeDetails.EIANumber();
            utils.log().info("Clicked on EIA Number");
            ExtentReportsSBIG.getTest().info("Clicked on EIA Number");
            nomineeDetails.EIANumber1();
            utils.log().info("Selected EIA Number");
            ExtentReportsSBIG.getTest().info("Selected EIA Number");
            nomineeDetails.NDNext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority=10)
    public void policySummary(){
        policySummary = new PolicySummary();
        try {
            policySummary.Done();
            utils.log().info("Clicked on Done");
            ExtentReportsSBIG.getTest().info("Clicked on Done");
            policySummary.ProceedWithKYC();
            utils.log().info("Clicked on Proceed With KYC Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed with KYC Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 11)
    public void submitYourDetails(){
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
            utils.log().info("Clicked on Add Filed");
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
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}


