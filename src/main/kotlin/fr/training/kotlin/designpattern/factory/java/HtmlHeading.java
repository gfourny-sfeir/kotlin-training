package fr.training.kotlin.designpattern.factory.java;

public class HtmlHeading extends Heading {

    protected HtmlHeading(int level, String text) {
        super(level, text);
    }

    @Override
    public String render() {
        return "<h%d>%s</h%d>".formatted(level, text, level);
    }
}
