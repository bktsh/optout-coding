package com.bktsh.rei.q3;

/**
 * This class is designed to solve: backward sentence printing. Here is the way it solves the problem:
 * 1. Break down the sentence into words (array of strings)
 * 2. Concat items of the array from tail to head and form the reversed sentence and return it
 * <p>
 * Edge cases:
 * a) In case the input is empty or null return it
 * Assumpption:
 * I. This algrithm assumes the words are separated by single space.
 * <p>
 * Created by hashem on 12/12/16.
 */
public class BackwardPrinter {

    /**
     * Reverse words inside a string, without chanaging characters order in a single word
     * @param input
     * @return
     */
    public String backwardSentence(String input) {
        if (input == null || "".equalsIgnoreCase(input.trim())){
            System.out.println("Input was empty, returning!");
            return input;
        }
        System.out.println("   Input Sentence: "+ input);
        String [] arrayOfWords = input.split(" ");
        String output = concatInReverse(arrayOfWords);
        System.out.println("Reversed Sentence: "+ output);
        return output;
    }

    private String concatInReverse(String[] arrayOfWords) {
        StringBuilder sb =  new StringBuilder();
        for(int i = arrayOfWords.length -1 ; i >=0 ; i--){
            sb.append(arrayOfWords[i]);
            if( i > 0) {//don't append last space!
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
