package com.example.taskmanagement.Services;

import com.example.taskmanagement.model.Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoardService {

    private static HashMap<Integer, Board> boardHashMap = getBoardHashMap();

    public BoardService(){
        super();
        if(boardHashMap == null){

            boardHashMap = new HashMap<Integer, Board>();

            Board board1 = new Board(1, "board-1", "board1");
            Board board2 = new Board( 2,"board-2", "board2");

            boardHashMap.put(1,board1);
            boardHashMap.put(2,board2);
        }
    }

    public static int getMaximumId() {
        int max = 0;
        for (int id : boardHashMap.keySet()) {
            if (max <= id) {
                max = id;
            }
        }
        return max;
    }

    public static HashMap<Integer, Board> getBoardHashMap() {
        return boardHashMap;
    }

    public List<Board> getAllBoards() {
        List<Board> boards = new ArrayList<Board>(boardHashMap.values());
        return boards;
    }

    public Board getboard(int id) {
        Board board =boardHashMap.get(id);
        return board;
    }

    public Board addBoard(Board board) {
        board.setId(getMaximumId() + 1);
        boardHashMap.put(board.getId(), board);
        return board;
    }

    public Board updateBoard(Board board) {
        if (board.getId() <= 0 )
            return null;
        boardHashMap.put(board.getId(), board);
        return board;
    }

    public void deleteBoard(int id) {
        boardHashMap.remove(id);
    }
}
