package com.company;
import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
                int [] array = new int[10];
                Random rn = new Random();


                for (int i = 0; i < 100; i++) {
                    array[i] =  rn.nextInt(0,100);
                }
                // accessing the elements of the specified array
                for (int Array : array) {
                    System.out.println(Arrays.toString(array));

        }





    }
}
