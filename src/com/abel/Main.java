package com.abel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myscanner=new Scanner(System.in);
        System.out.println("enter what you wanna do:  " + "(+ ,- ,*, /)");
        String sign=myscanner.nextLine();
        int a,b;
        System.out.println("enter two numbers: ");
        a=myscanner.nextInt();
        b=myscanner.nextInt();
        switch (sign){
            case "+":
                System.out.println("sum is: "+( a+b));
                break;
            case"-":
                System.out.println("subtraction is: "+ (a-b));
                break;
            case"*":
                System.out.println("multiplication is: "+(a*b));
                break;
            case"/":
                System.out.println("division is: "+(a/b));
                break;
            default:
                System.out.println("enter proper sign");
                break;
        }

    }
}
