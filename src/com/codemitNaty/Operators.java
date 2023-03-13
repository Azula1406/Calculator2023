package com.codemitNaty;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int n1;
      int n2;
      int n3;
      String operation;


        System.out.println("First number: ");
        n1 = input.nextInt();

        System.out.println("second number: ");
        n2 = input.nextInt();

        System.out.println("Third number: ");
        n3 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Operation: ");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println((n1 + " " + " + " + " " + n2 + " " + " + " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 + n2 + n3));
        }
        else if (operation.equals("-")) {
            System.out.println((n1 + " " + " - " + " " + n2 + " " + " - " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 - n2 - n3));
        }
        else if (operation.equals("*")) {
            System.out.println((n1 + " " + " * " + " " + n2 + " " + " * " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 * n2 * n3));
        }
        else if (operation.equals("/")) {
            System.out.println((n1 + " " + " / " + " " + n2 + " " + " / " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 / n2 / n3));
        }
        else if (operation.equals("+-")) {
            System.out.println((n1 + " " + " + " + " " + n2 + " " + " - " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 + n2 - n3));
        }
        else if (operation.equals("+*")) {
            System.out.println((n1 + " " + " + " + " " + n2 + " " + " * " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 + n2 * n3));
        }
        else if (operation.equals("+/")) {
            System.out.println((n1 + " " + " + " + " " + n2 + " " + " / " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 + n2 / n3));
        }
        else if (operation.equals("-+")) {
            System.out.println((n1 + " " + " - " + " " + n2 + " " + " + " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 - n2 + n3));
        }
        else if (operation.equals("-*")) {
            System.out.println((n1 + " " + " - " + " " + n2 + " " + " * " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 - n2 * n3));
        }
        else if (operation.equals("-/")) {
            System.out.println((n1 + " " + " - " + " " + n2 + " " + " / " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 - n2 / n3));
        }
        else if (operation.equals("*+")) {
            System.out.println((n1 + " " + " * " + " " + n2 + " " + " + " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 * n2 + n3));
        }
        else if (operation.equals("*-")) {
            System.out.println((n1 + " " + " * " + " " + n2 + " " + " - " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 * n2 - n3));
        }
        else if (operation.equals("*/")) {
            System.out.println((n1 + " " + " * " + " " + n2 + " " + " / " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 * n2 / n3));
        }
        else if (operation.equals("/*")) {
            System.out.println((n1 + " " + " / " + " " + n2 + " " + " * " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 / n2 * n3));
        }
        else if (operation.equals("/+")) {
            System.out.println((n1 + " " + " / " + " " + n2 + " " + " + " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 / n2 + n3));
        }
        else if (operation.equals("/-")) {
            System.out.println((n1 + " " + " / " + " " + n2 + " " + " - " + " " + n3 + " = "));
            System.out.println("Result: " + (n1 / n2 - n3));
        }
        else {
            System.out.println("Wrong!!!");
        }
    }
}
