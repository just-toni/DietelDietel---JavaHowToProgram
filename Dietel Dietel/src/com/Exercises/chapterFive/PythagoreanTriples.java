package com.Exercises.chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {

        System.out.println("Adjacent\tOpposite\tHypotenuse");

        for(int i = 1; i <=500; i++){
            for(int j = 1; j <= 500; j++){
                for (int k = 1; k <= 500; k++){
                    if((i*i) + (j*j) == (k*k)){
                        System.out.println(i + "\t\t\t" + j + "\t\t\t" + k);
                    }
                }
            }
        }
    }
}
