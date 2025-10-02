package com.pluralsight;

import java.util.Scanner;

public class LoopingExercises {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Select which loop you would like to run (1-3): ");
        int loopSelect = sc.nextInt();

        switch (loopSelect) {
            case 1:
                WhileLoop.main(args);
                break;
            case 2:
                ForLoop.main(args);
                break;
            case 3:
                DoWhileLoop.main(args);
                break;
        }
    }
}
