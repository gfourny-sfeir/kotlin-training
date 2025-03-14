package fr.training.kotlin.advanced.concurrent

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.io.IOException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class Apis {
    private val httpClient: HttpClient = HttpClient.newBuilder().build()
    private val mapper = ObjectMapper().registerKotlinModule()

    fun fetchPreferences(): Preferences {
        val request = buildRequest("/preferences")

        return sendHttpRequest(request, Preferences::class.java)
    }

    fun fetchBeer(pref: Preferences): Beer {
        val request = buildRequest("/beer/" + pref.favoriteBeerType)

        return sendHttpRequest(request, Beer::class.java)
    }

    fun fetchVodka(): Vodka {
        val request = buildRequest("/vodka")

        return sendHttpRequest(request, Vodka::class.java)
    }

    private fun <T> sendHttpRequest(request: HttpRequest, clazz: Class<T>): T {
        try {
            val response = httpClient.send(request, HttpResponse.BodyHandlers.ofString())
            return mapper.readValue(response.body(), clazz)
        } catch (e: IOException) {
            Thread.currentThread().interrupt()
            throw RuntimeException(e)
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
            throw RuntimeException(e)
        }
    }

    companion object {
        private const val BASE_URL = "http://localhost:8081"

        private fun buildRequest(requestUrl: String): HttpRequest {
            return HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + requestUrl))
                .GET()
                .build()
        }
    }
}
