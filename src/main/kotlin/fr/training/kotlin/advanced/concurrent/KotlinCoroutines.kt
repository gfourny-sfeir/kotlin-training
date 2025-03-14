package fr.training.kotlin.advanced.concurrent

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

/**
 * En s'appuyant sur l'implémentation de [JavaConcurrent], implémenter la méthode command() en utilisant les coroutines.
 *
 * Vous trouverez l'utilisation des coroutines sur la [documentation de Kotlin](https://kotlinlang.org/docs/coroutines-basics.html)
 */
class KotlinCoroutines(val apis: Apis) {

    fun command(): Dilly {
        return runBlocking(Dispatchers.IO) {
            coroutineScope {
                val preferences = async { apis.fetchPreferences() }
                val vodka = async { apis.fetchVodka() }
                val beer = async { apis.fetchBeer(preferences.await()) }

                Dilly(beer.await(), vodka.await())
            }
        }
    }
}
