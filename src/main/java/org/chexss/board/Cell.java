package org.chexss.board;

import org.chexss.pieces.PieceType;
import org.chexss.pieces.PlayerColor;

public class Cell {

    private final CellColor cellColor;

    private PieceType pieceType=null;
    private PlayerColor playerColor=null;
    private final int xPos;


    private final int zPos;


    public Cell(CellColor cellColor, int xPos, int zPos) {
        this.cellColor = cellColor;
        this.xPos = xPos;
        this.zPos = zPos;
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

    public void addPieceToCell(PieceType pieceType, PlayerColor playerColor) throws Exception {
        if(pieceType == null || playerColor == null){
          throw new IllegalArgumentException("PieceType and PlayerColor cannot be null");
        }
        this.pieceType = pieceType;
        this.playerColor = playerColor;
    }

    public void vacateCell(){
        playerColor = null;
        pieceType = null;
    }


    public int getxPos() {
        return xPos;
    }

    public int getzPos() {
        return zPos;
    }

}

