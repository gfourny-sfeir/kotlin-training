package fr.training.kotlin.designpattern.strategy.java;

public record FormField(String name,  String value, Validator validator) {

    public boolean isValid() {
        return validator.isValid(value);
    }
}
