package com.mohan.random;

import java.util.Random;

public class RandomDemo {


    public static void main(String[] args) {


        Random random = new Random();

        for(int i =1;i<=20;i++)
            System.out.println(random.nextInt(100));





    }
}
