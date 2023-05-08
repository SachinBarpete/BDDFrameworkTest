package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
    @Given("User wants to select a car type {string} from uber app")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        System.out.println("Step1: User wants to select a car type: " + carType);
    }

    @When("user select car {string} and pickup point {string} and drop location {string}")
    public void user_select_car_and_pickup_point_and_drop_location(String carType, String pickupLocation, String dropLocation) {

        System.out.println("Step2: User opt for: " + carType + " pickup location: " + pickupLocation + " and drop location: " + dropLocation);
    }

    @Then("Driver starts the jouney")
    public void driver_starts_the_jouney() {
        System.out.println("Step3: journey started");
    }

    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.println("Ste4: Journey ended");
    }

    @Then("User pays {int} INR")
    public void user_pays_inr(Integer amount) {
        System.out.println("Step5: Amount to be paid: " + amount);

    }
}
