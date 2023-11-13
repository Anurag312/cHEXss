package org.chexss.pieces;

import org.chexss.game.Board;
import org.chexss.game.Cell;
import org.chexss.game.Move;

import java.util.ArrayList;
import java.util.List;

public class Pawn{
    public static List<Move> generateMoves(Board board, int x, int z){
        List<Move> moveList = new ArrayList<>();
        Cell cell = board.getCellForPosition(x,z);
        if (cell.isEmpty()){
            return moveList;
        }
        moveList.add(new Move(cell, board.getCellForPosition(-5,4)));
        return moveList;
    }
}
