package chapterSix;

import java.util.Scanner;

public class MultiplesMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        for(int i = 1; i <=5; i++) {
            System.out.println("Enter a number: ");
            int input = reader.nextInt();
            Multiples.setFirstInput(input);
            System.out.println("Enter a number: ");
            int input2 = reader.nextInt();
            Multiples.setSecondInput(input2);
            System.out.println("Is Multiple " + Multiples.isMultiple(Multiples.getFirstInput(), Multiples.getSecondInput()));
        }
    }
}
