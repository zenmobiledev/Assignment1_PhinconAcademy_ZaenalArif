package presentation.feature

import data.Finance
import utils.Convert
import utils.TransactionTracker

class IncomeAndExpense(private val finance: TransactionTracker) {
    // Input Pemasukan dan Pengeluaran
    fun featureIncomeAndExpense() {
        print("Input Pemasukan: ")
        val inputIncome = Convert.stringToInt()
        print("Input Pengeluaran: ")
        val inputExpense = Convert.stringToInt()
        print("Input Keterangan: ")
        val inputInformation = readlnOrNull() ?: ""

        finance.addIncomeAndExpense(
            amountInc = inputIncome,
            amountExp = inputExpense,
            info = inputInformation
        )

        println("""
            Pemasukan: $inputIncome
            Pengeluaran: $inputExpense
            Keterangan: $inputInformation
        """.trimIndent())
    }
}