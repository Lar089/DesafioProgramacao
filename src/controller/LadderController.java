package controller;

import controller.service.LadderService;
import model.LadderModel;
import view.messages.Message;
import view.messages.Restriction;
import view.screen.LadderScreen;

public class LadderController {
    LadderService service = new LadderService();
    Restriction restriction = new Restriction();
    LadderScreen screen = new LadderScreen();

    public LadderController(String n){
        int value = service.ValueConvert(n);
        Message message = restriction.RestrictionLadder(value);
        if(message.equals(Message.SUCCESS) ) {
            LadderModel ladder = new LadderModel(value);
            ladder.setResult(service.Matrix(ladder.getN()));
            screen.Result(ladder);
        }
    }
}