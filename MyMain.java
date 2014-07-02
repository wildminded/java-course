package com.lesson;

import com.lesson.Field;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Hello");
        Field inst = new Field();
        System.out.println("this is desk before playing: ");
        inst.arrayShow();

        Player first = new Player();
        Player second = new Player();
        System.out.println("So, lets play\nEnter first player name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        first.setName(name);
        System.out.print("Enter your type:");
        int typepInt = in.nextInt();
        char type = (char) typeInt;
        first.setType(type);
    }

    public boolean checkWin(char[][] desk){
        boolean answer = false;
        ///////////////
        for ( int i = 1, j = 1; j < Field.ARRAY_SIZE; i++, j++ ) {
            if (desk[i][j] == desk[i-1][j-1]) {
                answer = true;
            } else {
                answer = false;
            }
        }

        if (answer == true) {
            return answer;
        }
        ///////////////
        for ( int i = 0, j = 1; j < Field.ARRAY_SIZE; j++ ) {
            if (desk[i][j] == desk[i][j-1]) {
                answer = true;
            } else {
                answer = false;
            }
        }

        if (answer == true) {
            return answer;
        }
        ///////////////
        for ( int i = 1, j = 0; j < Field.ARRAY_SIZE; i++ ) {
            if (desk[i][j] == desk[i-1][j]) {
                answer = true;
            } else {
                answer = false;
            }
        }

        if (answer == true) {
            return answer;
        }

        return answer;
    }
}
