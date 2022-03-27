package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenating {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1, str2,result,res2;

        System.out.println("Please enter the first string: ");
        str1= br.readLine();

        System.out.println("Please enter the second string: ");
        str2= br.readLine();

        result=str1.concat(str2);
        System.out.println("The first concatenated string is: " +result);

        res2=str2.concat(str1);
        System.out.println("The second concatenated string is: "+ res2);

        if(result.equals(res2)){
            System.out.println("The concatenated words or strings are equal!");
        }else {
            System.out.println("The concatenated words or strings are not equal!");
        }    }
}
