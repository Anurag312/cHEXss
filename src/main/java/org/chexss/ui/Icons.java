package org.chexss.ui;

import org.chexss.pieces.PieceType;
import org.chexss.pieces.PlayerColor;

import javax.swing.*;
import java.util.Objects;

public class Icons {
    public static final ImageIcon bishopBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_bdt60.png")));
    public static final ImageIcon bishopWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_blt60.png")));
    public static final ImageIcon kingBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_kdt60.png")));
    public static final ImageIcon kingWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_klt60.png")));
    public static final ImageIcon knightBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_ndt60.png")));
    public static final ImageIcon knightWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_nlt60.png")));
    public static final ImageIcon pawnBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_pdt60.png")));
    public static final ImageIcon pawnWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_plt60.png")));
    public static final ImageIcon queenBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_qdt60.png")));
    public static final ImageIcon queenWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_qlt60.png")));
    public static final ImageIcon rookBlack = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_rdt60.png")));
    public static final ImageIcon rookWhite = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/main/resources/ui/images/pieces/Chess_rlt60.png")));

    public static ImageIcon getIconForPiece(PieceType pieceType, PlayerColor playerColor){
        switch (pieceType){
            case KING -> {
                return playerColor == PlayerColor.BLACK ? kingBlack : kingWhite;
            }
            case QUEEN -> {
                return playerColor == PlayerColor.BLACK ? queenBlack : queenWhite;
            }
            case PAWN -> {
                return playerColor == PlayerColor.BLACK ? pawnBlack : pawnWhite;
            }
            case BISHOP -> {
                return playerColor == PlayerColor.BLACK ? bishopBlack : bishopWhite;
            }
            case KNIGHT -> {
                return playerColor == PlayerColor.BLACK ? knightBlack : knightWhite;
            }
            case ROOK -> {
                return playerColor == PlayerColor.BLACK ? rookBlack : rookWhite;
            }
        }
        return null;
    }


}
