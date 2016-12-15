package com.bktsh.rei.q1;

/**
 * Created by hashem on 12/13/16.
 */
public class Range implements Comparable {

    private final int start;
    private final int end;

    /**
     * Construct a range with given start and end values
     *
     * @param start
     * @param end
     */
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Range) {
            return this.start == ((Range) obj).getStart() && this.end == ((Range) obj).getEnd();
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + ']';
    }

    @Override
    public int compareTo(Object obj) {
        Range other = (Range) obj;
        if (this.start == other.getStart() && this.end == other.getEnd()) {
            return 0;
        }
        return this.start < other.getStart() ? -1 : 1;
    }
}
