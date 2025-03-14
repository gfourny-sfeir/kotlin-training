package fr.training.kotlin.designpattern.strategy.java;

@FunctionalInterface
public interface Validator {

    boolean isValid(String value);
}
