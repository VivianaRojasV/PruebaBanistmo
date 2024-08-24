package com.Banistmo.automation.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.Banistmo.automation.userinterfaces.HomePageUI.*;

@AllArgsConstructor
public class ClickButtonPersonasTasks implements Task {

    public static ClickButtonPersonasTasks clickButtonAprender() {
        return Tasks.instrumented(ClickButtonPersonasTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_BUTTON_PERSONAS).afterWaitingUntilEnabled());
    }

}
