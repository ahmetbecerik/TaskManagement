package com.example.taskmanagement.model;
//manytoone

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name = "Card")
public class Card{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        private String description;
        @ManyToOne
        @JoinColumn(name = "board_id")
        private Board board;

        public Card(String title, String description, Board board) {
                this.title = title;
                this.description = description;
                this.board = board;
        }

}




