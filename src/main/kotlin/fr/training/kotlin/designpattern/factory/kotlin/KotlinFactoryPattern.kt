package fr.training.kotlin.designpattern.factory.kotlin

/**
 * À partir de l'implémentation Java du pattern Factory, implémentez ce pattern en utilisant les fonctionnalités de Kotlin.
 * Toute l'implémentation peut être effectuée dans ce fichier.
 *
 * Documentation :
 *  - [Héritage en Kotlin](https://kotlinlang.org/docs/inheritance.html)
 */

// Product
sealed interface Element {
    val render: () -> String
}

class Paragraph(override val render: () -> String) : Element

/**
 * La surcharge de doRender permet d'utiliser uniquement le level utilisé à l'origine par le constructeur (qui a été validé)
 * Si l'implémentation se faisait comme Paragraph, alors il serait possible de passer un level non conforme à postériori du constructeur.
 */
class Heading(private val level: Int, private val doRender: (level: Int) -> String) : Element {
    init { require(level in 1..6) { "Level must be between 1 and 6" } }
    override val render: () -> String = { doRender(level) }
}

class Link(override val render: () -> String) : Element

// Client
class Document(private val factory: ElementFactory) {
    private val elements = mutableListOf<Element>()

    fun addParagraph(text: String) = elements.add(factory.createParagraph(text))
    fun addHeading(level: Int, text: String) = elements.add(factory.createHeading(level, text))
    fun addLink(text: String, url: String) = elements.add(factory.createLink(text, url))

    fun render() = elements.joinToString("\n") { it.render() }

}

// Abstract Factory
interface ElementFactory {
    fun createParagraph(text: String): Paragraph
    fun createHeading(level: Int, text: String): Heading
    fun createLink(text: String, url: String): Link
}

// Concrete Factories

object HtmlElementFactory : ElementFactory {
    override fun createParagraph(text: String) = Paragraph { "<p>$text</p>" }
    override fun createHeading(level: Int, text: String) = Heading(level) { "<h$it>$text</h$it>" }
    override fun createLink(text: String, url: String) = Link { "<a href=\"$url\">$text</a>" }
}

object MarkdownElementFactory : ElementFactory {
    override fun createParagraph(text: String) = Paragraph { text }
    override fun createHeading(level: Int, text: String) = Heading(level) { "#".repeat(level) + " $text" }
    override fun createLink(text: String, url: String) = Link { "[$text]($url)" }
}
