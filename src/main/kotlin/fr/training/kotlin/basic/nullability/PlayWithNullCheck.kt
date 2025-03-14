package fr.training.kotlin.basic.nullability

/**
 * En s'appuyant sur les implémentations de [JavaOptional], implémenter leurs équivalences en Kotlin.
 *
 * Vous trouverez les opérations sur la [documentation de Kotlin](https://kotlinlang.org/docs/null-safety.html#elvis-operator)
 */
class PlayWithNullCheck {

    fun check(value: String?): String = value?: "Null Value"

    fun checkWithException(value: String?): String = checkNotNull(value) {"Null Value"}
}
