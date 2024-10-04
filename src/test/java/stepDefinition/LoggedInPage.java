package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.LoggedInPage.*;

public class LoggedInPage {


    @Then("User should be able to view the product category page")
    public void user_should_view_produt_category_page() {

        visible_productCategory_formalShoe();
        visible_productCategory_sportShoe();
        visible_productCategory_sneakerShoe();
    }
}
