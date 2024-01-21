package com.target_determinator;

import java.util.Scanner;

public class DailyTargetDeterminator {
    private Integer[] transactionList;
    private Integer numTransactions;

    /**
     * Constructor without any params.
     */
    public DailyTargetDeterminator() {
        Scanner sc = new Scanner(System.in);

        // Accept number of transactions.
        System.out.println("Enter number of transaction: ");
        this.numTransactions = sc.nextInt();

        // Accept all transactions.
        System.out.println("Enter " + numTransactions + " transactions:");
        this.transactionList = new Integer[numTransactions];
        for(int i=0; i < numTransactions; i++) {
            this.transactionList[i] = sc.nextInt();
        }
    }

    /**
     * Constructor that accepts number of transactions.
     *
     * @param numTx integer number of transactions.
     */
    public DailyTargetDeterminator(int numTx) {
        Scanner sc = new Scanner(System.in);
        this.numTransactions = numTx;

        // Accept all transactions.
        System.out.println("Enter " + numTransactions + " transactions:");
        this.transactionList = new Integer[numTransactions];
        for(int i=0; i < numTransactions; i++) {
            this.transactionList[i] = sc.nextInt();
        }
    }

    /**
     * Constructor that accepts num of transactions and transaction values.
     *
     * @param numTx
     * @param transactions
     */
    public DailyTargetDeterminator(int numTx, Integer[] transactions) {
        this.numTransactions = numTx;
        this.transactionList = transactions;
    }

    /**
     * This method is used to calculate daily target to be met.
     *
     * @param dailyTarget int value of daily target to be met.
     */
    public void dailyTargetMet(int dailyTarget) {
        int sum=0, count=1;
        for(int i=0; i < this.numTransactions ; i++, count++){
            if((sum + transactionList[i]) >= dailyTarget) {
                System.out.println("Target achieved " + (count) + " transaction(s).");
                return;
            }
            sum += transactionList[i];
        }
        System.out.println("Given target not achieved.");
    }
}
