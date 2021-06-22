package com.bridgelabz;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the range:.........");
        int range = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        //Adding a and b
        for(int i = 2;	i <= range;	i++)
        {
            c = a + b;
            //printin the fibonacci series
            if(c<=range)
            {
                System.out.println(c);
                a=b;
                b=c;
            }
        }

    }
}
