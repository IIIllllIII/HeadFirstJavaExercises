package com.learning;

public class ExD {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;
        int y2 = 0;
        int x2 = 0;
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;

        while (x < 5) {
            y = x - y;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
        System.out.println();
        while (x1 < 5) {
            y1 = x1 + y1;
            System.out.println(x1 + "" + y1 + " ");
            x1 = x1 + 1;

        while (x1 < 5) {
            y1 = x1 + y1;
            System.out.println(x1 + "" + y1 + " ");
            x1 = x1 + 1;
        }
            System.out.println();
        while (x2 < 5) {
            y2 = y2 + 2;
            if (y2 > 4) {
                y2 = y2 - 1;
            }
            System.out.println(x2 + "" + y2 + " ");
            x2 = x2 + 1;
        }
            System.out.println();
        while(x3 < 5) {
            x3 = x3 + 1;
            y3 = y3 + x3;
            System.out.println(x3 + "" + y3 + " ");
            x3 = x3 + 1;
        }
            System.out.println();
        while (x4 < 5) {
            if (y4 < 5) {
                x4 = x4 + 1;
                if (y4 < 4) {
                    x4 = x4 - 1;
                }
            }
                y4 = y4 + 2;
                System.out.println(x4 + "" + y4 + " ");
                x4 = x4 + 1;
                }
            }
        }

            }
