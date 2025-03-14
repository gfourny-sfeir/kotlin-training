package fr.training.kotlin.designpattern.factory.java;

public class MarkdownLink extends Link {

    protected MarkdownLink(String text, String url) {
        super(text, url);
    }

    @Override
    public String render() {
        return "[%s](%s)".formatted(text, url);
    }
}
