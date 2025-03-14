package fr.training.kotlin.basic.factory

import fr.training.kotlin.basic.factory.KotlinPcMother
import fr.training.kotlin.basic.factory.PcMother
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ObjectTest {

    @Test
    fun `Creation PC custom`() {

        val javaPc = PcMother.createPc("PC Custom", 8, 8)
        val kotlinPc = KotlinPcMother.createPc("PC Custom", 8, 8)

        assertThat(kotlinPc).isEqualTo(javaPc)
    }

    @Test
    fun `Creation PC standard`() {

        val javaPc = PcMother.createStandardPc()
        val kotlinPc = KotlinPcMother.createStandardPc()

        assertThat(javaPc).isEqualTo(kotlinPc)
    }

    @Test
    fun `Creation PC dev`() {

        val javaPc = PcMother.createDevPc()
        val kotlinPc = KotlinPcMother.createDevPc()

        assertThat(javaPc).isEqualTo(kotlinPc)
    }
}
