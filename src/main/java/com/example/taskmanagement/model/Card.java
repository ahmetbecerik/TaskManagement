package com.example.taskmanagement.model;
//manytoone

import javax.persistence.*;

@Entity
@Table(name = "Card")
public class Card{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String title;
        private String description;
        @ManyToOne
        @JoinColumn(name = "board_id")
        private Board board;

        public Card(int id, String title, String description) {
                super();
                this.id = id;
                this.title = title;
                this.description = description;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title){
                this.title = title;
        }

        public String getDescription(){
                return description;
        }

        public void setDescription(String description){
                this.description = description;
        }

        public Board getBoard(){
                return board;
        }

        public void setBoard(Board board){
                this.board = board;
        }


}




