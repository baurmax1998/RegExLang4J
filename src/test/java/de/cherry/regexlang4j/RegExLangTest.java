package de.cherry.regexlang4j;

import de.cherry.regexlang4j.type.QuantifierMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExLangTest {

    @Test
    void build() {

        String regex = RegExLang
                .add(
                        sectionCreator -> sectionCreator.add(
                                signClassCreator -> signClassCreator.ANY.setQuantifier(
                                        quantifierCreator -> quantifierCreator.ONCE_OR_MORE
                                )
                                , signClassCreator -> signClassCreator.oneOf('@')
                        )
                        , sectionCreator -> sectionCreator.formString("test.com")
                )
                .build();

        assertEquals(".*@test\\.com", regex);

    }
}