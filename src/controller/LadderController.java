package controller;

import controller.service.LadderService;
import model.LadderModel;
import view.messages.Message;
import view.messages.Restriction;
import view.screen.LadderScreen;

public class LadderController {
    LadderService service = new LadderService();
    LadderScreen screen = new LadderScreen();
    Restriction restriction = new Restriction();

    public LadderController(String n){
        int value = service.ValueConvert(n);
        String result = restriction.RestrictionLadder(value);
        if(result.equals(Message.SUCCESS.getMessage()) ) {
            LadderModel ladder = new LadderModel(value);
            ladder.setResult(service.Matrix(ladder.getN()));
            screen.Result(ladder);
        }
    }
}