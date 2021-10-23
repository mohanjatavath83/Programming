package com.mohan.array;

import java.util.Random;

public class CopyIntoAnotherArray {

    public static void main(String[] args) {


        int[] arr = new int[30];
        int[] temp = new int[arr.length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(temp[i]+" ");
    }
}
