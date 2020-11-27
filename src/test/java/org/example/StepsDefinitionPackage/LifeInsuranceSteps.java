package org.example.StepsDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.LifeInsurance;

public class LifeInsuranceSteps {
    LifeInsurance lifeInsurance = new LifeInsurance();

    @Given("^user is on www\\.comparethemarket\\.com/life-insurance/$")
    public void user_is_on_www_comparethemarket_com_life_insurance() throws Throwable {
        //lifeInsurance.currentURLAssertion();
        //lifeInsurance.cookieMethod();
    }

    @When("^user clicks on Get a quote$")
    public void user_clicks_on_Get_a_quote() throws Throwable {
        //lifeInsurance.getAQuoteMethod();
        lifeInsurance.lifeInsuranceHeader();            //assertion for relevant page header
    }

    @When("^user clicks on Just myself for single quote$")
    public void user_clicks_on_Just_myself_for_single_quote() throws Throwable {
        lifeInsurance.singleQuoteMethod();
    }

    @When("^user selects relevant title$")
    public void user_selects_relevant_title() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.titleMethod();
    }

    @When("^user provides first name$")
    public void user_provides_first_name() throws Throwable {
        lifeInsurance.firstNameMethod();
    }

    @When("^user provides surname$")
    public void user_provides_surname() throws Throwable {
        lifeInsurance.lastNameMethod();
    }

    @When("^user selects the date of birth$")
    public void user_selects_the_date_of_birth() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.dateOfBirthMethod();
    }

    @When("^user selects relevant smoking option$")
    public void user_selects_relevant_smoking_option() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.smokingMethod();
    }

    @When("^user selects relevant cover type$")
    public void user_selects_relevant_cover_type() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.coverTypeMethod();
    }

    @When("^user provides duration of cover$")
    public void user_provides_duration_of_cover() throws Throwable {
        lifeInsurance.coverTermMethod();
    }

    @When("^user provides the amount of required cover$")
    public void user_provides_the_amount_of_required_cover() throws Throwable {
        lifeInsurance.coverAmountMethod();
    }

    @When("^user clicks on critical illness cover$")
    public void user_clicks_on_critical_illness_cover() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.criticalIllnessMethod();
    }

    @When("^user clicks on Additional critical illness cover$")
    public void user_clicks_on_Additional_critical_illness_cover() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.criticalIllnessTypeMethod();
    }

    @When("^user provides the amount of additional critical illness cover$")
    public void user_provides_the_amount_of_additional_critical_illness_cover() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.additionalAmountMethod();
    }

    @When("^user provides email address$")
    public void user_provides_email_address() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.emailMethod();
    }

    @When("^user provides phone number$")
    public void user_provides_phone_number() throws Throwable {
        lifeInsurance.scrollPageMethod();
        lifeInsurance.phoneNumberMethod();
    }

    @When("^user provides house number$")
    public void user_provides_house_number() throws Throwable {
        lifeInsurance.houseNumberMethod();
    }

    @When("^user provides postcode$")
    public void user_provides_postcode() throws Throwable {
        lifeInsurance.postcodeMethod();
    }

    @When("^user clicks on Find address$")
    public void user_clicks_on_Find_address() throws Throwable {
        lifeInsurance.findAddressMethod();
    }

    @When("^user selects on preferred contact$")
    public void user_selects_on_preferred_contact() throws Throwable {
        lifeInsurance.contactPreferenceMethod();
    }

    @When("^user clicks on confirm$")
    public void user_clicks_on_confirm() throws Throwable {
        lifeInsurance.confirmMethod();
    }

    @When("^user clicks on Get your quotes$")
    public void user_clicks_on_Get_your_quotes() throws Throwable {
        lifeInsurance.findAQuoteMethod();
    }

    @When("^user should be able to see all quotations$")
    public void user_should_be_able_to_see_all_quotations() throws Throwable {
        lifeInsurance.screenshotWithCritical();
    }

    @When("^user clicks on remove critical illness cover$")
    public void user_clicks_on_remove_critical_illness_cover() throws Throwable {
        lifeInsurance.removeCriticalMethod();
    }

    @When("^user clicks on update result$")
    public void user_clicks_on_update_result() throws Throwable {
        lifeInsurance.updateResultMethod();
    }

    @Then("^user should be able to see updated quotation$")
    public void user_should_be_able_to_see_updated_quotation() throws Throwable {
        lifeInsurance.screenshotWithoutCritical();
    }
}
