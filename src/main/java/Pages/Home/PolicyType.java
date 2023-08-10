package Pages.Home;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class PolicyType extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "Landlord\n" + "Owner who has rented his home to a tenant.")
    private MobileElement CustomerTypeById;
    @AndroidFindBy(accessibility = "Individual")
    private MobileElement CustomerCategoryById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    @AndroidFindBy(accessibility = "Structure\n" + "This covers building of pucca construction")
    private MobileElement CoverTypeById;
    @AndroidFindBy(accessibility = "SECURE STRUCTURE ONLY")
    private MobileElement StuctureOnlyById;
    public MobileElement scrollToo()
    {
//        ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Individual\").instance(0))").click();


        ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                + "new UiSelector().description(\"Individual\"));");
        //getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
        return null;
    }
    public MobileElement scroll(){
        return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(50);");
    }
    public PolicyType CustomerType(){
        click(CustomerTypeById);
        return this;
    }
    public PolicyType CustomerCategory() throws InterruptedException {
//        scrollToEndd();
        scroll();
        Thread.sleep(2000);
        click(CustomerCategoryById);
        return this;
    }
    public PolicyType Next(){
        click(NextById);
        return this;
    }
    public PolicyType CoverType(){
        click(CoverTypeById);
        return this;
    }
    public PolicyType StructureOnly(){
        click(StuctureOnlyById);
        return this;
    }
}
