package org.chexss.pieces;

import org.chexss.board.Board;
import org.chexss.board.Cell;
import org.chexss.board.Move;

import java.util.ArrayList;
import java.util.List;

public class Pawn{
    public static List<Move> generateMoves(Board board, Cell cell){
        List<Move> moveList = new ArrayList<>();
        if (cell.isEmpty()){
            return moveList;
        }
        moveList.add(new Move(cell, board.getCellForPosition(-5,4)));
        return moveList;
    }
}
