import Pages.CloneCarPage;
import io.qameta.allure.Feature;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Tests {

      CloneCarPage cloneCar = new CloneCarPage();

    @BeforeMethod
    @Parameters({"URL"})
    public void startBrowser(String URL){
        cloneCar.openPage(URL);
    }

    @AfterMethod
    public void closeBrowser(){
        closeWebDriver();
    }

    @Feature("Car cloning")
    @Parameters({"vehicleName","vehicleModelBMW", "vehicleYear", "color"})
    @Test(description = "Test case 1")
    public void test1(String vehicleName, String vehicleModelBMW, String vehicleYear, String color){
    cloneCar.enterName(vehicleName)
            .enterModel(vehicleModelBMW)
            .enterYear(vehicleYear)
            .chooseColor(color)
            .submit()
            .assertNameIsCloned(vehicleName)
            .assertModelIsCloned(vehicleModelBMW)
            .assertYearIsCloned(vehicleYear)
            .assertNewColor(color);
    }

    @Feature("Car cloning with model change")
    @Parameters({"vehicleName","vehicleModelBMW", "vehicleYear", "color", "vehicleModelMazda"})
    @Test(description = "Test case 2")
    public void test2(String vehicleName, String vehicleModelBMW, String vehicleYear, String color, String vehicleModelMazda) {
    cloneCar.enterName(vehicleName)
            .enterModel(vehicleModelBMW)
            .enterModel(vehicleModelMazda)
            .enterYear(vehicleYear)
            .chooseColor(color)
            .submit()
            .assertNameIsCloned(vehicleName)
            .assertModelIsCloned(vehicleModelMazda)
            .assertYearIsCloned(vehicleYear)
            .assertNewColor(color);
    }

}
