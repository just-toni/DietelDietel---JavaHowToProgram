package com.Exercises.chapterFive.TwelveDaysChristmas;

public class TheTwelveDaysOfChristmasSongWithWhileLoop {
    public static void main(String[] args) {
       int dayCounter = 1;
       while (dayCounter <= 12){
           System.out.printf("Verse %d%n", dayCounter);

           String day = "";
           switch (dayCounter) {
               case 1 -> day = "first";
               case 2 -> day = "second";
               case 3 -> day = "third";
               case 4 -> day = "fourth";
               case 5 -> day = "fifth";
               case 6 -> day = "sixth";
               case 7 -> day = "seventh";
               case 8 -> day = "eighth";
               case 9 -> day = "ninth";
               case 10 -> day = "tenth";
               case 11 -> day = "eleventh";
               case 12 -> day = "twelfth";
           }
           System.out.println("On the " + day + " day of Christmas my true love sent to me");

           switch (dayCounter){
               case 12:
                   System.out.println("Twelve drummers drumming");
               case 11:
                   System.out.println("Eleven pipers piping");
               case 10:
                   System.out.println("Ten lords a-leaping");
               case 9:
                   System.out.println("Nine ladies dancing");
               case 8:
                   System.out.println("Eight maids a-milking");
               case 7:
                   System.out.println("Seven swans a-swimming");
               case 6:
                   System.out.println("Six geese a-laying");
               case 5:
                   System.out.println("Five golden rings");
               case 4:
                   System.out.println("Four calling birds");
               case 3:
                   System.out.println("Three french hens");
               case 2 :
                   System.out.println("Two turtle doves");
               case 1:
                   if (dayCounter == 1){
                       System.out.println("A partridge in a pear tree ");
                   }
                   else {
                       System.out.println("And a partridge in a pear tree");
                   }
                   break;
           }

           dayCounter++;
           System.out.println();
       }
    }
}
