import Pages.VehicleDataPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest extends VehicleDataPage {

    @BeforeMethod
    @Parameters({"URL"})
    public void startBrowser(String URL){
        openPage(URL);
    }

    @AfterMethod
    public void closeBrowser(){
        closeWebDriver();
    }
}
