package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class ClickButtonDescargaTasks implements Task {

    public static ClickButtonDescargaTasks clickButtonDownload() {
        return Tasks.instrumented(ClickButtonDescargaTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CLICK_BUTTON_DOCUMENTO));
        actor.attemptsTo(Click.on(CLICK_BUTTON_DOCUMENTO).afterWaitingUntilEnabled());
        actor.attemptsTo(Click.on(CLICK_BUTTON_DESCARGA_PDF).afterWaitingUntilEnabled());
    }

}
