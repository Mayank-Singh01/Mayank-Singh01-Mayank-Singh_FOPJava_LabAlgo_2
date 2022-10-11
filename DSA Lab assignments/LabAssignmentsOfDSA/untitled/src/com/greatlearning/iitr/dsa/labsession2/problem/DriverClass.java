package com.greatlearning.iitr.dsa.labsession2.problem;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase;
        System.out.println("Enter the number of TestCases: ");
        testcase=sc.nextInt();
        for (int tc=1; tc < testcase + 1; tc++) {
        System.out.println("Enter the size of transactions");
        int size=sc.nextInt();
        int[] trans=new int[size];

            for (int i=0; i < trans.length; i++) {
                System.out.println("Enter the transactions value " + (i + 1));
                trans[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(trans));
            System.out.println("Enter the total number of targets");
            int target=sc.nextInt();
            int targetAmount;
            int sum, j, flag=0;
            for (int i=0; i < target; i++) {
                sum=0;
                System.out.println("Enter the target amount");
                targetAmount=sc.nextInt();
                for (j=0; j < trans.length; j++) {
                    sum=sum + trans[j];
                    if (sum >= targetAmount) {
                        System.out.println("Target achived after " + (j + 1) + " transactions");
                        flag=1;
                        break;
                    }
                    if (flag == 0) {
                        System.out.println("Given target is not achived");
                    }
                }
            }
        }
    }
}
