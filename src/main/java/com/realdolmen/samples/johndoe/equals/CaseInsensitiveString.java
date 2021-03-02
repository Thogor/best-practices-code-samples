package com.realdolmen.samples.johndoe.equals;

import java.util.Objects;

public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);

        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Test");
    }
}
