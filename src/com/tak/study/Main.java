package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int[] arr = new int[num];
            int line = sc.nextInt();

            for(int i = 0; i < line; i++) {

                int start = sc.nextInt();
                int end = sc.nextInt();
                int ballNum = sc.nextInt();

                for(int j = start - 1; j < end; j++)
                {
                    arr[j] = ballNum;
                }
            }
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }

    }

}
