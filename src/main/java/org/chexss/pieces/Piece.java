package org.chexss.pieces;

public abstract class Piece {
    private int player;
    private PieceType type;
    public int getPlayer(){
        return player;
    }
    public PieceType getType(){
        return type;
    }
}
