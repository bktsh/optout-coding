package com.bktsh.rei.q3;

/**
 * Created by hashem on 12/12/16.
 */
public class BackwardPrinter {

    /**
     * Reverse words inside a string, without chanaging characters order in a single word
     *
     * @param input
     * @return
     */
    public String backwardSentence(String input) {
        if (input == null || "".equalsIgnoreCase(input.trim())) {
            System.out.println("Input was empty, returning!");
            return input;
        }
        System.out.println("   Input Sentence: " + input);
        String[] arrayOfWords = input.split(" ");
        String output = concatInReverse(arrayOfWords);
        System.out.println("Reversed Sentence: " + output);
        return output;
    }

    private String concatInReverse(String[] arrayOfWords) {
        StringBuilder sb = new StringBuilder();
        for (int i = arrayOfWords.length - 1; i >= 0; i--) {
            sb.append(arrayOfWords[i]);
            if (i > 0) {//don't append last space!
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
