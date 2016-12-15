package com.bktsh.rei.q3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class is designed to solve: Counting words in a given text. Here is the way it solves the problem:
 * 1. Break down the sentence into words (array of strings)
 * 2. return length of the array
 * <p>
 * Edge cases:
 * a) In case the input is empty or null return 0
 * <p>
 * Assumpption:
 * I. This algrithm assumes the words are separated by single space.
 * II. A word a sequence of non-empty(tab,return,space) characters.
 * <p>
 * Created by hashem on 12/12/16.
 */
public class WordCounter {

    /**
     * Coutnt number of words inside a given string
     *
     * @param input
     * @return
     */
    public int countWords(String input) {
        if (input == null || "".equalsIgnoreCase(input.trim())) {
            return 0;
        }
        return Arrays.stream(input.split(" ")).filter(s -> !"".equals(s.trim())).collect(Collectors.toList()).size();
    }
}
