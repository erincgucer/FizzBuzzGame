package com.serviceflow.utils;

/**
 * Created by egucer on 01-May-17.
 */
public class GameUtils {

    private static String ERROR_MESSAGE = "Please provide a number that is higher than zero";

    public static String calculateFizzBuzz (Long number) {

        //Used StringBuilder because its performance is better than String for concatenation operations
        StringBuilder result = new StringBuilder();

        //check if number is valid
        if(number == null || number <= 0) {
            return ERROR_MESSAGE;
        }

        for(int i = 1; i <= number; i++) {
            StringBuilder word = new StringBuilder("");
            if(i%3==0){
                word.append("Fizz");
            }
            if(i%5==0){
                word.append("Buzz");
            }
            if(word.toString().equals("")){
                word.append(i);
            }
            word.append(" ");
            result.append(word);
        }

        return result.toString();
    }

}
