package fr.training.kotlin.designpattern.factory.kotlin

import org.junit.jupiter.api.Test

class KotlinFactoryPatternTest {

    @Test
    fun `More concise Factory Pattern with Kotlin`() {

        // TODO décommenter le test et implémenter le fichier KotlinFactoryPattern.kt
        /*val htmlDocument = Document(HtmlElementFactory)
        htmlDocument.addHeading(1, "Titre du document")
        htmlDocument.addParagraph("Contenu du document")
        htmlDocument.addLink("Lien vers Google", "http://www.google.com")

        val markdownDocument = Document(MarkdownElementFactory)
        markdownDocument.addHeading(1, "Titre du document")
        markdownDocument.addParagraph("Contenu du document")
        markdownDocument.addLink("Lien vers Google", "http://www.google.com")

        assertThat(htmlDocument.render())
            .isEqualTo(
                """
                <h1>Titre du document</h1>
                <p>Contenu du document</p>
                <a href="http://www.google.com">Lien vers Google</a>
            """.trimIndent()
            )

        assertThat(markdownDocument.render())
            .isEqualTo("""
                # Titre du document
                Contenu du document
                [Lien vers Google](http://www.google.com)
            """.trimIndent())*/
    }
}
