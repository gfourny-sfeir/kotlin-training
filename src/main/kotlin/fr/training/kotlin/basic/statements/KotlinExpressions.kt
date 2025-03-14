package fr.training.kotlin.basic.statements

/**
 * En s'appuyant sur l'implémentation de [JavaExpressions], implémenter l'équivalent en Kotlin.
 *
 * Vous trouverez les opérations sur les documentations Kotlin:
 *  - [When Expression](https://kotlinlang.org/docs/control-flow.html#when-expressions-and-statements)
 *  - [if Expression](https://kotlinlang.org/docs/control-flow.html#if-expression)
 */
sealed interface KotlinVehicule {
    data class Renault(val numberOfWheels: Int): KotlinVehicule
    data class Suzuki(val numberOfWheels: Int): KotlinVehicule
}

class KotlinExpressions {

    fun whenExpression(vehicle: KotlinVehicule): String {
        return "Not implemented yet"
    }

    fun ifExpression(vehicle: KotlinVehicule): String {
        return "Not implemented yet"
    }
}
