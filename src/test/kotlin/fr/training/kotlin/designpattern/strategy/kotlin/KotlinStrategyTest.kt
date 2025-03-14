package fr.training.kotlin.designpattern.strategy.kotlin

import fr.training.kotlin.designpattern.strategy.kotlin.FormField
import fr.training.kotlin.designpattern.strategy.kotlin.emailValidator
import fr.training.kotlin.designpattern.strategy.kotlin.passwordValidator
import fr.training.kotlin.designpattern.strategy.kotlin.userNameValidator
import org.assertj.core.api.SoftAssertions.assertSoftly
import org.junit.jupiter.api.Test

class KotlinStrategyTest {

    @Test
    fun `Modern Strategy Pattern with Kotlin`() {

        val emailField = FormField("email", "test@example.com", emailValidator)
        val userNameField = FormField("username", "test", userNameValidator)
        val passwordField = FormField("password", "password123", passwordValidator)

        assertSoftly {
            it.assertThat(emailField.isValid()).isTrue
            it.assertThat(userNameField.isValid()).isTrue
            it.assertThat(passwordField.isValid()).isTrue
        }
    }
}
