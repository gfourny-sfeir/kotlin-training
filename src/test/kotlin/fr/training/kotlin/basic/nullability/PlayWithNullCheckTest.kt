package fr.training.kotlin.basic.nullability

import fr.training.kotlin.basic.nullability.PlayWithNullCheck
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.Test
import java.lang.IllegalStateException

class PlayWithNullCheckTest {

    private val playWithNullCheck = PlayWithNullCheck()

    @Test
    fun `Doit retourner une valeur lorsque la valeur n est pas null`() {
        val input = "ValueNotNull"

        val output: String = playWithNullCheck.check(input)

        assertThat(output).isEqualTo(input)
    }

    @Test
    fun `Doit retourner une valeur lorsque la valeur est null`() {
        val input: String? = null

        val output: String = playWithNullCheck.check(input)

        assertThat(output).isNotNull().isEqualTo("Null Value")
    }

    @Test
    fun `Ne doit pas lever d'exception lorsque la valeur n est pas null`() {
        val input = "ValueNotNull"

        val output: String = playWithNullCheck.checkWithException(input)

        assertThat(output).isEqualTo(input)
    }

    @Test
    fun `Doit lever une exception lorsque la valeur est null`() {
        val input: String? = null

        assertThatExceptionOfType(IllegalStateException::class.java)
            .isThrownBy { playWithNullCheck.checkWithException(input) }
            .withMessage("Null Value")
    }
}
