package fr.training.kotlin.basic.nullability;

import java.util.Optional;

public class JavaOptional {

    public String check(String value) {

        return Optional.ofNullable(value)
                .orElse("Null Value");
    }

    public String checkException(String value) {

        return Optional.ofNullable(value)
                .orElseThrow(() -> new IllegalStateException("Null Value"));
    }
}
