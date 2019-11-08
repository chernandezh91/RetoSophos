package co.com.test.vivanda.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target AREA_SEARCH = Target.the("Area Producto a comprar").located(By.xpath("//input[@placeholder='Buscar productos o categorías']"));
    public static final Target SCROLL_SECTION_PRODUCT = Target.the("Scroll area de Productos").located(By.xpath("//section[@class='container list-products']"));
    public static final Target PRODUCT = Target.the("Producto a comprar").located(By.xpath("//main[@id='content']//ul[1]//li[1]//div[1]//div[1]//div[1]//figure[1]"));
    public static final Target ADD_CART = Target.the("Agregar al carrito").located(By.xpath("//a[@class='buy-button buy-button-ref']"));
    public static final Target STORE = Target.the("Campo de validacion").located(By.xpath("//span[contains(text(),'Recojo en Tienda')]"));
    public static final Target PROVINCE = Target.the("Campo de validacion").located(By.xpath("//li[1]//label[1]//span[1]"));
    public static final Target NEXT = Target.the("Campo de validacion").located(By.xpath("//div[@class='SalesChannel__buttonWrapper']//button[@class='SalesChannel__preButton'][contains(text(),'CONTINUAR')]"));
}