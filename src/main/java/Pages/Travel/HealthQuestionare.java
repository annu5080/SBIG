package Pages.Travel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class HealthQuestionare extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    TestUtils utils = new TestUtils();
    @AndroidFindBy(accessibility = "YES")
    private MobileElement GoodHealthById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public HealthQuestionare GoodHealth(){
        click(GoodHealthById);
        return this;
    }
    public HealthQuestionare Next(){
        click(NextById);
        return this;
    }
}
