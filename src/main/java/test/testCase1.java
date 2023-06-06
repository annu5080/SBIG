package test;

import Pages.*;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

//@Listeners({ITestListener.class})
public class testCase1 extends BaseClass {

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

    @Test(priority = 1)
    public void preHomeScreen() {
        preHomeScreen = new PreHomeScreen(appiumDriver);

        try{
            preHomeScreen.No().click();
            preHomeScreen.Skip().click();
            preHomeScreen.PopUp().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 2)
    public void homescreen(){
        homeScreen = new HomeScreen(appiumDriver);
        try{
            homeScreen.Hamburger().click();
            homeScreen.BuyHealthInsurance().click();
            homeScreen.ArogyaSupreme().click();
            homeScreen.next().click();
            homeScreen.next().click();
            homeScreen.OKGotIt().click();
            homeScreen.GetQuote().click();
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 3)
    public void personalDetails(){
        personalDetails = new PersonalDetails(appiumDriver);
        try {
            personalDetails.MobileNumber().sendKeys("9876543210");
            personalDetails.EmailId().sendKeys("a@gmail.com");
            personalDetails.Next().click();
            Thread.sleep(3000);
            personalDetails.PinCode().sendKeys("11000");
            Thread.sleep(3000);
            personalDetails.SelectPincode().click();
            personalDetails.Next().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 4)
    public void arogyaSupreme(){
        arogyaSupreme = new ArogyaSupreme(appiumDriver);
        try {
            arogyaSupreme.Compare().click();
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(50);"));
            arogyaSupreme.SelectPlan().click();
            arogyaSupreme.PolicyType().click();
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 5)
    public void insuredDetails() {
        insuredDetails = new InsuredDetails(appiumDriver);
        try {
            insuredDetails.Self().click();
            insuredDetails.IDGender().click();
            insuredDetails.IDAge().click();
            insuredDetails.SelectIDAge().click();
            insuredDetails.IDNext().click();
            insuredDetails.SumInsuredAmount().click();
            insuredDetails.IDNext().click();
            insuredDetails.CoveragePackage().click();
            insuredDetails.CoveragePeriod().click();
            insuredDetails.ReviewQuote().click();
            insuredDetails.IDNext().click();
            insuredDetails.Unmarried().click();
            insuredDetails.IDFirstName().click();
            Thread.sleep(2000);
            insuredDetails.IDFirstName().sendKeys("Annu");
            Thread.sleep(2000);
            insuredDetails.IDLastName().click();
            Thread.sleep(2000);
            insuredDetails.IDLastName().sendKeys("Shaw");
            Thread.sleep(2000);
            insuredDetails.IDDOB().click();
            insuredDetails.IDConfirm().click();
            insuredDetails.IDSaveDetails().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 6)
    public void healthQuestionare(){
        healthQuestionare = new HealthQuestionare(appiumDriver);
        try {
            healthQuestionare.AnyOtherPolicy().click();
            healthQuestionare.Next().click();
            Thread.sleep(3000);
            healthQuestionare.No1().click();
            healthQuestionare.No2().click();
            healthQuestionare.No3().click();
            healthQuestionare.No4().click();
            healthQuestionare.No5().click();
            healthQuestionare.Next().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 7)
    public void proposerDetails(){
        proposerDetails = new ProposerDetails(appiumDriver);
        try {
            Thread.sleep(2000);
            proposerDetails.PanNumber().click();
            Thread.sleep(2000);
            appiumDriver.navigate().back();
            proposerDetails.PanNumber().sendKeys("ABCDE1234F");
            Thread.sleep(2000);
            appiumDriver.navigate().back();
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            proposerDetails.Occupation().click();
            proposerDetails.SelectOccupation().click();
            Thread.sleep(2000);
            appiumDriver.navigate().back();
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(15);"));
            Thread.sleep(4000);
            proposerDetails.PDNext().click();
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 8)
    public void pdAddressPage(){
        pdAddressPage = new PDAddressPage(appiumDriver);

        try {
            Thread.sleep(30000);
            appiumDriver.navigate().back();
            pdAddressPage.SelectArea().click();
            pdAddressPage.BengaliMarket().click();
            pdAddressPage.PlotNumber().click();
            Thread.sleep(2000);
            pdAddressPage.PlotNumber().sendKeys("121");
            pdAddressPage.BuildingApartmentName().click();
            Thread.sleep(2000);
            pdAddressPage.BuildingApartmentName().sendKeys("abcd");
            Thread.sleep(2000);
            appiumDriver.navigate().back();
            pdAddressPage.StreetName().click();
            Thread.sleep(2000);
            pdAddressPage.StreetName().sendKeys("tysm");
            Thread.sleep(4000);
            appiumDriver.navigate().back();
            pdAddressPage.PDANext().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 9)
    public void nomineeDetails(){
        nomineeDetails = new NomineeDetails(appiumDriver);

        try {
            nomineeDetails.NDGender().click();
            Thread.sleep(2000);
            nomineeDetails.NDFirstName().click();
            Thread.sleep(2000);
            nomineeDetails.NDFirstName().sendKeys("Hello");
            nomineeDetails.NDLastName().click();
            Thread.sleep(2000);
            nomineeDetails.NDLastName().sendKeys("World");
            appiumDriver.navigate().back();
            nomineeDetails.NomineeRelation().click();
            nomineeDetails.Mother().click();
            Thread.sleep(4000);
            appiumDriver.navigate().back();
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            nomineeDetails.NDOB().click();
            nomineeDetails.SelectYear().click();
//            appiumDriver.findElement(
//                    AppiumBy.androidUIAutomator(
//                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToBeginning(25);"));
            Thread.sleep(5000);
            nomineeDetails.Year().click();
            nomineeDetails.Confirm().click();
            nomineeDetails.NDNext().click();
            nomineeDetails.EIANumber().click();
            nomineeDetails.EIANumber1().click();
            nomineeDetails.NDNext().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority=10)
    public void policySummary(){
        policySummary = new PolicySummary(appiumDriver);
        try {
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(20);"));
            Thread.sleep(2000);
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            policySummary.Done().click();
            policySummary.ProceedWithKYC().click();
        } catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 11)
    public void submitYourDetails(){
        submitYourDetails = new SubmitYourDetails(appiumDriver);
        try {
            submitYourDetails.Upload().click();
            submitYourDetails.FileManger().click();
            Thread.sleep(25000);
            submitYourDetails.SelectPhoto().click();
            Thread.sleep(25000);
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            submitYourDetails.Proceed().click();
            Thread.sleep(10000);
            submitYourDetails.IDProof().click();
            submitYourDetails.Passport().click();
            submitYourDetails.PassportNumber().click();
            submitYourDetails.PassportNumber().sendKeys("N1234567");
            Thread.sleep(2000);
            appiumDriver.navigate().back();
            submitYourDetails.Upload().click();
            submitYourDetails.FileManger().click();
            Thread.sleep(25000);
            submitYourDetails.SelectPhoto().click();
            Thread.sleep(25000);
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            submitYourDetails.AddFiles().click();
            submitYourDetails.FileManger().click();
            Thread.sleep(25000);
            submitYourDetails.SelectPhoto().click();
            Thread.sleep(25000);
            submitYourDetails.Proceed().click();
            appiumDriver.findElement(
                    AppiumBy.androidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
            submitYourDetails.Submit().click();
            submitYourDetails.Next().click();
            submitYourDetails.VerifyOtp().click();
        }catch (Exception e){
            System.out.println("Cause is: "+ e.getCause());
            System.out.println("Message is : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}


