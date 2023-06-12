package two;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class Test4 {
    private static final String  PAGE_URL = "https://www.lamoda.ru/men-home/";
    @Test
    public void test1(){
        open("https://www.lamoda.ru/men-home/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        webdriver().shouldHave(url(PAGE_URL));

    }
}
