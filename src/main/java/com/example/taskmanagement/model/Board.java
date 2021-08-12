package com.example.taskmanagement.model;
//onetomany

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @OneToMany(
            mappedBy = "board",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Card> cards = new ArrayList<>();

    public Board(String name){
        this.title = name;
    }

    public void setCards(List<Card> cards){
        this.cards = cards;
    }

    //public void addCard(Card card) {cards.add(card);}

    //public void removeCard(Card card) {cards.remove(card);}



}


