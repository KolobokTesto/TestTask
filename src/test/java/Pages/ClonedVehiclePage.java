package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ClonedVehiclePage {
    SelenideElement clonedVehicleName = $("#model2 > p > input.js-name"),
                    clonedVehicleModel = $("#model2 > p > select.js-model"),
                    clonedVehicleYear = $("#model2 > p > input.js-year"),
                    clonedVehicleColor = $("#model2 > p > input.js-color");

    @Step("Open webpage")
    public static void openPage(String URL) {
        open(URL);
    }


    @Step("Assert that vehicle name is cloned")
    public ClonedVehiclePage assertNameIsCloned(String clonedName){
        clonedVehicleName.shouldHave(value(clonedName));
        return this;
    }

    @Step("Assert that model is cloned")
    public ClonedVehiclePage assertModelIsCloned(String clonedModel){
        clonedVehicleModel.shouldHave(value(clonedModel));
        return this;
    }

    @Step("Assert that year is cloned")
    public ClonedVehiclePage assertYearIsCloned(String clonedYear){
        clonedVehicleYear.shouldHave(value(clonedYear));
        return  this;
    }

    @Step("Assert that new color is correct")
    public void assertNewColor(String color){
        clonedVehicleColor.shouldHave(value(color));
    }

}