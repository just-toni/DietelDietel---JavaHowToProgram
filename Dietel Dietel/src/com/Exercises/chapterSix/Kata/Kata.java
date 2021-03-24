package com.Exercises.chapterSix.Kata;

public class Kata {

    public String  findFactorsOfANumber(int input) {
        String result = "";
        for(int i =1; i <= input; i++){
            if(input % i == 0)
                result += i +" ";
        }
        return result;
    }

    public String findFactors(int input){
        String result = "";
        String result2 = "";
        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input; j++){
                if(i * j == input){
                    result += i + " " ;
                    result2 += j + " ";
                }
            }
        }
        return result + result2;
    }


}
