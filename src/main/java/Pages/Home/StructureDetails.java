package Pages.Home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import qa.BaseTest;
import utils.TestUtils;

public class StructureDetails extends BaseTest {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='CARPET AREA (SQ.FT)']")
    private MobileElement CarpetAreaByXpath;
    @AndroidFindBy(accessibility = "YEAR OF CONSTRUCTION\n" + "Year of Construction")
    private MobileElement YearofConstructionsById;
    @AndroidFindBy(accessibility = "2020")
    private MobileElement SelectYearofConstructionsById;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='0']")
    private MobileElement MultiStoreyByXpath;
    @AndroidFindBy(accessibility = "CALCULATE")
    private MobileElement CalculateById;
    @AndroidFindBy(accessibility = "DONE")
    private MobileElement DoneById;
    @AndroidFindBy(accessibility = "NEXT")
    private MobileElement NextById;
    public StructureDetails CarpetArea() throws InterruptedException {
        click(CarpetAreaByXpath);
        Thread.sleep(2000);
        sendKeys(CarpetAreaByXpath, "400");
        Thread.sleep(2000);
        return this;
    }
    public StructureDetails YearofConstruction(){
        click(YearofConstructionsById);
        return this;
    }
    public StructureDetails SelectYearofConstructions(){
        click(SelectYearofConstructionsById);
        return this;
    }
    public StructureDetails Multistorey(){
        click(MultiStoreyByXpath);
        back();
        return this;
    }
    public StructureDetails Calculate(){
//        scrollToEnd();
        click(CalculateById);
        return this;
    }
    public StructureDetails Done(){
        click(DoneById);
        back();
        return this;
    }
    public StructureDetails Next() throws InterruptedException {
        click(NextById);
        Thread.sleep(2000);
        return this;
    }
}
