package fr.training.kotlin.advanced.concurrent

/**
 * En s'appuyant sur l'implémentation de [JavaConcurrent], implémenter la méthode command() en utilisant les coroutines.
 *
 * Vous trouverez l'utilisation des coroutines sur la [documentation de Kotlin](https://kotlinlang.org/docs/coroutines-basics.html)
 *
 * Tips :
 * - Les méthodes effectuant des requêtes HTTP ne sont pas asynchrones. On doit dans notre code spécifier un type de [Dispatcher](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/)
 * - Une première version simple existe, mais n'est pas optimal, car elle ne repose pas sur la [Strutured Concurrency](https://kotlinlang.org/docs/coroutines-basics.html#structured-concurrency).
 */
class KotlinCoroutines(val apis: Apis) {

    fun command(): Dilly {
        throw UnsupportedOperationException("Not yet implemented")
    }
}
