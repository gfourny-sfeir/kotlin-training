package fr.training.kotlin.designpattern.factory.java;

public abstract class Heading implements Element {
    protected final int level;
    protected final String text;

    protected Heading(int level, String text) {

        if (level < 1 || level > 6) {
            throw new IllegalArgumentException("Heading Level must be between 1 and 6");
        }

        this.level = level;
        this.text = text;
    }
}
