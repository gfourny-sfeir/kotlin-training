package fr.training.kotlin.designpattern.factory.java;

public abstract class Paragraph implements Element {

    protected final String text;

    public Paragraph(String text) {
        this.text = text;
    }
}
