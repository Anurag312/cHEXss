package org.chexss.board;



import org.chexss.pieces.Piece;
import org.chexss.pieces.PieceType;
import org.chexss.pieces.PlayerColor;

import java.util.*;

public class Board {
    private final Map<Point, Cell> cellMap;

    public Board() {
        cellMap = Collections.unmodifiableMap(generateCellMap());
    }


    public List<Move> getMoveList(){
        List<Move> moveList = new ArrayList<>();;
        cellMap.forEach((position, cell) -> {
            if (!cell.isEmpty()) {
                moveList.addAll(Piece.generateMoves(this, cell));
            }
        });
        return moveList;
    }
    public Cell getCellForPosition(int x, int z){
        return cellMap.get(new Point(x, z));
    }

    private Map<Point,Cell> generateCellMap() {
        Map<Point,Cell> cellMap = HashMap.newHashMap(90);
        cellMap.put(new Point(-5, 5), new Cell(CellColor.BLACK, -5, 5));
        cellMap.put(new Point(-4, 5), new Cell(CellColor.GREY, -4, 5));
        cellMap.put(new Point(-3, 5), new Cell(CellColor.WHITE, -3, 5));
        cellMap.put(new Point(-2, 5), new Cell(CellColor.BLACK, -2, 5));
        cellMap.put(new Point(-1, 5), new Cell(CellColor.GREY, -1, 5));
        cellMap.put(new Point(0, 5), new Cell(CellColor.WHITE, 0, 5));
        cellMap.put(new Point(-5, 4), new Cell(CellColor.GREY, -5, 4));
        cellMap.put(new Point(-4, 4), new Cell(CellColor.WHITE, -4, 4));
        cellMap.put(new Point(-3, 4), new Cell(CellColor.BLACK, -3, 4));
        cellMap.put(new Point(-2, 4), new Cell(CellColor.GREY, -2, 4));
        cellMap.put(new Point(-1, 4), new Cell(CellColor.WHITE, -1, 4));
        cellMap.put(new Point(0, 4), new Cell(CellColor.BLACK, 0, 4));
        cellMap.put(new Point(1, 4), new Cell(CellColor.GREY, 1, 4));
        cellMap.put(new Point(-5, 3), new Cell(CellColor.WHITE, -5, 3));
        cellMap.put(new Point(-4, 3), new Cell(CellColor.BLACK, -4, 3));
        cellMap.put(new Point(-3, 3), new Cell(CellColor.GREY, -3, 3));
        cellMap.put(new Point(-2, 3), new Cell(CellColor.WHITE, -2, 3));
        cellMap.put(new Point(-1, 3), new Cell(CellColor.BLACK, -1, 3));
        cellMap.put(new Point(0, 3), new Cell(CellColor.GREY, 0, 3));
        cellMap.put(new Point(1, 3), new Cell(CellColor.WHITE, 1, 3));
        cellMap.put(new Point(2, 3), new Cell(CellColor.BLACK, 2, 3));
        cellMap.put(new Point(-5, 2), new Cell(CellColor.BLACK, -5, 2));
        cellMap.put(new Point(-4, 2), new Cell(CellColor.GREY, -4, 2));
        cellMap.put(new Point(-3, 2), new Cell(CellColor.WHITE, -3, 2));
        cellMap.put(new Point(-2, 2), new Cell(CellColor.BLACK, -2, 2));
        cellMap.put(new Point(-1, 2), new Cell(CellColor.GREY, -1, 2));
        cellMap.put(new Point(0, 2), new Cell(CellColor.WHITE, 0, 2));
        cellMap.put(new Point(1, 2), new Cell(CellColor.BLACK, 1, 2));
        cellMap.put(new Point(2, 2), new Cell(CellColor.GREY, 2, 2));
        cellMap.put(new Point(3, 2), new Cell(CellColor.WHITE, 3, 2));
        cellMap.put(new Point(-5, 1), new Cell(CellColor.GREY, -5, 1));
        cellMap.put(new Point(-4, 1), new Cell(CellColor.WHITE, -4, 1));
        cellMap.put(new Point(-3, 1), new Cell(CellColor.BLACK, -3, 1));
        cellMap.put(new Point(-2, 1), new Cell(CellColor.GREY, -2, 1));
        cellMap.put(new Point(-1, 1), new Cell(CellColor.WHITE, -1, 1));
        cellMap.put(new Point(0, 1), new Cell(CellColor.BLACK, 0, 1));
        cellMap.put(new Point(1, 1), new Cell(CellColor.GREY, 1, 1));
        cellMap.put(new Point(2, 1), new Cell(CellColor.WHITE, 2, 1));
        cellMap.put(new Point(3, 1), new Cell(CellColor.BLACK, 3, 1));
        cellMap.put(new Point(4, 1), new Cell(CellColor.GREY, 4, 1));
        cellMap.put(new Point(-5, 0), new Cell(CellColor.WHITE, -5, 0));
        cellMap.put(new Point(-4, 0), new Cell(CellColor.BLACK, -4, 0));
        cellMap.put(new Point(-3, 0), new Cell(CellColor.GREY, -3, 0));
        cellMap.put(new Point(-2, 0), new Cell(CellColor.WHITE, -2, 0));
        cellMap.put(new Point(-1, 0), new Cell(CellColor.BLACK, -1, 0));
        cellMap.put(new Point(0, 0), new Cell(CellColor.GREY, 0, 0));
        cellMap.put(new Point(1, 0), new Cell(CellColor.WHITE, 1, 0));
        cellMap.put(new Point(2, 0), new Cell(CellColor.BLACK, 2, 0));
        cellMap.put(new Point(3, 0), new Cell(CellColor.GREY, 3, 0));
        cellMap.put(new Point(4, 0), new Cell(CellColor.WHITE, 4, 0));
        cellMap.put(new Point(5, 0), new Cell(CellColor.BLACK, 5, 0));
        cellMap.put(new Point(-4, -1), new Cell(CellColor.GREY, -4, -1));
        cellMap.put(new Point(-3, -1), new Cell(CellColor.WHITE, -3, -1));
        cellMap.put(new Point(-2, -1), new Cell(CellColor.BLACK, -2, -1));
        cellMap.put(new Point(-1, -1), new Cell(CellColor.GREY, -1, -1));
        cellMap.put(new Point(0, -1), new Cell(CellColor.WHITE, 0, -1));
        cellMap.put(new Point(1, -1), new Cell(CellColor.BLACK, 1, -1));
        cellMap.put(new Point(2, -1), new Cell(CellColor.GREY, 2, -1));
        cellMap.put(new Point(3, -1), new Cell(CellColor.WHITE, 3, -1));
        cellMap.put(new Point(4, -1), new Cell(CellColor.BLACK, 4, -1));
        cellMap.put(new Point(5, -1), new Cell(CellColor.GREY, 5, -1));
        cellMap.put(new Point(-3, -2), new Cell(CellColor.BLACK, -3, -2));
        cellMap.put(new Point(-2, -2), new Cell(CellColor.GREY, -2, -2));
        cellMap.put(new Point(-1, -2), new Cell(CellColor.WHITE, -1, -2));
        cellMap.put(new Point(0, -2), new Cell(CellColor.BLACK, 0, -2));
        cellMap.put(new Point(1, -2), new Cell(CellColor.GREY, 1, -2));
        cellMap.put(new Point(2, -2), new Cell(CellColor.WHITE, 2, -2));
        cellMap.put(new Point(3, -2), new Cell(CellColor.BLACK, 3, -2));
        cellMap.put(new Point(4, -2), new Cell(CellColor.GREY, 4, -2));
        cellMap.put(new Point(5, -2), new Cell(CellColor.WHITE, 5, -2));
        cellMap.put(new Point(-2, -3), new Cell(CellColor.WHITE, -2, -3));
        cellMap.put(new Point(-1, -3), new Cell(CellColor.BLACK, -1, -3));
        cellMap.put(new Point(0, -3), new Cell(CellColor.GREY, 0, -3));
        cellMap.put(new Point(1, -3), new Cell(CellColor.WHITE, 1, -3));
        cellMap.put(new Point(2, -3), new Cell(CellColor.BLACK, 2, -3));
        cellMap.put(new Point(3, -3), new Cell(CellColor.GREY, 3, -3));
        cellMap.put(new Point(4, -3), new Cell(CellColor.WHITE, 4, -3));
        cellMap.put(new Point(5, -3), new Cell(CellColor.BLACK, 5, -3));
        cellMap.put(new Point(-1, -4), new Cell(CellColor.GREY, -1, -4));
        cellMap.put(new Point(0, -4), new Cell(CellColor.WHITE, 0, -4));
        cellMap.put(new Point(1, -4), new Cell(CellColor.BLACK, 1, -4));
        cellMap.put(new Point(2, -4), new Cell(CellColor.GREY, 2, -4));
        cellMap.put(new Point(3, -4), new Cell(CellColor.WHITE, 3, -4));
        cellMap.put(new Point(4, -4), new Cell(CellColor.BLACK, 4, -4));
        cellMap.put(new Point(5, -4), new Cell(CellColor.GREY, 5, -4));
        cellMap.put(new Point(0, -5), new Cell(CellColor.BLACK, 0, -5));
        cellMap.put(new Point(1, -5), new Cell(CellColor.GREY, 1, -5));
        cellMap.put(new Point(2, -5), new Cell(CellColor.WHITE, 2, -5));
        cellMap.put(new Point(3, -5), new Cell(CellColor.BLACK, 3, -5));
        cellMap.put(new Point(4, -5), new Cell(CellColor.GREY, 4, -5));
        cellMap.put(new Point(5, -5), new Cell(CellColor.WHITE, 5, -5));
        return cellMap;
    }

    public void setupClassicGameBoard() throws Exception {
        cellMap.forEach((position, cell) -> cell.vacateCell());
        getCellForPosition(-4,5).addPieceToCell(PieceType.PAWN, PlayerColor.WHITE);
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