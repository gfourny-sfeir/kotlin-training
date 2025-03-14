package fr.training.kotlin.designpattern.factory.kotlin

/**
 * À partir de l'implémentation Java du pattern Factory, implémentez ce pattern en utilisant les fonctionnalités de Kotlin.
 * Toute l'implémentation peut être effectuée dans ce fichier.
 *
 * Documentation :
 *  - [Héritage en Kotlin](https://kotlinlang.org/docs/inheritance.html)
 *  - [Constructor et init block](https://kotlinlang.org/docs/classes.html#constructors)
 */


// Product
//TODO décommentez et implémentez Heading, HtmlElementFactory et MarkdownElementFactory

/*
sealed interface Element {
    val render: () -> String
}

class Paragraph(override val render: () -> String) : Element

class Heading(private val level: Int, private val doRender: (level: Int) -> String) : Element {

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
}

object MarkdownElementFactory : ElementFactory {
}*/
