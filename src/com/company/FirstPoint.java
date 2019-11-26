package com.company;

public class FirstPoint extends Point {
    @Override
    public void calculatePointsDistance(Point point) {
        double distance = Math.sqrt(Math.pow(getCordinantX(), 2) + Math.pow(getCordinantY(), 2));
        System.out.println("Distance from '0,0' point = " + distance);
        System.out.println("Choose the second points cordinants");
        int cordinantX1 = scanner.nextInt();
        int cordinantY1 = scanner.nextInt();
        double distanceFromSecondPoint = Math.sqrt(Math.pow(getCordinantX() - cordinantX1,2) + Math.pow(getCordinantY() - cordinantY1,2));
        System.out.println("Distance of first point from second point = " + distanceFromSecondPoint);
    }
}