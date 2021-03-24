package chapterSix;

import java.util.Scanner;

public class EvenOrOddMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter a number: ");
            int input = reader.nextInt();
            EvenOrOdd.setFirstInput(input);
            System.out.println("It is even " +EvenOrOdd.isEven(EvenOrOdd.getFirstInput()));
        }
    }
}
