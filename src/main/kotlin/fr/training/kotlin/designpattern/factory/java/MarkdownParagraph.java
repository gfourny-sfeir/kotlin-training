package fr.training.kotlin.designpattern.factory.java;

public class MarkdownParagraph extends Paragraph {

    public MarkdownParagraph(String text) {
        super(text);
    }

    @Override
    public String render() {
        return text;
    }
}
