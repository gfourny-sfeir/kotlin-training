package fr.training.kotlin.designpattern.factory.java;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Document {

    private final ElementFactory factory;

    private ArrayList<Element> elements = new ArrayList<>();

    public Document(ElementFactory factory) {
        this.factory = factory;
    }

    public void addParagraph(String text){
        elements.add(factory.createParagraph(text));
    }

    public void addHeading(Integer level, String text){
        elements.add(factory.createHeading(level, text));
    }

    public void addLink(String text, String url){
        elements.add(factory.createLink(text, url));
    }

    public String render(){
        return elements.stream()
                .map(Element::render)
                .collect(Collectors.joining("\n"));
    }
}
