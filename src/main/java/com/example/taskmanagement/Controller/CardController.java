package com.example.taskmanagement.Controller;

import com.example.taskmanagement.Services.CardService;
import com.example.taskmanagement.model.Card;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {
    CardService cardService = new CardService();

    @RequestMapping(value = "/get-cards", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Card> getCard(){
        List<Card> cardList = cardService.getAllCards();
        return cardList;
    }

    @RequestMapping(value = "/get-card/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Card getCardById(@PathVariable int id) {
        return cardService.getCard(id);
    }

    @RequestMapping(value = "/add-card", method = RequestMethod.POST, headers = "Accept=application/json")
    public Card addCard(@RequestBody Card card) {
        return cardService.addCard(card);
    }

    @RequestMapping(value = "/update-card", method = RequestMethod.PUT, headers = "Accept=application/json")
    public Card updateCard(@RequestBody Card card){return cardService.updateCard(card);
    }

    @RequestMapping(value = "/delete-card/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteCard(@PathVariable("id") int id){
        cardService.deleteCard(id);
    }


}
