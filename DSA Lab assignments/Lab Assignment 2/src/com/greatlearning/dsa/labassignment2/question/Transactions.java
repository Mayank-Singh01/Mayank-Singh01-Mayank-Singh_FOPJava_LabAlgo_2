package com.greatlearning.dsa.labassignment2.question;

public class Transactions {
    public void counting(int[] currency, int valueOfTarget) {

        int[] noteqty = new int[currency.length];
        for (int i = 0; i < currency.length; i++) {
            noteqty[i] = valueOfTarget / currency[i];
            valueOfTarget = valueOfTarget % currency[i];
        }
        for (int i = 0; i < currency.length; i++)
        {
            if (noteqty[i]!=0) {
                System.out.println(currency[i] + ":" + noteqty[i]);
            }
        }

    }
}
