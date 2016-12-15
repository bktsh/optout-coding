package com.bktsh.rei.q3;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by hashem on 12/12/16.
 */
public class WordCounterTest {

    WordCounter subject;

    @Before
    public void setUp() throws Exception {
        subject = new WordCounter();
    }

    @Test
    public void countWordsShouldReturnZeroForBlankString() throws Exception {
        assertThat(subject.countWords("            ")).isZero();
    }

    @Test
    public void countWordsShouldReturnZeroForNull() throws Exception {
        assertThat(subject.countWords(null)).isZero();
    }

    @Test
    public void countWordsShouldReturn2GivenHelloWordAsInput() throws Exception {
        assertThat(subject.countWords("Hello World!")).isEqualTo(2);
    }

 @Test
    public void countWordsShouldReturnWordsCountGivenArbitraryInput() throws Exception {
        assertThat(subject.countWords(" a     quick     brown      fox    ")).isEqualTo(4);
    }

}