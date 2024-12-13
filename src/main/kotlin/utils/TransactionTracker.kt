package utils

import data.Finance

object TransactionTracker {
    private val transaction = mutableListOf<Finance>()
    private var income = 0
    private var expense = 0
    private var information = ""

    fun addIncomeAndExpense(amountInc: Int, amountExp: Int, info: String) {
        income += amountInc
        expense += amountExp
        information = info
        transaction.add(
            Finance(
                income = amountInc,
                expense = amountExp,
                information = info
            )
        )
    }
}