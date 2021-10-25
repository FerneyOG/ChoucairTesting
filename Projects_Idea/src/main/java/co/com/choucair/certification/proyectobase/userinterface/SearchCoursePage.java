package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("select choucair university").located(By.xpath(
            "//div[@id='University']//strong"));

    public static final Target INPUT_COURSE = Target.the("look for the course").located(By.id(
            "curseserachbox"));

    public static final Target BUTTON_GO = Target.the("clip search the course").located(By.id(
            "//button[@class='btn btn-secondary']"));

    public static final  Target SELECT_COURSE = Target.the("clip search the course").located(By.xpath(
            "//h4[contains(text(),'Bancolombia automation resource')]"));

    public static  final  Target NAME_COURSE = Target.the("extract the course number").located(By.xpath(
            "//h1[contains(text(),'Bancolombia automation resource')]"));
}
