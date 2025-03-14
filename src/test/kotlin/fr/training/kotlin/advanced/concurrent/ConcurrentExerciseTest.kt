package fr.training.kotlin.advanced.concurrent

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.core.WireMockConfiguration
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.SoftAssertions.assertSoftly
import org.awaitility.Awaitility.await
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.time.Duration

internal class ConcurrentExerciseTest {
    private val javaConcurrent = JavaConcurrent()
    private val kotlinCoroutines = KotlinCoroutines(Apis())

    @Test
    fun `Controle la concurrence avec l'API CompletableFuture`() {
        await().atMost(Duration.ofMillis(1900)).untilAsserted {
            val dilly = javaConcurrent.command()
            assertThat(dilly).isNotNull

            assertSoftly { softAssertions ->
                softAssertions.assertThat(dilly.beer).isNotNull
                    .extracting { it.type }
                    .isEqualTo("blond")

                softAssertions.assertThat(dilly.vodka).isNotNull
                    .extracting { it.type }
                    .isEqualTo("deadly")
            }
        }
    }

    @Test
    fun `Controle la concurrence avec les coroutines`() {
        await().atMost(Duration.ofMillis(1900)).untilAsserted {
            val dilly = kotlinCoroutines.command()
            assertThat(dilly).isNotNull

            assertSoftly { softAssertions ->
                softAssertions.assertThat(dilly.beer).isNotNull
                    .extracting { it.type }
                    .isEqualTo("blond")

                softAssertions.assertThat(dilly.vodka).isNotNull
                    .extracting { it.type }
                    .isEqualTo("deadly")
            }
        }
    }

    companion object {
        private val wireMockServer = WireMockServer(WireMockConfiguration.options().port(8081))

        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            wireMockServer.start()
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            wireMockServer.stop()
        }
    }
}
