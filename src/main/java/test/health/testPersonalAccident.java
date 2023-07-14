package test.health;

import Pages.Health.PersonalAccident.HomePage;
import Pages.Health.PersonalAccident.HealthQuestinare;
import Pages.Health.PersonalAccident.InsuredDetails;
import Pages.Health.PersonalAccident.IntroPage;
import Pages.Health.PersonalAccident.NomineeDetails;
import Pages.Health.PersonalAccident.PersonalDetails;
import Pages.Health.PersonalAccident.PolicyType;
import Pages.Health.PersonalAccident.ProposerDetails;
import Pages.Health.PersonalAccident.SubmitYourDetails;
import Reports.ExtentReportsSBIG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.BaseTest;
import utils.TestUtils;

import java.lang.reflect.Method;

public class testPersonalAccident extends BaseTest {
    HomePage homePage;
    IntroPage introPage;
    PersonalDetails personalDetails;
    PolicyType policyType;
    InsuredDetails insuredDetails;
    HealthQuestinare healthQuestinare;
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
        try {
            introPage.PersonalAccident();
            utils.log().info("Clicked on Personal Accident");
            ExtentReportsSBIG.getTest().info("Clicked on Personal Accident");
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
            personalDetails.SelectCity();
            utils.log().info("Selected City as Kolkata");
            ExtentReportsSBIG.getTest().info("Selected City as Kolkata");
            personalDetails.Pincode();
            utils.log().info("Entered Pincode");
            ExtentReportsSBIG.getTest().info("Entered Pincode");
            personalDetails.SelectPincode();
            utils.log().info("Selected Pincode");
            ExtentReportsSBIG.getTest().info("Selected Pincode");
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
            policyType.PolicyType();
            utils.log().info("Clicked on Individual in Policy Type");
            ExtentReportsSBIG.getTest().info("Clicked on Individual in Policy Type");
            policyType.SelectGender();
            utils.log().info("Gender selected as Female");
            ExtentReportsSBIG.getTest().info("Gender selected as Female");
            policyType.DOB();
            utils.log().info("Clicked on DOB");
            ExtentReportsSBIG.getTest().info("Clicked on DOB");
            policyType.Confirm();
            utils.log().info("Clicked on Confirm");
            ExtentReportsSBIG.getTest().info("Clicked on Confirm");
            policyType.Occupation();
            utils.log().info("Clicked on Occupation");
            ExtentReportsSBIG.getTest().info("Clicked on Occupation");
            policyType.SelectOccupation();
            utils.log().info("Selected Occupation as Accountant");
            ExtentReportsSBIG.getTest().info("Selected Occupation as Accountant");
            policyType.GrossMonthlySalary();
            utils.log().info("Entered Gross Monthly Salary");
            ExtentReportsSBIG.getTest().info("Entered Gross Monthly Salary");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            policyType.SumInsuredAmount();
            utils.log().info("Sum Insured Amount Selected");
            ExtentReportsSBIG.getTest().info("Sum Insured Amount Selected");
            policyType.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
//            policyType.AdditionalCoverage();
//            utils.log().info("Additional Coverage selected");
//            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
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
    @Test(priority = 5)
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
            insuredDetails.SaveDetails();
            utils.log().info("Clicked on Save Details");
            ExtentReportsSBIG.getTest().info("Clicked on Save Details");
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void HealthQuestionare(){
        healthQuestinare = new HealthQuestinare();
        try {
            healthQuestinare.PersonalAccident();
            utils.log().info("Clicked on No ");
            ExtentReportsSBIG.getTest().info("Clicked on No");
            healthQuestinare.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            healthQuestinare.HealthQuestionare1();
            utils.log().info("Clicked on No in Health Quetionare1");
            ExtentReportsSBIG.getTest().info("Clicked on No in Health Quetionare1");
            healthQuestinare.HealthQuestionare2();
            utils.log().info("Clicked on No in Health Quetionare2");
            ExtentReportsSBIG.getTest().info("Clicked on No in Health Quetionare2");
            healthQuestinare.HealthQuestionare3();
            utils.log().info("Clicked on No in Health Quetionare3");
            ExtentReportsSBIG.getTest().info("Clicked on No in Health Quetionare3");
            healthQuestinare.HealthQuestionare4();
            utils.log().info("Clicked on No in Health Quetionare4");
            ExtentReportsSBIG.getTest().info("Clicked on No in Health Quetionare4");
            healthQuestinare.Next();
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
            proposerDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
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
            utils.log().info("Entered First Name");
            ExtentReportsSBIG.getTest().info("Entered First Name");
            nomineeDetails.LastName();
            utils.log().info("Entered Last Name");
            ExtentReportsSBIG.getTest().info("Entered Last Name");
            nomineeDetails.SelectRelation();
            utils.log().info("Clicked on Select Relation");
            ExtentReportsSBIG.getTest().info("Clicked on Select Relation");
            nomineeDetails.Mother();
            utils.log().info("Selected Relation");
            ExtentReportsSBIG.getTest().info("Selected Relation");
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
            nomineeDetails.SelectEIANumber();
            utils.log().info("Selected EIA Number");
            ExtentReportsSBIG.getTest().info("Selected EIA Number");
            nomineeDetails.Next();
            utils.log().info("Clicked on Next Button");
            ExtentReportsSBIG.getTest().info("Clicked on Next Button");
            nomineeDetails.Done();
            utils.log().info("Clicked on Done Button");
            ExtentReportsSBIG.getTest().info("Clicked on Done Button");
            nomineeDetails.ProceedWithKYC();
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
