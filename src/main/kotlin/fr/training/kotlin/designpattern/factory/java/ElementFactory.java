package fr.training.kotlin.designpattern.factory.java;

public interface ElementFactory {

    Paragraph createParagraph(String text);
    Heading createHeading(Integer level, String text);
    Link createLink(String text, String url);
}
