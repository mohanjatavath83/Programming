package com.mohan.array;

import java.util.Random;

public class SecondMaximumElementInArray {

    public static void main(String[] args) {


        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1000);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


        int max1;
        int max2;

        if(arr[0]>arr[1]) {
            max1=arr[0];
            max2 =arr[1];
        }else
        {
            max1 = arr[1];
            max2=arr[0];
        }


        for (int i = 2; i < arr.length; i++) {

            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2 && arr[i]!=max1)
            {
                max2 = arr[i];
            }
        }

        System.out.println("\nmaximum element in this array = " + max1);
        System.out.println("\nsecond maximum element in this array = " + max2);

    }
}
