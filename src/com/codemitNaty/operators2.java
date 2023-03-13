package com.codemitNaty;

import java.util.Scanner;

public class operators2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();
        long re;

        System.out.println();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': re = n1 + n2 + n3;
                System.out.println(n1 + " " + op + " " + n2 + " " + op + " " + n3 + " = ");
            System.out.println(re);
            break;
            case '-': re = n1 - n2 - n3;
                System.out.println(n1 + " " + op + " " + n2 + " " + op + " " + n3 + " = ");
            System.out.println(re);
            break;
            case '*': re = n1 * n2 * n3;
                System.out.println(n1 + " " + op + " " + n2 + " " + op + " " + n3 + " = ");
            System.out.println(re);
            break;
            case '/': re = n1 / n2 / n3;
                System.out.println(n1 + " " + op + " " + n2 + " " + op + " " + n3 + " = ");
            System.out.println(re);
            break;
            default :
                System.out.println("Error.");
        }

        System.out.println();

    }
}
