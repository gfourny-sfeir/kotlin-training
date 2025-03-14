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
        return when (vehicle) {
            is KotlinVehicule.Renault -> "La voiture Renault a ${vehicle.numberOfWheels} roues"
            is KotlinVehicule.Suzuki -> "La moto Suzuki a ${vehicle.numberOfWheels} roues"
        }
    }

    fun ifExpression(vehicle: KotlinVehicule): String {
        return if (vehicle is KotlinVehicule.Suzuki) "La moto Suzuki a ${vehicle.numberOfWheels} roues" else "N'est pas une moto Suzuki"
    }
}
