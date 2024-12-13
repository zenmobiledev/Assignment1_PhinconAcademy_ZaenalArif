package presentation.feature

import utils.Convert
import utils.TransactionTracker

class IncomeAndExpense(private val finance: TransactionTracker) {
    // Input Pemasukan dan Pengeluaran
    fun incomeFeature() {
        print("Input Pemasukan: ")
        val inputIncome = Convert.stringToInt()
        print("Input Keterangan: ")
        val inputInformation = readlnOrNull() ?: ""

        if (inputIncome != 0 && inputInformation != "") {
            finance.addIncome(
                amountIncome = inputIncome,
                info = inputInformation
            )
            println("Input pemasukan berhasil di rekam!")
        } else {
            println("Input yang kamu masukan salah atau kosong!")
        }
    }

    fun expenseFeature() {
        print("Input Pengeluaran: ")
        val inputExpense = Convert.stringToInt()
        print("Input Keterangan: ")
        val inputInformation = readlnOrNull() ?: ""

        if (inputExpense != 0 && inputInformation == "") {
            finance.addExpense(
                amountExpense = inputExpense,
                info = inputInformation
            )

            println("Input pengeluaran berhasil di rekam!")
        } else {
            println("Input yang kamu masukan salah atau kosong!")
        }
    }
}