package com.company;
import com.sun.source.util.SourcePositions;

import java.lang.reflect.Array;

public class Task_1st {
    public static void main(String[] arg){
        int  numbers[]= new int [10];
        int i;
        for(i=0; i<numbers.length;i++){
            numbers[i]= numbers.length -i-1;
        }
        for (int array:numbers){
            System.out.println(array);
        }
    }
}