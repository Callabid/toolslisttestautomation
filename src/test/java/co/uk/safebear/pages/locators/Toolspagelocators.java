package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class Toolspagelocators {

    private By successfulLoginMessage = By.xpath(".//body/div[@class ='container']/p/b");

    //  private By searchbuttonLocator

    private By testCafeToollocator = By.xpath(".='Tescafe'");


}
