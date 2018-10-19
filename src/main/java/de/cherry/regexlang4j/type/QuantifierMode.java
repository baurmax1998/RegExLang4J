package de.cherry.regexlang4j.type;

public enum QuantifierMode {
    //matches the longest matching group.
    Greedy(""),
    //matches the shortest group.
    Reluctant("?"),
    //longest match or bust (no backoff).
    Possessive("x");

    private String token;

    QuantifierMode(String token) {

        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
