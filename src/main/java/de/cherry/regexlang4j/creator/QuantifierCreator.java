package de.cherry.regexlang4j.creator;

import de.cherry.regexlang4j.type.Quantifier;

public class QuantifierCreator {

    private static QuantifierCreator ourInstance = new QuantifierCreator();

    public static QuantifierCreator getInstance() {
        return ourInstance;
    }

    private QuantifierCreator() {
    }

    public Quantifier ONCE_OR_NOT = new Quantifier(".");
    public Quantifier ZERO_OR_MORE = new Quantifier(".");
    public Quantifier ONCE_OR_MORE = new Quantifier(".");
    public Quantifier EXACTLY(int times) {
        return new Quantifier("");
    }
    public Quantifier AT_LEAST(int times) {
        return new Quantifier("");
    }
    public Quantifier BETWEEN(int min, int max) {
        return new Quantifier("");
    }
}
