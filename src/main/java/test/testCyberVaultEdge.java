package test;


import Pages.CyberVaultEdge.*;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testCyberVaultEdge extends BaseTest {
    HomeScreen homeScreen;
    IntroPage introPage;
    PersonalDetails personalDetails;
    RecommendationQuestions recommendationQuestions;
    PolicyType policyType;
    InsuredDetails insuredDetails;
    HealthQuestionare healthQuestionare;
    ProposerDetails proposerDetails;
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
//            homeScreen.Hamburger();
            homeScreen.Renew();
//            homeScreen.CyberVaultEdge();
//            utils.log().info("Clicked on Cyber VaultEdge");
//            ExtentReportsSBIG.getTest().info("Clicked on Cyber VaultEdge");
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
            utils.log().info("Clicked and Entered Email Address");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Email Address");
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
    public void RecommendationQuestions(){
        recommendationQuestions = new RecommendationQuestions();
        try {
//            recommendationQuestions.Question1();
//            utils.log().info("Clicked Yes for Question1");
//            ExtentReportsSBIG.getTest().info("Clicked Yes for Question1");
//            recommendationQuestions.Question2();
//            utils.log().info("Clicked Yes for Question2");
//            ExtentReportsSBIG.getTest().info("Clicked Yes for Question2");
//            recommendationQuestions.Question3();
//            utils.log().info("Clicked Yes for Question3");
//            ExtentReportsSBIG.getTest().info("Clicked Yes for Question3");
//            recommendationQuestions.Question4();
//            utils.log().info("Clicked Yes for Question4");
//            ExtentReportsSBIG.getTest().info("Clicked Yes for Question4");
//            recommendationQuestions.Next();
//            utils.log().info("Clicked on Next Button");
//            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            recommendationQuestions.SkipToThePlans();
            utils.log().info("Clicked on Skip to the Plans");
            ExtentReportsSBIG.getTest().info("Clicked on Skip to the Plans");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void PolicyType(){
        policyType = new PolicyType();
        try {
            policyType.Coverage();
            utils.log().info("Clicked on Continue");
            ExtentReportsSBIG.getTest().info("Clicked on Continue");
            policyType.PolicyType();
            utils.log().info("Policy Type selected as Individual");
            ExtentReportsSBIG.getTest().info("Policy Type selected as Individual");
            policyType.Self();
            utils.log().info("Self is selected for I want to cover");
            ExtentReportsSBIG.getTest().info("Self is selected for I want to cover");
            policyType.Gender();
            utils.log().info("Gender selected as Female");
            ExtentReportsSBIG.getTest().info("Gender selected as Female");
            policyType.Age();
            utils.log().info("Clicked on Age");
            ExtentReportsSBIG.getTest().info("Clicked on Age");
            policyType.SelectAge();
            utils.log().info("Selected Age as 21Years");
            ExtentReportsSBIG.getTest().info("Selected Age as 21Years");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.SumInsuredType();
            utils.log().info("Sum Insured Type selected as Aggregate Sum Insured for all selected coverages");
            ExtentReportsSBIG.getTest().info("Sum Insured Type selected as Aggregate Sum Insured for all selected coverages");
            policyType.SumInsuredAmount();
            utils.log().info("Sum Insured Amount selected as Rs.5 Lakhs");
            ExtentReportsSBIG.getTest().info("Sum Insured Amount selected as Rs.5 Lakhs");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.LoyaltyDiscount();
            utils.log().info("Clicked on No in Loyalty Discount");
            ExtentReportsSBIG.getTest().info("Clicked on No in Loyalty Discount");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.EmployeeDiscount();
            utils.log().info("Clicked on No in Employee Discount");
            ExtentReportsSBIG.getTest().info("Clicked on No in Employee Discount");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.Discount();
            utils.log().info("Clicked on Continue in Total Discount");
            ExtentReportsSBIG.getTest().info("Clicked on Continue in Total Discount");
            policyType.ReviewQuote();
            utils.log().info("Clicked on Proceed To Buy");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed To Buy");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void InsuredDetails(){
        insuredDetails = new InsuredDetails();
        try {
            insuredDetails.MaritialStatus();
            utils.log().info("Maritial Status selected as Unmarried");
            ExtentReportsSBIG.getTest().info("Maritial Status selected as Unmarried");
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
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            insuredDetails.SaveDetails();
            utils.log().info("Clicked on Save Details");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 7)
    public void HealthQuestionare(){
        healthQuestionare = new HealthQuestionare();
        try {
            healthQuestionare.HealthQuestionare1();
            utils.log().info("Clicked on No in Question Answer1");
            ExtentReportsSBIG.getTest().info("Clicked on No in Question Answer1");
            healthQuestionare.HealthQuestionare2();
            utils.log().info("Clicked on No in Question Answer2");
            ExtentReportsSBIG.getTest().info("Clicked on No in Question Answer2");
            healthQuestionare.HealthQuestionare3();
            utils.log().info("Clicked on No in Question Answer3");
            ExtentReportsSBIG.getTest().info("Clicked on No in Question Answer3");
            healthQuestionare.HealthQuestionare4();
            utils.log().info("Clicked on No in Question Answer4");
            ExtentReportsSBIG.getTest().info("Clicked on No in Question Answer4");
            healthQuestionare.Next();
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
            proposerDetails.PanNumber();
            utils.log().info("Clicked and Entered Pan Number");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Pan Number");
            proposerDetails.Occupation();
            utils.log().info("Clicked on Types of Occupation");
            ExtentReportsSBIG.getTest().info("Clicked on Types of Occupation");
            proposerDetails.SelectOccupation();
            utils.log().info("Selected Occupation as Self Employed");
            ExtentReportsSBIG.getTest().info("Selected Occupation as Self Employed");
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
            proposerDetails.EIANumber();
            utils.log().info("Clicked on No in EIA Number");
            ExtentReportsSBIG.getTest().info("Clicked on No in EIA Number");
            proposerDetails.SelectEIANumber();
            utils.log().info("Selected EIA Number");
            ExtentReportsSBIG.getTest().info("Selected EIA Number");
            proposerDetails.EIANext();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            proposerDetails.Done();
            utils.log().info("Clicked on Done Button");
            ExtentReportsSBIG.getTest().info("Clicked on Done Button");
            proposerDetails.ProceedWithKYC();
            utils.log().info("Clicked on Proceed With KYC Button");
            ExtentReportsSBIG.getTest().info("Clicked on Proceed With KYC Button");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 9)
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
            submitYourDetails.MandatoryDetails();
            utils.log().info("Clicked on Father's Details");
            ExtentReportsSBIG.getTest().info("Clicked on Father's Details");
            submitYourDetails.FirstName();
            utils.log().info("Clicked and Entered First Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered First Name");
            submitYourDetails.LastName();
            utils.log().info("Clicked and Entered Last Name");
            ExtentReportsSBIG.getTest().info("Clicked and Entered Last Name");
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
