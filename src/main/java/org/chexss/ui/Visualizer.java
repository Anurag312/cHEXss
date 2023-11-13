package org.chexss.ui;

import org.chexss.game.Board;
import org.chexss.game.Cell;
import org.chexss.game.CellColor;
import org.hexworks.mixite.core.api.*;
import org.hexworks.mixite.core.api.contract.SatelliteData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

import static java.lang.Math.abs;


public class Visualizer extends JPanel {
    private final HexagonalGrid<SatelliteData> hexGrid;

    private final Board board;
    static Logger logger;
    public Visualizer(Board board) {

        this.board = board;
        logger = Logger.getLogger(this.getClass().getName());

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);

        HexagonalGridBuilder<SatelliteData> builder = new HexagonalGridBuilder<>()
                .setGridHeight(11)
                .setGridWidth(11)
                .setGridLayout(HexagonalGridLayout.HEXAGONAL)
                .setOrientation(HexagonOrientation.FLAT_TOP)
                .setRadius(40);
        this.hexGrid = builder.build();


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int hexs = 0;


        for (Hexagon<SatelliteData> hexagon : this.hexGrid.getHexagons()) {
            logger.info(hexagon.getCubeCoordinate().toString());
            logger.info(String.valueOf(hexs));
            int[] xPoints = new int[6];
            int[] yPoints = new int[6];
            int i= 0;
            hexs++;
            Cell cell = this.board.getCellForPosition(hexagon.getCubeCoordinate().getGridX() - 5, hexagon.getCubeCoordinate().getGridZ() - 3);
            Color cl;
            if (cell.getCellColor() == CellColor.GREY) {
                cl = Colors.GREY;
            } else if(cell.getCellColor() == CellColor.WHITE){
                cl = Colors.WHITE;
            } else {
                cl = Colors.BLACK;
            }

            for(org.hexworks.mixite.core.api.Point p : hexagon.getPoints()) {
                // Do you stuff with point.coordinateX, point.coordinateY
                xPoints[i] = (int)p.getCoordinateX();
                yPoints[i++] = (int)p.getCoordinateY();
                g.setColor(cl); // Change the color as needed

            }
            g.fillPolygon(xPoints, yPoints, 6);

            g.setColor(Color.RED);
            if (!cell.isEmpty()){
                ImageIcon icon = Icons.getIconForPiece(cell.getPieceType(), cell.getPlayerColor());
                int imageX = (int) (hexagon.getCenterX()) - icon.getIconWidth() / 2;
                int imageY = (int) (hexagon.getCenterY()) - icon.getIconHeight() / 2;
                g.drawImage(icon.getImage(), imageX, imageY, this);
            }
            String text = String.valueOf((hexagon.getCubeCoordinate().getGridX() - 5)) + ",  " + String.valueOf((hexagon.getCubeCoordinate().getGridZ() - 3));
//            g.drawString(text, (int) (hexagon.getCenterX() - g.getFontMetrics().stringWidth(text) / 2), (int) (hexagon.getCenterY()));
        }

    }

    public void showBoard(){
        JFrame frame = new JFrame("Hexagon Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Adjust the size as needed

        frame.add(this);
        frame.setVisible(true);
    }


}
