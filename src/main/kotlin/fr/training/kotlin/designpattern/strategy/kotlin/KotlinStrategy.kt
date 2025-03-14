package fr.training.kotlin.designpattern.strategy.kotlin

/**
 * À partir de l'implémentation du pattern strategy situé dans le package Java, effectuer l'implémentation en Kotlin.
 *
 * Tips :
 *   - Vous pouvez écrire toute l'implémentation dans ce fichier
 *   - Pensez qu'il est possible en Kotlin de faire du Function as First Class (pas besoin d'écrire une classe pour définir des fonctions)
 *
 * Documentation utile :
 *   - [Kotlin typealias](https://kotlinlang.org/docs/type-aliases.html)
 */

typealias Validator = (field: String) -> Boolean

val emailValidator: Validator = { it.contains("@") && it.contains(".") }
val userNameValidator: Validator = { it.isNotEmpty() }
val passwordValidator: Validator = { it.length >= 8 }

data class FormField(val name: String, val value: String, private val validator: Validator) {
    fun isValid() = validator(value)
}
