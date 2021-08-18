package com.example.taskmanagement.Services;

import com.example.taskmanagement.model.Board;
import com.example.taskmanagement.model.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CardService {

    private static HashMap<Integer, Card> cardHashMap = getCardHashMap();

    public CardService(){
        super();
        if(cardHashMap == null) {

            cardHashMap = new HashMap<Integer, Card>();
            Card card1 = new Card(1,"board-1","description");
            Card card2 = new Card(2,"board-2", "description");
            Card card3 = new Card(3,"board-2", "description");

            cardHashMap.put(1,card1);
            cardHashMap.put(2,card2);
            cardHashMap.put(3,card3);
        }
    }

    public static int getMaximumId(){
        int max = 0;
        for (int id : cardHashMap.keySet()){
            if(max <= id) {
                max = id;
            }
        }
        return max;
    }

    public static HashMap<Integer, Card> getCardHashMap() {
        return cardHashMap;
    }

    public List<Card> getAllCards() {
        List<Card> cards = new ArrayList<Card>(cardHashMap.values());
        return cards;
    }

    public Card getCard(int id){
        Card card = cardHashMap.get(id);
        return card;
    }

    public Card addCard(Card card) {
        card.setId(getMaximumId() + 1 );
        cardHashMap.put(card.getId(), card);
        return card;
    }

    public Card updateCard(Card card) {
        if (card.getId() <= 0)
            return null;
        cardHashMap.put(card.getId(), card);
        return card;
    }

    public void deleteCard(int id) {
        cardHashMap.remove(id);
    }


}
