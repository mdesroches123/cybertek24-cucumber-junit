package com.cybertek.steps_definitions;

import com.cybertek.pages.CloudTablesPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import javafx.scene.paint.Stop;
import org.junit.Assert;

public class CloudTablesStepDefs {

    CloudTablesPage cloudTablesPage = new CloudTablesPage();

    @Given("User is on cloudtables homepage")
    public void user_is_on_cloudtables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        Assert.assertEquals("Editor | Editing for DataTables", Driver.getDriver().getTitle());

    }

    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        cloudTablesPage.newBtn.click();

    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstname) {
        cloudTablesPage.firstNameField.sendKeys(firstname);

    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastname) {
        cloudTablesPage.lastNameField.sendKeys(lastname);

    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        cloudTablesPage.positionField.sendKeys(position);

    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        cloudTablesPage.salaryField.sendKeys(salary);

    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        cloudTablesPage.createBtn.click();


    }

}
