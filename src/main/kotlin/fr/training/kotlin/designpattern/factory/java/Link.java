package fr.training.kotlin.designpattern.factory.java;

public abstract class Link implements Element {

    protected final String text;
    protected final String url;

    protected Link(String text, String url) {
        this.text = text;
        this.url = url;
    }
}
