package com.Exercises.chapterSix;

public class Power {

    public static int power(int num1, int num2) {
        int answer = 1;
        for(int i =1; i <= num2; i++){
            answer *= num1;
        }
        return answer;
    }

    public static int power(int num1, int num2, int num3){
        int answer = 1;
        int answer2 = 1;
        for(int i = 1; i <= num3; i++){
            answer *= num2;
        }
        for(int i = 1; i <= answer; i++){
            answer2 *= num1;
        }
        return answer2;
    }

    public static int power(int num1, int num2, int num3, int num4){
        int answer = 1;
        int answer2 = 1;
        int answer3 = 1;
        for(int i = 1; i <= num4; i++){
            answer *= num3;
        }
        for(int i = 1; i <= answer; i++) {
            answer2 *= num2;
        }
        for(int i = 1; i <= answer2; i++){
            answer3 *= num1;
        }
        return answer3;
    }

    public static int power(int num1, int num2, int num3, int num4, int num5){
        int answer = 1;
        int answer2 = 1;
        int answer3 = 1;
        int answer4 = 1;
        int i =1;
        while(i <= num5){
        answer *= num4;
        i++;
        }
        while (i <= answer){
            answer2 *= num3;
            i++;
        }
        while(i <= answer2){
            answer3 *= num2;
            i++;
        }
        while(i <= answer3){
            answer4 *= num1;
            i++;
        }
        return  answer4;
    }

    public static int power(int num1, int num2, int num3, int num4, int num5, int num6){
        int answer = 1;
        int answer2 = 1;
        int answer3 = 1;
        int answer4 = 1;
        int answer5 = 1;
        int i = 1;
        for(; i <= num6; i++) {
            answer *= num5;
        }
            for(; i<=num5; i++) {
                answer2 *= num4;
            }
                for(; i <= num4; i++) {
                    answer3 *= num3;
                }
                    for(; i <= num3; i++) {
                        answer4 *= num2;
                    }
                        for (; i <= num2; i++){
                            answer5 *= num1;
        }
        return answer5;
    }

    public static void main(String[] args) {
        long result1 = Power.power(2,16);
        long result2 = Power.power(2,3,2);
        long result3 = Power.power(2,2,2,2);
        long result4 = Power.power(2,2,2,2,1);
        long result5 = Power.power(2,3,4,5,6,7);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

}
