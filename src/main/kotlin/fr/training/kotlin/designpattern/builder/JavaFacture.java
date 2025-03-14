package fr.training.kotlin.designpattern.builder;

import java.math.BigDecimal;
import java.util.function.Consumer;

public record JavaFacture(String id, String fournisseur, BigDecimal montant) {


    public static  JavaFacture create(Consumer<JavaFacture.Builder> builder) {
        var factureBuidler = new JavaFacture.Builder();
        builder.accept(factureBuidler);
        return factureBuidler.build();
    }

    static class Builder {
        private String id;
        private String fournisseur;
        private BigDecimal montant;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder fournisseur(String fournisseur) {
            this.fournisseur = fournisseur;
            return this;
        }

        public Builder montant(BigDecimal montant) {
            this.montant = montant;
            return this;
        }

        public JavaFacture build() {
            return new JavaFacture(id, fournisseur, montant);
        }
    }
}


