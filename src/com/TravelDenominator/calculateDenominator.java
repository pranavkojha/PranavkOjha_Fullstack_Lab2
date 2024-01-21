package com.TravelDenominator;


import java.util.Scanner;
import java.util.Arrays;

public class calculateDenominator {
    int[] denominations;
    int numDenominations, targetPrice;
    Scanner sc = new Scanner(System.in);

    /**
     * Default constructor without any parameters.
     */
    public calculateDenominator() {
        System.out.println("Enter number of denominations: ");
        this.numDenominations = sc.nextInt();
        System.out.println("Enter " + this.numDenominations + " denomination values: ");
        this.denominations = new int[this.numDenominations];
        for(int i =0; i< this.numDenominations ; i++) {
            this.denominations[i] = sc.nextInt();
        }
        System.out.println("Enter Target Price: ");
        this.targetPrice = sc.nextInt();
    }

    /**
     * Constructor with denominations and target.
     *
     * @param denominations Array of intergers.
     * @param target Integer that indicate the target amount to be matched.
     */
    public calculateDenominator(int[] denominations, int target) {
        this.denominations = denominations;
        this.targetPrice = target;
    }

    /**
     * This method hosts the main algorithm to evaluate if the denominations can match target
     * price.
     */
    public void canMatchTargetPrice() {
        String str = "";
        int count = 0;

        // Sort the array.
        Arrays.sort(this.denominations);
        int remainingSum = this.targetPrice;

        // As the array is sort in ascending order, to start with largest denomination, we start with
        // last element in the array.
        for (int i = this.denominations.length - 1; i >= 0 && remainingSum >= 0; ) {
            if(remainingSum < this.denominations[i]) {
                i--;
                continue;
            }
            int multiplier = remainingSum / this.denominations[i];
            if (multiplier > 0) {
                remainingSum -= this.denominations[i] *  multiplier;
                str += "\n Use denominations " + this.denominations[i] + " x " + multiplier + " times";
                i--;
            } else {
                i--;
            }
        }
        if(remainingSum == 0) {
            System.out.println(str);
            System.out.println("Denominations can make the full sum.");
        } else {
            System.out.println("Denominations CANNOT make the full sum");
        }
    }
}
