package fr.training.kotlin.designpattern.builder

import java.math.BigDecimal

/**
 * Implémenter le Builder Pattern en utilisant les fonctionnalités spécifique à Kotlin.
 *
 * Tips :
 *  - Vous aurez besoin de définir une nouvelle classe KotlinFactureBuilder par exemple
 *  - Il faudra aussi créer une fonction globale buildKotlinFacture qui prendra en paramètre une [fonction d'extension](https://kotlinlang.org/docs/extensions.html) de la classe KotlinFactureBuilder
 */
data class KotlinFacture(val id: String, val fournisseur: String, val montant: BigDecimal)
