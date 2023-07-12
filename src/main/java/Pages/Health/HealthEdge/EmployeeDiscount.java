package Pages.Health.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class EmployeeDiscount extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    AndroidDriver driver;
    @AndroidFindBy(accessibility = "No")
    private MobileElement NoById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public EmployeeDiscount No(){
        click(NoById);
        return this;
    }
    public EmployeeDiscount Next(){
        click(NextById);
        return this;
    }
}
