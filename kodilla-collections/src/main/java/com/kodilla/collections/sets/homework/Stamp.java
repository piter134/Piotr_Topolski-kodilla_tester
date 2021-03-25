package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String StampName;
    private String StampSize;
    private String Stamped;

    public Stamp(String stampName, String stampSize, String stamped) {
        StampName = stampName;
        StampSize = stampSize;
        Stamped = stamped;
    }

    public String getStampName() {
        return StampName;
    }

    public String getStampSize() {
        return StampSize;
    }

    public String getStamped() {
        return Stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return StampName.equals(stamp.StampName) &&
                StampSize.equals(stamp.StampSize) &&
                Stamped.equals(stamp.Stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StampName, StampSize, Stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" + "StampName='" + StampName + '\'' + ", StampSize='"
                + StampSize + '\'' + ", Stamped=" + Stamped + '}';
    }

}

