package fr.training.kotlin.designpattern.factory.java;

public class MarkdownElementFactory implements ElementFactory {
    @Override
    public Paragraph createParagraph(String text) {
        return new MarkdownParagraph(text);
    }

    @Override
    public Heading createHeading(Integer level, String text) {
        return new MarkdownHeading(level, text);
    }

    @Override
    public Link createLink(String text, String url) {
        return new MarkdownLink(text, url);
    }
}
