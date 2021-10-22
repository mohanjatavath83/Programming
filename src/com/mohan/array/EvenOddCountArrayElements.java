package com.mohan.array;

import java.util.Random;

public class EvenOddCountArrayElements {


    public static void main(String[] args) {


        int[] arr = new int[20];
        Random random = new Random();

        for (int j = 1; j <= 5; j++)
        {
            for (int i = 0; i < arr.length; i++)
                arr[i] = random.nextInt(100);

            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");

            int oddCount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)
                    oddCount++;
            }

            System.out.println("\noddCount = " + oddCount);
            System.out.println("evenCount = " + (arr.length - oddCount));
        }

    }
}
