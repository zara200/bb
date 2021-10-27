package Modules;

import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Process extends Base {

    Elements e= new Elements();

    @Test (priority = 1)
    public void Sell_item() throws InterruptedException{

        Thread.sleep(1500);
        WebElement sell_item= driver.findElement(By.xpath(e.sell_item));
        sell_item.click();
    }


    @Test (priority = 2)
    public void Select_Mobile_Category() throws InterruptedException{

        Thread.sleep(1500);
        WebElement Mobile= driver.findElement(By.xpath(e.Mobile));
        Mobile.click();
    }


    @Test(priority = 3)
    public void select_brand() throws InterruptedException{

        Thread.sleep(1500);
        WebElement brand= driver.findElement(By.xpath(e.brand));
        brand.click();

        Thread.sleep(1500);
        Select select_brand=new Select(driver.findElement(By.xpath(e.brand)));
        select_brand.selectByIndex(2);
    }

   @Test (priority = 4)
    public void select_device() throws InterruptedException{

        Thread.sleep(1500);
        WebElement device= driver.findElement(By.xpath(e.device));
        device.click();

        Thread.sleep(1500);
        Select select_device=new Select(driver.findElement(By.xpath(e.device)));
        select_device.selectByIndex(5);

        WebElement grades= driver.findElement(By.xpath(e.grades));
        grades.click();
    }


    @Test (priority = 5)
    public void Sign_in() throws InterruptedException{

        Thread.sleep(3000);
        WebElement sign_in= driver.findElement(By.xpath(e.sign_in));
        sign_in.click();

        Thread.sleep(1500);
        WebElement email= driver.findElement(By.xpath(e.email));
        email.click();
        email.sendKeys("demo12@cartlow.com");

        Thread.sleep(1500);
        WebElement password= driver.findElement(By.xpath(e.password));
        password.click();
        password.sendKeys("demo101");

        Thread.sleep(1500);
        WebElement sign_in_button=driver.findElement(By.xpath(e.sign_in_button));
        sign_in_button.click();
    }

    @Test (priority = 6)
    public void address() throws InterruptedException{

        Thread.sleep(4000);
        WebElement proceed_to_pickup= driver.findElement(By.xpath(e.proceed_to_pickup));
        proceed_to_pickup.click();

        Thread.sleep(1500);
        WebElement select_address=driver.findElement(By.xpath(e.select_address));
        select_address.click();
    }


    @Test (priority = 7)
    public void cancel_order() throws InterruptedException {

        Thread.sleep(1500);
        WebElement cancel_order= driver.findElement(By.xpath(e.cancel_order));
        cancel_order.click();
    }
}
