package com.mohan.array;

import java.util.Random;

public class MaxElementInArray {


    public static void main(String[] args) {


        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i])
                max = arr[i];
        }

        System.out.println("\nmaximum element in this array = " + max);

    }
}
