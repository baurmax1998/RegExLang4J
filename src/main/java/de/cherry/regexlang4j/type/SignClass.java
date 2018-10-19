package de.cherry.regexlang4j.type;

import de.cherry.regexlang4j.creator.QuantifierCreator;

import java.util.function.Function;

public class SignClass {

    private String signClassOrChar;
    private Quantifier quantifier;
    private QuantifierMode quantifierMode = QuantifierMode.Greedy;


    public SignClass setQuantifier(Function<QuantifierCreator, Quantifier> creatorQuantifier
            , QuantifierMode quantifierMode) {
        this.quantifier = creatorQuantifier.apply(QuantifierCreator.getInstance());
        this.quantifierMode = quantifierMode;
        return this;
    }


    public SignClass setQuantifier(Function<QuantifierCreator, Quantifier> creatorQuantifier) {
        return this.setQuantifier(creatorQuantifier, QuantifierMode.Greedy);
    }


    public SignClass(String signClassOrChar) {
        this.signClassOrChar = signClassOrChar;
    }

    public String build() {
        return null;
    }
}
