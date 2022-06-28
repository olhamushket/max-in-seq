package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int big = scan.nextInt();
        int input = scan.nextInt();
        while (input != 0) {
            if (input>big) {
                big=input;
            }
            input = scan.nextInt();
        }
                return big;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");



        System.out.println(max());
    }
}
