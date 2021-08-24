package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class CloneCarPage {
    SelenideElement vehicleNameInput = $("#model1 > p > input.js-name"),
                    vehicleModelSelect = $("#model1 > p > select.js-model"),
                    vehicleYearInput = $("#model1 > p > input.js-year"),
                    newColorSelect = $("#vehColor"),
                    cloneVehicleSubmitButton = $("#cloneVehicle"),
                    clonedVehicleName = $("#model2 > p > input.js-name"),
                    clonedVehicleModel = $("#model2 > p > select.js-model"),
                    clonedVehicleYear = $("#model2 > p > input.js-year"),
                    clonedVehicleColor = $("#model2 > p > input.js-color");

    @Step("Open webpage")
    public static void openPage(String URL) {
        open(URL);
    }

    @Step("Enter vehicle Name")
    public CloneCarPage enterName(String name) {
        vehicleNameInput.setValue(name).pressEnter();
        return this;
    }

    @Step("Choose vehicle model from select element")
    public CloneCarPage enterModel(String model){
        vehicleModelSelect.selectOptionByValue(model);
        return this;
    }

    @Step("Enter vehicle year")
    public CloneCarPage enterYear(String year){
        vehicleYearInput.setValue(year);
        return this;
    }

    @Step("Choose future color")
    public CloneCarPage chooseColor(String color){
        newColorSelect.selectOptionByValue(color);
        return this;
    }

    @Step("Assert that vehicle name is cloned")
    public CloneCarPage assertNameIsCloned(String clonedName){
        clonedVehicleName.shouldHave(value(clonedName));
        return this;
    }

    @Step("Assert that model is cloned")
    public CloneCarPage assertModelIsCloned(String clonedModel){
        clonedVehicleModel.shouldHave(value(clonedModel));
        return this;
    }

    @Step("Assert that year is cloned")
    public CloneCarPage assertYearIsCloned(String clonedYear){
        clonedVehicleYear.shouldHave(value(clonedYear));
        return  this;
    }

    @Step("Assert that new color is correct")
    public CloneCarPage assertNewColor(String color){
        clonedVehicleColor.shouldHave(value(color));
        return this;
    }

    @Step("Click submit button")
    public CloneCarPage submit(){
        cloneVehicleSubmitButton.click();
        return this;
    }
}