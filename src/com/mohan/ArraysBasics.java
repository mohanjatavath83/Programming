package com.mohan;

import java.util.Random;

public class ArraysBasics {


    public static void main(String[] args) {


        Random random = new Random();
        int[] arr = new int[5];

        for(int i =0;i<arr.length;i++) {
            arr[i]=random.nextInt(100);
        }

        System.out.println();

        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        int sum = 0;

        for(int i =0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }


        System.out.println("\narray sum  = "+sum);











    }
}
