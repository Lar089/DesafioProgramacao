package controller;

import controller.service.AnagramService;
import model.AnagramModel;
import view.messages.Message;
import view.messages.Restriction;
import view.screen.AnagramScreen;

public class AnagramController {
    AnagramService service = new AnagramService();
    Restriction restriction = new Restriction();
    AnagramScreen screen = new AnagramScreen();
    AnagramModel wordAnagram;

    public AnagramController(String word) {
        if (!word.equals("0")) {
            wordAnagram = new AnagramModel(word);
            Message message = restriction.RestrictionAnagram(word);
            if (message.equals(Message.SUCCESS)) {
                int result = service.SubAnagram(word);
                wordAnagram.setResult(result);
                screen.Result(wordAnagram);
            }
        }
    }
}
