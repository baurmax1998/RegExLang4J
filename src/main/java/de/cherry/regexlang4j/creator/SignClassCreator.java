package de.cherry.regexlang4j.creator;

import de.cherry.regexlang4j.type.Range;
import de.cherry.regexlang4j.type.SignClass;

import java.util.Arrays;
import java.util.function.Function;

public class SignClassCreator {
    public SignClass ANY = new SignClass(".");
    public SignClass A_DIGIT = new SignClass("\\d");
    public SignClass NON_DIGIT = new SignClass("\\D");
    public SignClass A_WHITESPACE = new SignClass("\\s");
    public SignClass NON_WHITESPACE = new SignClass("\\S");
    public SignClass A_WORD_CHARACTER = new SignClass("\\w");
    public SignClass NON_WORD_CHARACTER = new SignClass("\\W");

    public SignClass oneOf(char... chars) {
        return new SignClass("[" + Arrays.toString(chars) + "]");
    }

    public SignClass not(SignClass signClass){
        return null;
    }

    public SignClass between(Range<Character> range) {
        return new SignClass("[" + range.getMin() + '-' + range.getMax() + "]");
    }

    public SignClass and(SignClass one, SignClass other){
        return null;
    }

    public SignClass hasToBeInBoth(SignClass one, SignClass other){
        return null;
    }

    public SignClass beInFirstButNotSecond(SignClass one, SignClass minus){
        return null;
    }


}
