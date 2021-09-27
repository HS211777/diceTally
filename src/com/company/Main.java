package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random rn = new Random();
    ArrayList<Integer> tally = new ArrayList<>(); //0 is tally of 1s rolled, 1 is tally of 2s rolled, etc.
        System.out.println("how many sides does the dice have?");
        int sides = input.nextInt();
        System.out.println("how many times do you want to roll the dice?");
        int rolls = input.nextInt();
        for (int i = 0; i < sides; i++){
            tally.add(0);
        }
        //System.out.println(tally);
        for (int i = 0; i < rolls; i++){
            int randomNum = rn.nextInt(sides);
            tally.set(randomNum,tally.get(randomNum)+1);
        }
        //System.out.println(tally);
        for (int i =0; i<sides;i++){
            double percent = ((double)tally.get(i)/rolls)*100;
            percent = Math.round(percent*100.0)/100.0;
            System.out.println(percent+"% of rolls were "+(i+1));
        }
    }
}
