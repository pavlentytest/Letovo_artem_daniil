package com.company;

public class Main {
    public static void main(String[] args) {
	    int a;
	    a = 100;
	    // простые типы:
        // int, long, byte, short
        // float, double
        // boolean
        // char
        String str = "Hello";
        char b  = '1';
        System.out.print("Hello!");

        int c = 100;
        long d = 900;

        //c = d;
        d = c; //неявное приведение типов

        c = (int)d; // явное приведение типов

        double h = 5.67;
        float i = 5.1f;

        h = i;
        i = (float)h;

        h = c; // 100.0

        if(1==1) {

        } else if(c > 3) {

        } else {

        }

        switch (c) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Default");
                break;
        }

        // тернарный оператор

        int buff = (h>=1000) ? 90 : 99;

        int[] arr1;
        int arr2[];

        arr1 = new int[5]; // 0 0 0 0 0
        for(int j=0;j<arr1.length;j++) {
           // System.out.println(arr1[j]);
        }

        int[][] arr3 = new int[4][4];
        int[] arr4 = {5,6,3,2,12};
        int[][] arr5 = new int[][]{ {4,5}, {6,7} };
        for(int k=0;k<arr5.length;k++) {
            for(int l=0;l<arr5[k].length;l++){
                System.out.print(arr5[k][l] + " ");
            }
            System.out.println();
        }

        while(c>0) {

        }

        do {
            // 1 раз выполнится гарантировано
        } while(h>0);

        // git
        // зарегистрироваться





    }
}
