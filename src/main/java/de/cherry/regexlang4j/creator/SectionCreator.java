package de.cherry.regexlang4j.creator;

import de.cherry.regexlang4j.type.Section;
import de.cherry.regexlang4j.type.SignClass;

import java.util.function.Function;

public class SectionCreator {

    private static SectionCreator sectionHelper = new SectionCreator();
    private static SignClassCreator signClassCreatorHelper = new SignClassCreator();



    public Section formString(String string){
        Section section = new Section(string);
        return section;
    }


    @SafeVarargs
    public final Section add(Function<SignClassCreator, SignClass>... signClassCreators){
        StringBuilder regexBuilder = new StringBuilder();
        for (Function<SignClassCreator, SignClass> signClassCreator : signClassCreators) {
            SignClass signClass = signClassCreator.apply(signClassCreatorHelper);
            regexBuilder.append(signClass.build());
        }
        return new Section(regexBuilder.toString());
    }



    @SafeVarargs
    public final Section or(Function<SectionCreator, Section>... sectionCreators){
        StringBuilder regexBuilder = new StringBuilder();

        for (Function<SectionCreator, Section> sectionCreator : sectionCreators) {
            Section section = sectionCreator.apply(sectionHelper);
            regexBuilder.append(section.build());

        }

        return new Section(regexBuilder.toString());
    }
}
