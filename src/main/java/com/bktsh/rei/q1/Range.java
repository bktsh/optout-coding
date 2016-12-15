package com.bktsh.rei.q1;

/**
 * Created by hashem on 12/13/16.
 */
public class Range {

    private final int start;
    private final int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + ']';
    }
}
