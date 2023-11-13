package org.chexss.game;

import org.chexss.pieces.PieceType;
import org.chexss.pieces.PlayerColor;

public class Cell {

    private final CellColor cellColor;

    private PieceType pieceType=null;


    private PlayerColor playerColor=null;

    public Cell(CellColor cellColor) {
        this.cellColor = cellColor;
    }

    public Cell(CellColor cellColor, PieceType pieceType, PlayerColor playerColor) {
        this(cellColor);
        this.addPieceToCell(pieceType, playerColor);
    }

    public boolean isEmpty(){
        return this.pieceType == null;
    }

    public CellColor getCellColor() {
        return cellColor;
    }
    public PlayerColor getPlayerColor() {
        return playerColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
    public void addPieceToCell(PieceType pieceType, PlayerColor playerColor) {
        this.pieceType = pieceType;
        this.playerColor = playerColor;
    }

}

