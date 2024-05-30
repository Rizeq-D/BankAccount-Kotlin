package com.rizeq.backaccount

fun main () {

    val rizeqAccount = BankAccount("Rizeq", 2000000.00)
    println("The name of the holder: ${rizeqAccount.accountHolder} ,with a balance: ${rizeqAccount.balance} €")
    println()

    rizeqAccount.deposit(50000.00)
    rizeqAccount.withdraw(1000000.00)
    rizeqAccount.displayTransactionsHistory()
    rizeqAccount.accountBalance()


}