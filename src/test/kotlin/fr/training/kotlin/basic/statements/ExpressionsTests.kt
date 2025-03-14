package fr.training.kotlin.basic.statements

import fr.training.kotlin.basic.statements.JavaExpressions.JavaVehicule
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ExpressionsTests {

    private val javaExpressions = JavaExpressions()
    private val kotlinExpressions = KotlinExpressions()

    companion object {
        @JvmStatic
        fun prepareJavaObjects(): Stream<Arguments> = Stream.of(
            Arguments.of(JavaVehicule.Renault(4), "La voiture Renault a 4 roues"),
            Arguments.of(JavaVehicule.Suzuki(2), "La moto Suzuki a 2 roues")
        )

        @JvmStatic
        fun prepareKotlinObjects(): Stream<Arguments> = Stream.of(
            Arguments.of(KotlinVehicule.Renault(4), "La voiture Renault a 4 roues"),
            Arguments.of(KotlinVehicule.Suzuki(2), "La moto Suzuki a 2 roues")
        )

        @JvmStatic
        fun prepareJavaTernaryObjects(): Stream<Arguments> = Stream.of(
            Arguments.of(JavaVehicule.Renault(4), "N'est pas une moto Suzuki"),
            Arguments.of(JavaVehicule.Suzuki(2), "La moto Suzuki a 2 roues")
        )

        @JvmStatic
        fun prepareKotlinTernaryObjects(): Stream<Arguments> = Stream.of(
            Arguments.of(KotlinVehicule.Renault(4), "N'est pas une moto Suzuki"),
            Arguments.of(KotlinVehicule.Suzuki(2), "La moto Suzuki a 2 roues")
        )
    }

    @ParameterizedTest
    @MethodSource("prepareJavaObjects")
    fun `switch statements with Java`(vehicle: JavaVehicule, expected: String) {
        val result = javaExpressions.switchStatement(vehicle)

        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @MethodSource("prepareKotlinObjects")
    fun `when expressions with Kotlin`(vehicle: KotlinVehicule, expected: String) {
        val result = kotlinExpressions.whenExpression(vehicle)

        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @MethodSource("prepareJavaTernaryObjects")
    fun `if expression with Java`(vehicle: JavaVehicule, expected: String) {
        val result = javaExpressions.ternaryStatement(vehicle)

        assertThat(result).isEqualTo(expected)
    }

    @ParameterizedTest
    @MethodSource("prepareKotlinTernaryObjects")
    fun `if expression with Kotlin`(vehicle: KotlinVehicule, expected: String) {
        val result = kotlinExpressions.ifExpression(vehicle)

        assertThat(result).isEqualTo(expected)
    }
}
