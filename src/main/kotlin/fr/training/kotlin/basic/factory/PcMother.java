package fr.training.kotlin.basic.factory;

public class PcMother {

    private PcMother() {}

    public static Pc createPc(String model, int ram, int cpu) {
        return new Pc(model, ram, cpu);
    }

    public static Pc createStandardPc() {
        return createPc("Standard PC", 16, 8);
    }

    public static Pc createDevPc() {
        return createPc("Dev PC", 32, 16);
    }
}
