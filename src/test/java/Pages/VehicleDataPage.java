package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class VehicleDataPage {
    SelenideElement vehicleNameInput = $("#model1 > p > input.js-name"),
                    vehicleModelSelect = $("#model1 > p > select.js-model"),
                    vehicleYearInput = $("#model1 > p > input.js-year"),
                    newColorSelect = $("#vehColor"),
                    cloneVehicleSubmitButton = $("#cloneVehicle");

    @Step("Open webpage")
    public static void openPage(String URL) {
        open(URL);
    }

    @Step("Enter vehicle Name")
    public VehicleDataPage enterName(String name) {
        vehicleNameInput.setValue(name).pressEnter();
        return this;
    }

    @Step("Choose vehicle model from select element")
    public VehicleDataPage enterModel(String model){
        vehicleModelSelect.selectOptionByValue(model);
        return this;
    }

    @Step("Enter vehicle year")
    public VehicleDataPage enterYear(String year){
        vehicleYearInput.setValue(year);
        return this;
    }

    @Step("Choose future color")
    public VehicleDataPage chooseColor(String color){
        newColorSelect.selectOptionByValue(color);
        return this;
    }

    @Step("Click submit button")
    public VehicleDataPage submit(){
        cloneVehicleSubmitButton.click();
        return this;
    }

}