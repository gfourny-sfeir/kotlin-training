package fr.training.kotlin.designpattern.factory.java;

public class HtmlElementFactory implements ElementFactory {
    @Override
    public Paragraph createParagraph(String text) {
        return new HtmlParagraph(text);
    }

    @Override
    public Heading createHeading(Integer level, String text) {
        return new HtmlHeading(level, text);
    }

    @Override
    public Link createLink(String text, String url) {
        return new HtmlLink(text, url);
    }
}
