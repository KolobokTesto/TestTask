import Pages.VehicleDataPage;
import Pages.ClonedVehiclePage;
import io.qameta.allure.Feature;
import org.testng.annotations.*;

public class Tests extends BaseTest {

      VehicleDataPage vehicleData = new VehicleDataPage();
      ClonedVehiclePage clonedVehicle = new ClonedVehiclePage();

    @Feature("Car cloning")
    @Parameters({"vehicleName","vehicleModelBMW", "vehicleYear", "color"})
    @Test(description = "Test case 1")
    public void test1(String vehicleName, String vehicleModelBMW, String vehicleYear, String color){
    vehicleData.enterName(vehicleName)
            .enterModel(vehicleModelBMW)
            .enterYear(vehicleYear)
            .chooseColor(color)
            .submit();
    clonedVehicle.assertNameIsCloned(vehicleName)
            .assertModelIsCloned(vehicleModelBMW)
            .assertYearIsCloned(vehicleYear)
            .assertNewColor(color);
    }

    @Feature("Car cloning with model change")
    @Parameters({"vehicleName","vehicleModelBMW", "vehicleYear", "color", "vehicleModelMazda"})
    @Test(description = "Test case 2")
    public void test2(String vehicleName, String vehicleModelBMW, String vehicleYear, String color, String vehicleModelMazda) {
    vehicleData.enterName(vehicleName)
            .enterModel(vehicleModelBMW)
            .enterModel(vehicleModelMazda)
            .enterYear(vehicleYear)
            .chooseColor(color)
            .submit();
    clonedVehicle.assertNameIsCloned(vehicleName)
            .assertModelIsCloned(vehicleModelMazda)
            .assertYearIsCloned(vehicleYear)
            .assertNewColor(color);
    }

}
