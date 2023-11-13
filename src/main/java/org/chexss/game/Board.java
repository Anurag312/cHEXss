package org.chexss.game;

import org.chexss.pieces.Piece;
import org.chexss.pieces.PieceType;
import org.chexss.pieces.PlayerColor;

import java.util.*;

public class Board {
    private final Map<Point,Cell> cellMap;
    private PlayerColor turn;

    public Board() {
        turn = PlayerColor.WHITE;
        cellMap = initializeBoard();
    }


    public List<Move> getMoveList(){
        List<Move> moveList = new ArrayList<>();;
        cellMap.forEach((position, cell) -> {
            if (!cell.isEmpty()) {
                moveList.addAll(Piece.generateMoves(this, position.getX(), position.getY()));
            }
        });
        return moveList;
    }
    public Cell getCellForPosition(int x, int z){
        return cellMap.get(new Point(x, z));
    }

    private Map<Point,Cell> initializeBoard() {
        Map<Point,Cell> cellMap = HashMap.newHashMap(37);
        cellMap.put(new Point(-5,5),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-4,5),new Cell(CellColor.GREY, PieceType.PAWN, PlayerColor.WHITE));
        cellMap.put(new Point(-3,5),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-2,5),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-1,5),new Cell(CellColor.GREY));
        cellMap.put(new Point(0,5),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-5,4),new Cell(CellColor.GREY));
        cellMap.put(new Point(-4,4),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-3,4),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-2,4),new Cell(CellColor.GREY));
        cellMap.put(new Point(-1,4),new Cell(CellColor.WHITE));
        cellMap.put(new Point(0,4),new Cell(CellColor.BLACK));
        cellMap.put(new Point(1,4),new Cell(CellColor.GREY));
        cellMap.put(new Point(-5,3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-4,3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-3,3),new Cell(CellColor.GREY));
        cellMap.put(new Point(-2,3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-1,3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(0,3),new Cell(CellColor.GREY));
        cellMap.put(new Point(1,3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(2,3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-5,2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-4,2),new Cell(CellColor.GREY));
        cellMap.put(new Point(-3,2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-2,2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-1,2),new Cell(CellColor.GREY));
        cellMap.put(new Point(0,2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(1,2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(2,2),new Cell(CellColor.GREY));
        cellMap.put(new Point(3,2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-5,1),new Cell(CellColor.GREY));
        cellMap.put(new Point(-4,1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-3,1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-2,1),new Cell(CellColor.GREY));
        cellMap.put(new Point(-1,1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(0,1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(1,1),new Cell(CellColor.GREY));
        cellMap.put(new Point(2,1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(3,1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(4,1),new Cell(CellColor.GREY));
        cellMap.put(new Point(-5,0),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-4,0),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-3,0),new Cell(CellColor.GREY));
        cellMap.put(new Point(-2,0),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-1,0),new Cell(CellColor.BLACK));
        cellMap.put(new Point(0,0),new Cell(CellColor.GREY));
        cellMap.put(new Point(1,0),new Cell(CellColor.WHITE));
        cellMap.put(new Point(2,0),new Cell(CellColor.BLACK));
        cellMap.put(new Point(3,0),new Cell(CellColor.GREY));
        cellMap.put(new Point(4,0),new Cell(CellColor.WHITE));
        cellMap.put(new Point(5,0),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-4,-1),new Cell(CellColor.GREY));
        cellMap.put(new Point(-3,-1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-2,-1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-1,-1),new Cell(CellColor.GREY));
        cellMap.put(new Point(0,-1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(1,-1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(2,-1),new Cell(CellColor.GREY));
        cellMap.put(new Point(3,-1),new Cell(CellColor.WHITE));
        cellMap.put(new Point(4,-1),new Cell(CellColor.BLACK));
        cellMap.put(new Point(5,-1),new Cell(CellColor.GREY));
        cellMap.put(new Point(-3,-2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-2,-2),new Cell(CellColor.GREY));
        cellMap.put(new Point(-1,-2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(0,-2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(1,-2),new Cell(CellColor.GREY));
        cellMap.put(new Point(2,-2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(3,-2),new Cell(CellColor.BLACK));
        cellMap.put(new Point(4,-2),new Cell(CellColor.GREY));
        cellMap.put(new Point(5,-2),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-2,-3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(-1,-3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(0,-3),new Cell(CellColor.GREY));
        cellMap.put(new Point(1,-3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(2,-3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(3,-3),new Cell(CellColor.GREY));
        cellMap.put(new Point(4,-3),new Cell(CellColor.WHITE));
        cellMap.put(new Point(5,-3),new Cell(CellColor.BLACK));
        cellMap.put(new Point(-1,-4),new Cell(CellColor.GREY));
        cellMap.put(new Point(0,-4),new Cell(CellColor.WHITE));
        cellMap.put(new Point(1,-4),new Cell(CellColor.BLACK));
        cellMap.put(new Point(2,-4),new Cell(CellColor.GREY));
        cellMap.put(new Point(3,-4),new Cell(CellColor.WHITE));
        cellMap.put(new Point(4,-4),new Cell(CellColor.BLACK));
        cellMap.put(new Point(5,-4),new Cell(CellColor.GREY));
        cellMap.put(new Point(0,-5),new Cell(CellColor.BLACK));
        cellMap.put(new Point(1,-5),new Cell(CellColor.GREY));
        cellMap.put(new Point(2,-5),new Cell(CellColor.WHITE));
        cellMap.put(new Point(3,-5),new Cell(CellColor.BLACK));
        cellMap.put(new Point(4,-5),new Cell(CellColor.GREY));
        cellMap.put(new Point(5,-5),new Cell(CellColor.WHITE));
        return cellMap;
    }

}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Implement equals and hashCode methods for proper Map functioning
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}