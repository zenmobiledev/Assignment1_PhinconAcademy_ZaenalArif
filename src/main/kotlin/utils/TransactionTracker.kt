package utils

import data.Finance
import data.TransactionType

object TransactionTracker {
    private val transaction = mutableListOf<Finance>()
    private var income = 0
    private var expense = 0

    fun addIncome(amountIncome: Int, info: String) {
        income += amountIncome
        transaction.add(
            Finance(
                transactionType = TransactionType.INCOME,
                amount = amountIncome,
                information = info
            )
        )
    }

    fun addExpense(amountExpense: Int, info: String) {
        expense += amountExpense
        transaction.add(
            Finance(
                transactionType = TransactionType.EXPENSE,
                amount = amountExpense,
                information = info
            )
        )
    }
}