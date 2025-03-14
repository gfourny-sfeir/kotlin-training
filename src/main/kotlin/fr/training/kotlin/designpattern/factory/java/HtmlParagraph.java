package fr.training.kotlin.designpattern.factory.java;

public class HtmlParagraph extends Paragraph {

    public HtmlParagraph(String text) {
        super(text);
    }

    @Override
    public String render() {
        return "<p>%s</p>".formatted(text);
    }
}
