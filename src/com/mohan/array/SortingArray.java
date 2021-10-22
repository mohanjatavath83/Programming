package com.mohan.array;

import java.util.Random;

public class SortingArray {


    public static void main(String[] args) {

        int[] arr = new int[200];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //selection sort

        for (int j = 0; j < arr.length; j++)
        {
            int max = arr[0];
            int index = 0;

            for (int i = 0; i <= arr.length - j - 1; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }

            int temp = arr[index];
            arr[index] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
