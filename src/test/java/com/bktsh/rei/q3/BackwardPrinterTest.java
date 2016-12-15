package com.bktsh.rei.q3;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * This class will
 * 1. decompose a sentence into words (assuming empty spaces bigger than one are junk).
 * 2. Then It will concat the array items in reverse order.
 * Created by hashem on 12/12/16.
 */
public class BackwardPrinterTest {

    BackwardPrinter subject;

    @Before
    public void setUp() throws Exception {
        subject =  new BackwardPrinter();
    }

    @Test
    public void backwardSentenceShouldReturnWorldHelloGivenHelloWorld() throws Exception {
        String result = subject.backwardSentence("Hello World!");
        assertThat(result).isEqualToIgnoringCase("World! Hello");
    }

    @Test
    public void backwardSentenceShouldReturnReversedInputGivenSampleInput() throws Exception {
        String result = subject.backwardSentence("a quick brown fox");
        assertThat(result).isEqualToIgnoringCase("fox brown quick a");
    }

    @Test
    public void backwardSentenceShouldReturnInputGivenBlankString() throws Exception {
        String result = subject.backwardSentence("");
        assertThat(result).isEmpty();
    }

    @Test
    public void backwardSentenceShouldReturnNullGivenNull() throws Exception {
        String result = subject.backwardSentence(null);
        assertThat(result).isNull();
    }

}