package de.cherry.regexlang4j.type;

import de.cherry.regexlang4j.creator.QuantifierCreator;

import java.util.function.Function;

public class Section {
    private String regex;

    private Quantifier quantifier;
    private QuantifierMode quantifierMode = QuantifierMode.Greedy;


    public Section setQuantifier(Function<QuantifierCreator, Quantifier> creatorQuantifier
            , QuantifierMode quantifierMode) {
        this.quantifier = creatorQuantifier.apply(QuantifierCreator.getInstance());
        this.quantifierMode = quantifierMode;
        return this;
    }


    public Section setQuantifier(Function<QuantifierCreator, Quantifier> creatorQuantifier) {
        return this.setQuantifier(creatorQuantifier, QuantifierMode.Greedy);
    }


    public Section(String regex) {
        this.regex = regex;
    }

    public Section(){

    }


    public Section startMatcher(){

        return this;
    }


    public Section endMatcher(){

        return this;
    }


    public String build() {
        return null;
    }
}
