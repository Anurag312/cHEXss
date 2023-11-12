package org.chexss.game;

import org.chexss.pieces.PieceType;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Board {
    private final Map<Point,Cell> cellMap;

    public Board() {
        cellMap = initializeBoard();
    }

    private Map<Point,Cell> initializeBoard() {
        Map<Point,Cell> cellMap = HashMap.newHashMap(37);
        cellMap.put(new Point(-5,5),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-4,5),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-3,5),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-2,5),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-1,5),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(0,5),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-5,4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-4,4),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-3,4),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-2,4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-1,4),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(0,4),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(1,4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-5,3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-4,3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-3,3),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-2,3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-1,3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(0,3),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(1,3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(2,3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-5,2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-4,2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-3,2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-2,2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-1,2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(0,2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(1,2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(2,2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(3,2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-5,1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-4,1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-3,1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-2,1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-1,1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(0,1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(1,1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(2,1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(3,1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(4,1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-5,0),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-4,0),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-3,0),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-2,0),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-1,0),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(0,0),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(1,0),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(2,0),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(3,0),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(4,0),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(5,0),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-4,-1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-3,-1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-2,-1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-1,-1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(0,-1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(1,-1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(2,-1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(3,-1),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(4,-1),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(5,-1),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-3,-2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-2,-2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(-1,-2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(0,-2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(1,-2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(2,-2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(3,-2),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(4,-2),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(5,-2),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-2,-3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(-1,-3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(0,-3),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(1,-3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(2,-3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(3,-3),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(4,-3),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(5,-3),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(-1,-4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(0,-4),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(1,-4),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(2,-4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(3,-4),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(4,-4),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(5,-4),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(0,-5),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(1,-5),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(2,-5),new Cell(CellColor.WHITE, PieceType.NONE));
        cellMap.put(new Point(3,-5),new Cell(CellColor.BLACK, PieceType.NONE));
        cellMap.put(new Point(4,-5),new Cell(CellColor.GREY, PieceType.NONE));
        cellMap.put(new Point(5,-5),new Cell(CellColor.WHITE, PieceType.NONE));
        return cellMap;
    }


    public Cell getCellForPosition(int x, int z){
        return cellMap.get(new Point(x, z));
    }

}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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