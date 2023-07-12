package Pages.HealthEdge;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HealthQuestionare extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    AndroidDriver driver;
    @AndroidFindBy(accessibility = "NO")
    private MobileElement HealthQuestionareById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public HealthQuestionare HealthQuestionare1(){
        click(HealthQuestionareById);
        return this;
    }
    public HealthQuestionare Next(){
        click(NextById);
        return this;
    }
}
