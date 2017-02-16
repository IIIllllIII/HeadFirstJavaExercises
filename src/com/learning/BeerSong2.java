package com.learning;

 public class BeerSong2{

    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 1) {

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }
            else {
                    word = "bottle";
                    System.out.println(beerNum + " " + word + " of beer on the wall");
                }
            }

        System.out.println(beerNum + " " + word + " of beer on the wall");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        System.out.println("No more bottles of the wall");
            }
        }


