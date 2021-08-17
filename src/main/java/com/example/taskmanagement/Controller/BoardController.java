package com.example.taskmanagement.Controller;

import com.example.taskmanagement.Services.BoardService;
import com.example.taskmanagement.model.Board;
import com.example.taskmanagement.model.Card;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {

    BoardService boardService = new BoardService();


    @RequestMapping(value = "/get-boards", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Board> getBoard() {
        List<Board> boardList = boardService.getAllBoards();
        return boardList;
    }

    @RequestMapping(value = "/get-board/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Board getBoardById(@PathVariable int id) {
        return boardService.getboard(id);
    }

    @RequestMapping(value = "/add-board", method = RequestMethod.POST, headers = "Accept=application/json")
    public Board addBoard (@RequestBody Board board){
        return boardService.addBoard(board);
    }

    @RequestMapping(value = "/update-board", method = RequestMethod.PUT, headers = "Accept=application/json")
    public Board updateBoard (@RequestBody Board board){
        return boardService.updateBoard(board);
    }

    @RequestMapping(value = "/delete-board/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteBoard(@PathVariable("id") int id){
        boardService.deleteBoard(id);
    }

}
