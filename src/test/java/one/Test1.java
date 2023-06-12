package one;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Test1 {
    private static final String  PAGE_URL = "https://www.lamoda.ru/men-home/";
    private static final String  PAGE_URL2 = "https://www.ozon.ru/";
    //@ExecutionMode.SAME_THREAD
    @Test
    public void test1(){
        open("https://www.lamoda.ru/men-home/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        webdriver().shouldHave(url(PAGE_URL));

    }

    @Test
    public void test2(){
        open("https://www.ozon.ru/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        webdriver().shouldHave(url(PAGE_URL2));

    }

}
