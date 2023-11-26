package org.chexss.game;

import org.chexss.board.Board;
import org.chexss.board.Move;
import org.chexss.ui.Visualizer;

import java.util.List;

public class GameRunner {
    private final Board board;
    private final Visualizer visualizer;

    public GameRunner() throws Exception {
        board = new Board();
        board.setupClassicGameBoard();
        visualizer = new Visualizer(board);
    }

    public Board getBoard() {
        return board;
    }

    public Visualizer getVisualizer() {
        return visualizer;
    }
    public static void main(String[] args) throws Exception {
        GameRunner gameRunner = new GameRunner();
        gameRunner.getVisualizer().showBoard();
        List<Move> moveList = gameRunner.board.getMoveList();

    }
}
