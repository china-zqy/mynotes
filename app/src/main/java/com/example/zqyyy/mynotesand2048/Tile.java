package com.example.zqyyy.mynotesand2048;

public class Tile extends Cell {
    private int value;
    private com.example.zqyyy.mynotesand2048.Tile[] mergedFrom = null;

    public Tile(int x, int y, int value) {
        super(x, y);
        this.value = value;
    }

    public Tile(Cell cell, int value) {
        super(cell.getX(), cell.getY());
        this.value = value;
    }

    public void updatePosition(Cell cell) {
        this.setX(cell.getX());
        this.setY(cell.getY());
    }

    public int getValue() {
        return this.value;
    }

    public com.example.zqyyy.mynotesand2048.Tile[] getMergedFrom() {
        return mergedFrom;
    }

    public void setMergedFrom(com.example.zqyyy.mynotesand2048.Tile[] tile) {
        mergedFrom = tile;
    }
}
