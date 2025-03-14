package fr.training.kotlin.designpattern.factory.java;

public class MarkdownHeading extends Heading {

    protected MarkdownHeading(Integer level, String text) {
        super(level, text);
    }

    @Override
    public String render() {
        return "#".repeat(level) + " " + text;
    }
}
