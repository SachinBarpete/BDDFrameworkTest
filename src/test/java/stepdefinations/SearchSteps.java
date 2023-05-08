package stepdefinations;

import implimentation.Product;
import implimentation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class SearchSteps {

    Product product;
    Search search;
    @Given("I have a search filed on Amazon page")
    public void i_have_a_search_filed_on_amazon_page() {
        System.out.println("Step1: I m on search pae");
    }

    @When("I search for a product {string} and price {int}")
    public void i_search_for_a_product_and_price(String productName, Integer price) {
        System.out.println("Step2: Search the product with name: " + productName + " & price: " + price);

        product = new Product(productName, price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("Step3: Product " + productName + " is displayed");
        search = new Search();
        String pName = search.displayProduct(product);
        System.out.println("Searched product is: "+pName);
        Assertions.assertArrayEquals(new String[]{product.getProductName()}, new String[]{pName});
    }
}
