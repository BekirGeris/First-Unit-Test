package com.begers.firsttest

class Tax {

    // TDD --> Text Driven Development

    fun calculateTax(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome - calculateTax(grossIncome, taxRate)
    }
}