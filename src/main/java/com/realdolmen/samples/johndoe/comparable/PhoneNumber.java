package com.realdolmen.samples.janolaerts.comparable;

import java.util.Comparator;

import static java.util.Comparator.*;

public class PhoneNumber {

    private int areaCode;
    private int prefix;
    private int lineNum;

    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
            .thenComparingInt(pn -> pn.prefix)
            .thenComparingInt(pn -> pn.lineNum);

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode='" + areaCode + '\'' +
                ", prefix='" + prefix + '\'' +
                ", lineNum='" + lineNum + '\'' +
                '}';
    }
}
