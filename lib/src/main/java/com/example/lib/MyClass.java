package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("�п�J���N�T�Ӿ��");

        int a,b,c,d;
        a = scanner.nextInt();

        b = scanner.nextInt();

        c = scanner.nextInt();

        for(int i = 0;i<2;i++){

            if(a>b){

                d=a;

                a=b;

                b=d;

            }

            if (b>c){

                d=b;

                b=c;

                c=d;
            }
        }
        System.out.printf("�Ʀr�Ѥp�ܤj�ƦC��: %d %d %d",a,b,c);
    }
}
