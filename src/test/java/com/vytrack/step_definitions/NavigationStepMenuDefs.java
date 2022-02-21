package com.vytrack.step_definitions;

import io.cucumber.java.en.*;

public class NavigationStepMenuDefs {
    @When("The user navigates to Fleet,Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
//selenium kodları yazılır
        System.out.println("The user navigates to Fleet,Vehicles");
    }

    @Then("The title contains Car")
    public void the_title_contains_Car() {
        System.out.println("The title contains Car");
    }

    @When("The user navigates to Marketing,Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("The user navigates to Marketing,Campaigns");
    }

    @Then("The title contains Campaigns")
    public void the_title_contains_Campaigns() {
        System.out.println("The title contains Campaigns");
    }

    @When("The user navigates to Activities,Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("The user navigates to Activities,Calendar Events");
    }

    @Then("The title contains Calendar Events")
    public void the_title_contains_Calendar_Events() {
        System.out.println("The title contains Calendar Events");
    }

}
