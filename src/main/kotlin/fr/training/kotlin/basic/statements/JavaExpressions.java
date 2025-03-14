package fr.training.kotlin.basic.statements;

public class JavaExpressions {

    public sealed interface JavaVehicule {
        record Suzuki(int numberOfWheels) implements JavaVehicule {}
        record Renault(int numberOfWheels) implements JavaVehicule { }
    }

    public String switchStatement(JavaVehicule javaVehicule) {
        return switch (javaVehicule) {
            case JavaVehicule.Suzuki suzuki -> "La moto Suzuki a %s roues".formatted(suzuki.numberOfWheels);
            case JavaVehicule.Renault renault -> "La voiture Renault a %s roues".formatted(renault.numberOfWheels);
        };
    }

    public String ternaryStatement(JavaVehicule javaVehicule) {
        return javaVehicule instanceof JavaVehicule.Suzuki suzuki ? "La moto Suzuki a %s roues".formatted(suzuki.numberOfWheels) : "N'est pas une moto Suzuki";
    }
}
