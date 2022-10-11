package com.greatlearning.dsa.labassignment2.question;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of testcases: ");
        int testcases = sc.nextInt();
        for (int tc=1;tc<testcases+1;tc++) {
            System.out.println("Testcase:"+(tc));
            System.out.println("Enter the size of Currency Denominations: ");
            int sizeOfTransaction=sc.nextInt();
            int[] currency=new int[sizeOfTransaction];
            for (int i=0; i < sizeOfTransaction; i++) {
                System.out.println("Enter the Currency Denominations Value :" + (i + 1));
                currency[i]=sc.nextInt();
            }
            BubbleSort bs=new BubbleSort(currency);
            System.out.println(Arrays.toString(currency));

            System.out.print("Enter the value of target: ");
            int valueOfTarget=sc.nextInt();

            Transactions numberOfTransactions=new Transactions();
            numberOfTransactions.counting(currency, valueOfTarget);
        }

    }
}
