package fr.training.kotlin.designpattern.strategy.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class JavaStrategyTest {

    @Test
    @DisplayName("Lightweight strategy pattern Java")
    void testLightweightStrategyPatternJava() {
        final var emailField = new FormField("email", "test@example.com", value -> value.contains("@") && value.contains("."));
        final var userNameField = new FormField("username", "test", value -> !value.isEmpty());
        final var passwordField = new FormField("password", "password123", value -> value.length() >= 8);

        assertSoftly(softly -> {
            softly.assertThat(emailField.isValid()).isTrue();
            softly.assertThat(userNameField.isValid()).isTrue();
            softly.assertThat(passwordField.isValid()).isTrue();
        });
    }
}
