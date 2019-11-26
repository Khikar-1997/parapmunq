package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FirstPoint firstPoint = new FirstPoint();
        firstPoint.setCordinantX(scanner.nextInt());
        firstPoint.setCordinantY(scanner.nextInt());
        System.out.println("Choose the point cordinants in consol");
        firstPoint.calculatePointsDistance(firstPoint);
    }

}
