package com.Banistmo.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    public static final Target CLICK_BUTTON_PERSONAS = Target.the("Boton de Personas")
            .located(By.id("header-personas"));
    public static final Target CLICK_BUTTON_PRODUCTOS = Target.the("Boton Productos")
            .located(By.id("menu-productos"));
    public static final Target CLICK_BUTTON_INVERSIONES = Target.the("Boton de Inversionas")
            .located(By.id("header-productos-inversiones"));

    public static final Target CLICK_BUTTON_INVERSION_VIRTUAL = Target.the("Boton de Inversion Virtual")
            .located(By.linkText("Inversión Virtual"));

    public static final Target CLICK_BUTTON_DOCUMENTO = Target.the("Boton de Documento")
            .located(By.xpath("//a[contains(text(),'Documentos')]"));
    public static final Target CLICK_BUTTON_DESCARGA_PDF = Target.the("Boton de Dercarga PDF")
            .located(By.linkText("Reglamento Inversión Virtual Bancolombia"));

}