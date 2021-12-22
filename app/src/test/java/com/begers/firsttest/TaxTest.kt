package com.begers.firsttest

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

import org.junit.Test

class TaxTest {

    private lateinit var tax : Tax
    @Before
    fun setup(){
        tax = Tax()
    }

    @After
    fun teardown(){

    }

    @Test
    fun calculateTax() {
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(11)
    }

    @Test
    fun calculateIncome() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}