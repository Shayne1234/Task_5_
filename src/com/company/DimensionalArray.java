package com.company;

public class DimensionalArray {
    public static void main(String[]args){
        int mtrx[][] = new int[10][10];

        //for loop , used to add numbers from 1 to 9 to diagonal ;

        System.out.println("Dianogal of the matrix are : ");
        for (int i = 0; i < mtrx.length; i++) {


            int rnd = (int)(Math.random() * 9 + 1);
            mtrx[i][i]=rnd;
            System.out.print("\n"+mtrx[i][i]+" ");
        }


        for (int i = 0; i < mtrx.length; i++){
            //second for statement for columns
            for (int j = 0; j < mtrx.length; j++) {
            }
        }
    }
}
