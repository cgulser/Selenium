package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {

    public static void main(String[] args) {

        /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //1- https://www.amazon.com url'ine gidin
        driver.get("htpps://www.amazon.com");

        //2- Basligin Amazon kelimesi icerdigini test edin
        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("title testi PASSED");
        }else {
            System.out.println("test Failed");
        }
        //3- Url'in "https://www.amazon.com" a esit oldugunu test edin


        //4- sayfayi kapatin

    }
}
