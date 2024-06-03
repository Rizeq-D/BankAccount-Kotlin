package com.rizeq.backaccount

class BankAccount (var accountHolder: String, var balance: Double) {

    private val bankTransactions = mutableListOf<String>()
    init {
        println("The name of the holder: $accountHolder, with a balance: $balance €\n")
        println()
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            bankTransactions.add("$accountHolder has deposited $amount €")
            println(bankTransactions.last())
            println("deposited successful")
            accountBalance()
        }else{
            println("Deposit amount must be positive.")
        }
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            bankTransactions.add("$accountHolder has withdrew $amount €")
            println(bankTransactions.last())
            println("Withdrawal successful")
            accountBalance()
        }else{
            println("The amount that you are withdrawing is bigger than you deposit")
        }
    }

    fun displayTransactionsHistory(){
        println("The transactions for $accountHolder:")
        if (bankTransactions.isEmpty()) {
            println("No transactions available.")
        }else{
            for (transactions in bankTransactions) {
                println(transactions)
            }
        }
    }

    fun accountBalance() {
        println("The current Balance in $accountHolder's account now is: $balance €")
    }

}