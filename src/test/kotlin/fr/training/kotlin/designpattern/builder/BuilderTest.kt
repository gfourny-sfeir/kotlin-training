package fr.training.kotlin.designpattern.builder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class BuilderTest {

    @Test
    fun `I ❤️ Java builders`() {

        val facture = JavaFacture.Builder()
            .id("id")
            .fournisseur("fournisseur")
            .montant(BigDecimal(100))
            .build()

        assertThat(facture).isNotNull.hasNoNullFieldsOrPropertiesExcept()
    }

    @Test
    fun `I ❤️ even more Kotlin builders`() {

        val facture = buildKotlinFacture {
            id = "id"
            fournisseur = "fournisseur"
            montant = BigDecimal(100)
        }

        assertThat(facture).isNotNull.hasNoNullFieldsOrPropertiesExcept()
    }
}
