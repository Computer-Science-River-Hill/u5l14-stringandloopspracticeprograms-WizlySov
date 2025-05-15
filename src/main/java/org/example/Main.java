package org.example; //DO NOT DELETE

import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
    public static void main(String[] args) {
        
        //BEGIN TO WRITE YOUR CODE HERE
        int x;
        int y;
        String string1;
        String string2;

        Scanner input = new Scanner(System.in);
        Scanner stringinput=new Scanner(System.in);
        System.out.print("Enter your height in inches:");
        x = input.nextInt();
        boolean w=true;
        if (x==1) {
            int sub1;
            int sub2;
            System.out.print("Enter a string:");
            string1 = stringinput.nextLine();
            if (string1.length()>1) {
                System.out.print("Enter beginning index:");
                sub1 = input.nextInt();
                System.out.print("Enter ending index:");
                sub2 = input.nextInt();
                System.out.println("\nOriginal String:\n"+string1);
                System.out.println("\nSubstring:\n"+string1.substring(sub1,sub2));
            }
        }
        else if (x==2) {
            System.out.print("Enter Start:\n");
            int a=input.nextInt();
            System.out.print("Enter End:\n");
            int b=input.nextInt();
            System.out.println(" ");
            while (w==true) {
                if (a<=b) {
                    System.out.println(a);
                    a++;
                if (a>b){
                    w=false;
                }
            }
            }
        }
        else if (x==3) {
            System.out.print("Enter low:\n");
            int a=input.nextInt();
            System.out.print("Enter high:\n");
            int b=input.nextInt();
            int c=b;
            for(y=a;y<b;y++){
                c=c+y;
            }
            System.out.println("sum = "+c);
        }
        else if (x==4){
            System.out.print("Enter a word:");
            string1 = stringinput.nextLine();
            for (y=0;y<string1.length();y++){
                System.out.println(string1);
            }
        }
        else if (x==5){
            System.out.print("Enter first word:");
            string1 = stringinput.nextLine();
            System.out.print("Enter second word:");
            string2 = stringinput.nextLine();
            int count=30-(string1.length()+string2.length());
            System.out.print(string1);
            for (y=0;y<count;y++){
                System.out.print(".");
            }
            System.out.print(string2);
        }
        else if (x==6){
            System.out.print("How many integers will be added:\n");
            y=input.nextInt();
            int count=0;
            for(int a=0;a<y;a++){
                System.out.print("Enter integer:\n");
                int b=input.nextInt();
                count=count+b;
            }
            System.out.println("The sum is "+count);
        }
        else if (x==7){
            System.out.print("Weight of order\n");
            double weight=input.nextDouble();
            if (weight<=10) {
                System.out.println("Shipping cost: $3.00");
            }
            if (weight>10) {
                NumberFormat money = NumberFormat.getCurrencyInstance();
                double cost=3+((weight-10)*.25);
                System.out.println("Shipping cost: "+money.format(cost));
            }
            if (weight<0) {
                System.out.println("bye");
            }
        }
        input.close();
        stringinput.close();
    }
}

