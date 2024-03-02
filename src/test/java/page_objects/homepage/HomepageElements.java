package page_objects.homepage;

import org.openqa.selenium.By;

public class HomepageElements {

    static By searchField = By.xpath("//input[@id='search_input']");
    static By searchBtn = By.xpath("//button[@title='Search']");
    static By suggestionsContainer = By.xpath("//div[@class='snize-ac-results-columns']");
    static By productsFoundNumber = By.xpath("//span[@id='products_search_total_found_515']");
    static By productsFound = By.xpath("//div[@id='products_search_pagination_contents']");
    static By noProductsFoundMsg = By.xpath("//*[@class='ty-no-items']");
    static By firstProduct = By.xpath("//div[@data-ut2-load-more='first-item']");
    static By addToCartBtn = By.xpath("//*[text()='Add to cart']");
    static By checkoutBtn = By.xpath("//*[@class='ty-btn ty-btn__primary cm-notification-close ']");
    static By cartBtn = By.xpath("//*[@id='cart_status_4700']");
    static By emptyCartMsg = By.xpath("//*[@class='ty-cart-items__empty ty-center']");
}
