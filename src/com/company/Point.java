package com.company;

import java.util.Scanner;

public class Point {
    private int cordinantX;
    private int cordinantY;

    public Point(int cordinantX, int cordinantY) {
        this.cordinantX = cordinantX;
        this.cordinantY = cordinantY;
    }

    Scanner scanner = new Scanner(System.in);

    public Point() {
    }

    public void calculatePointsDistance(Point point) {

    }

    //region Getter and setter

    public int getCordinantX() {
        return cordinantX;
    }

    public void setCordinantX(int cordinantX) {
        this.cordinantX = cordinantX;
    }

    public int getCordinantY() {
        return cordinantY;
    }

    public void setCordinantY(int cordinantY) {
        this.cordinantY = cordinantY;
    }

    //endregion
}
