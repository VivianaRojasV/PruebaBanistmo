package com.Banistmo.automation.tasks;

import com.Banistmo.automation.interactions.Cambio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.Banistmo.automation.userinterfaces.HomePageUI.CLICK_BUTTON_INVERSION_VIRTUAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ClickButtonInversionVirtualTasks implements Task {

    public static ClickButtonInversionVirtualTasks clickButtonInversionVirtual() {
        return Tasks.instrumented(ClickButtonInversionVirtualTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_BUTTON_INVERSION_VIRTUAL).afterWaitingUntilEnabled());
        theActorInTheSpotlight().attemptsTo(Cambio.aLaPestana(2));
    }
}
