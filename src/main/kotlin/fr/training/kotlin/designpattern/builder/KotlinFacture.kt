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

class KotlinFactureBuilder {
    var id: String? = null
    var fournisseur: String? = null
    var montant: BigDecimal? = null

    fun build(): KotlinFacture = KotlinFacture(
        id ?: throw IllegalArgumentException("id must be provided"),
        fournisseur ?: throw IllegalArgumentException("fournisseur must be provided"),
        montant ?: throw IllegalArgumentException("montant must be provided")
    )
}

fun buildKotlinFacture(init: KotlinFactureBuilder.() -> Unit): KotlinFacture = KotlinFactureBuilder().apply(init).build()
