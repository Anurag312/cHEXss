package org.chexss.game;

public class Move {
    private final Cell sourceCell;
    private final Cell targetCell;

    public Move(Cell sourceCell, Cell targetCell){
        this.sourceCell = sourceCell;
        this.targetCell = targetCell;
    }

    public Cell getSourceCell() {
        return sourceCell;
    }

    public Cell getTargetCell() {
        return targetCell;
    }
}
