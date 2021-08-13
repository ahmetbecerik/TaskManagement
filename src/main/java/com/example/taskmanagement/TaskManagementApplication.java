package com.example.taskmanagement;

import com.example.taskmanagement.model.Board;
import com.example.taskmanagement.model.Card;
import com.example.taskmanagement.repository.BoardRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

@SpringBootApplication
public class TaskManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TaskManagementApplication.class, args);
        BoardRepository boardRepository = configurableApplicationContext.getBean(BoardRepository.class);

        Board board1 = new Board("board-1");
        Board board2 = new Board("board-2");
        Card card1 = new Card("board-1","description", board1);
        Card card2 = new Card("board-2", "description", board2);
        Card card3 = new Card("board-2", "description", board2);
        List<Card> cards = Arrays.asList(card1);
        board1.setCards(cards);
        boardRepository.save(board1);
        List<Card> cards2 = Arrays.asList(card2, card3);
        board2.setCards(cards2);
        boardRepository.save(board2);
        //Github için farklı bi deney süreci.
        //terminal denemesi

    }

}
