package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ContactsStepDefs {
    @When("The user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule(tab,module);
        BrowserUtils.waitFor(5);
    }

    @Then("Default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNum) {

        ContactsPage contactsPage=new ContactsPage();
        System.out.println(contactsPage.pageNumber.getAttribute("value"));
        Integer actualNum=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedNum,actualNum);
    }

    @Given("The user logged in as a {string}")
    public void theUserLoggedInAsA(String userType) {
        LoginPage loginPage=new LoginPage();
        Driver.get().get(ConfigurationReader.get("url"));
        String username="";
        String password="";
        if(userType.toLowerCase(Locale.ROOT).equals("driver")){
            loginPage.loginAsDriver();
            //username=ConfigurationReader.get("driver_username");
            //password = ConfigurationReader.get("driver_password");
        }else if(userType.equals("sales manager")){
            loginPage.loginAsSalesmanager();
            // username = ConfigurationReader.get("salesmanager_username");
            // password = ConfigurationReader.get("salesmanager_password");
        }else if(userType.equals("store manager")){
            loginPage.loginAsStoreManager();
            //username = ConfigurationReader.get("storemanager_username");
            //password = ConfigurationReader.get("storemanager_password");
        }

    }
    @Then("The user should see following options")
    public void the_user_should_see_following_options( List<String> menuOptions ) {

        System.out.println("menuOptions.size() = " + menuOptions.size());
        System.out.println("menuOptions= " + menuOptions);
        BrowserUtils.waitFor(4);

        List<String> actualMenu=new ArrayList<>();

        List<WebElement> drivermenuOptions = new ContactInfoPage().drivermenuOptions;
        for (WebElement drivermenuOption : drivermenuOptions) {

            actualMenu.add(drivermenuOption.getText());
       }
        System.out.println("actualMenu = " + actualMenu);

        /*List<String> actualMenu = BrowserUtils.getElementsText(new ContactsPage().menuOptions);
        //BrowserUtilsten getElementstext, BasePage den menuOptions metodları aldık
        System.out.println("actualMenu = " + actualMenu);*/

        Assert.assertEquals(menuOptions,actualMenu);
    }
    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String>userInfo) {
      new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
        System.out.println("userInfo = " + userInfo);

        String actualName = new ContactInfoPage().getUserName();
        String expectedName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        Assert.assertEquals(expectedName,actualName);

    }


}
