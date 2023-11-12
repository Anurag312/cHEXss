package org.chexss.game;

import org.chexss.pieces.PieceType;

public class Cell {

    private final CellColor cellColor;

    private PieceType pieceType;


    public Cell(CellColor cellColor, PieceType pieceType) {
        this.cellColor = cellColor;
        this.pieceType = pieceType;

    }

    protected boolean isEmpty(){
        return this.pieceType == PieceType.NONE;
    }

    public CellColor getCellColor() {
        return cellColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

}

