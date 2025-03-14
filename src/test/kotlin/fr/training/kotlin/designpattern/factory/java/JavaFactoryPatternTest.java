package fr.training.kotlin.designpattern.factory.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.training.kotlin.designpattern.factory.java.Document;
import fr.training.kotlin.designpattern.factory.java.HtmlElementFactory;
import fr.training.kotlin.designpattern.factory.java.MarkdownElementFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaFactoryPatternTest {

    @Test
    @DisplayName("Utilisation du pattern Factory Java")
    void factoryPatternJava() {

        final var htmlDocument = new Document(new HtmlElementFactory());
        htmlDocument.addHeading(1, "Titre du document");
        htmlDocument.addParagraph("Contenu du document");
        htmlDocument.addLink("Lien vers Google", "http://www.google.com");

        final var markdownDocument = new Document(new MarkdownElementFactory());
        markdownDocument.addHeading(1, "Titre du document");
        markdownDocument.addParagraph("Contenu du document");
        markdownDocument.addLink("Lien vers Google", "http://www.google.com");

        assertThat(htmlDocument.render())
                .isEqualTo("""
                        <h1>Titre du document</h1>
                        <p>Contenu du document</p>
                        <a href="http://www.google.com">Lien vers Google</a>""");

        assertThat(markdownDocument.render())
                .isEqualTo("""
                        # Titre du document
                        Contenu du document
                        [Lien vers Google](http://www.google.com)""");
    }
}
