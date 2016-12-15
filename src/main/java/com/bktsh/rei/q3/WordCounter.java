package com.bktsh.rei.q3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
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
