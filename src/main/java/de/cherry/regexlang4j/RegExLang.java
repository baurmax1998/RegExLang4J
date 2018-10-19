package de.cherry.regexlang4j;

import de.cherry.regexlang4j.creator.SectionCreator;
import de.cherry.regexlang4j.type.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RegExLang {

    private List<Section> sections = new ArrayList<Section>();
    private static SectionCreator sectionHelper = new SectionCreator();

    private RegExLang() {
    }

    @SafeVarargs
    public static RegExLang add(Function<SectionCreator, Section>... sectionCreators) {
        RegExLang regExLang = new RegExLang();
        for (Function<SectionCreator, Section> sectionCreator : sectionCreators) {
            Section section = sectionCreator.apply(sectionHelper);
            regExLang.sections.add(section);
        }
        return  regExLang;
    }

    public String build(){
        StringBuilder regexBuilder = new StringBuilder();
        for (Section section : sections) {
            regexBuilder.append(section.build());
        }
        return regexBuilder.toString();
    }
}
