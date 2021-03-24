package com.Exercises.chapterFour;

public class MultiplesOf2InfiniteLoop {

    public static void main(String[] args) {
        int product = 2;

        while (product >= 2) {
            product = product * 2;
            System.out.print(product + " ");
        }

//        for(int p = 2; p >= 2; p*=2){
//            System.out.print(p + " ");
//        }
//    }
    }
}