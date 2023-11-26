package org.chexss.ui;

import org.chexss.board.Board;

import org.chexss.board.Cell;
import org.chexss.board.CellColor;
import org.hexworks.mixite.core.api.*;
import org.hexworks.mixite.core.api.contract.SatelliteData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

import static java.lang.Math.abs;


public class Visualizer extends JPanel {
    private final HexagonalGrid<SatelliteData> hexGrid;

    private final Board board;
    private List<HexBlock> hexBlocks;
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

        hexBlocks = new ArrayList<>();

        for (Hexagon<SatelliteData> hexagon : this.hexGrid.getHexagons()){
            Cell cell = this.board.getCellForPosition(hexagon.getCubeCoordinate().getGridX() - 5, hexagon.getCubeCoordinate().getGridZ() - 3);
            hexBlocks.add(new HexBlock(cell, hexagon));
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (HexBlock block : hexBlocks){
            block.draw(g);
        }

    }

    public void showBoard(){
        JFrame frame = new JFrame("Hexagon Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Adjust the size as needed

        frame.add(this);
        frame.setVisible(true);
    }


    private class HexBlock {
        Cell cell;
        Hexagon<SatelliteData> hexagon;

        Polygon polygon;

        private boolean isSelected = false;

        public HexBlock(Cell cell, Hexagon<SatelliteData> hexagon) {
            this.cell = cell;
            this.hexagon = hexagon;
        }

        public void draw(Graphics g) {
            Color cl;
            if (cell.getCellColor() == CellColor.GREY) {
                cl = Colors.GREY;
            } else if(cell.getCellColor() == CellColor.WHITE){
                cl = Colors.WHITE;
            } else {
                cl = Colors.BLACK;
            }


            int[] xPoints = new int[6];
            int[] yPoints = new int[6];
            int i= 0;
            for(org.hexworks.mixite.core.api.Point p : hexagon.getPoints()) {
                // Do you stuff with point.coordinateX, point.coordinateY
                xPoints[i] = (int)p.getCoordinateX();
                yPoints[i++] = (int)p.getCoordinateY();
                g.setColor(cl); // Change the color as needed
            }

            if (!cell.isEmpty()){
                ImageIcon icon = Icons.getIconForPiece(cell.getPieceType(), cell.getPlayerColor());
                int imageX = (int) (hexagon.getCenterX()) - icon.getIconWidth() / 2;
                int imageY = (int) (hexagon.getCenterY()) - icon.getIconHeight() / 2;
                g.drawImage(icon.getImage(), imageX, imageY,null);
            }
            polygon = new Polygon(xPoints, yPoints, 6);
            g.fillPolygon(polygon);
        }

        public boolean contains(int mx, int my) {
            return polygon.contains(mx, my);
        }


        public void setSelected(boolean selected) {
            isSelected = selected;
        }

        public boolean isSelected() {
            return isSelected;
        }

    }


}
