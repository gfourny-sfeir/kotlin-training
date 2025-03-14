package fr.training.kotlin.designpattern.factory.java;

public class HtmlLink extends Link {

    protected HtmlLink(String text, String url) {
        super(text, url);
    }

    @Override
    public String render() {
        return "<a href=\"%s\">%s</a>".formatted(url, text);
    }
}
