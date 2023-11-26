package org.chexss.pieces;



import org.chexss.board.Board;
import org.chexss.board.Cell;
import org.chexss.board.Move;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Piece {
    public static List<Move> generateMoves(Board board, Cell cell){
        List<Move> moveList = new ArrayList<>();
        if (cell.isEmpty()){
            return moveList;
        }

        PieceType pieceType = cell.getPieceType();
        PlayerColor playerColor = cell.getPlayerColor();

        switch (pieceType){
            case PAWN -> {
                moveList.addAll(Pawn.generateMoves(board, cell));
            }

        }

        return moveList;

    }
}
