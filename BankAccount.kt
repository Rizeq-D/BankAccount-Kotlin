package com.rizeq.backaccount

class BankAccount (var accountHolder: String, var balance: Double) {

    private val bankTransactions = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        bankTransactions.add("$accountHolder has deposited $amount €" +
                "\nThe new Balance is $balance €")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            bankTransactions.add("$accountHolder has withdrew $amount €" +
                    "\nThe new Balance is $balance €")
        }else{
            println("The amount that you are withdrawing is bigger than you deposit")
        }
    }

    fun displayTransactionsHistory(){
        println("The transactions for $accountHolder:")
        for (transactions in bankTransactions) {
            println(transactions)
        }
    }

    fun accountBalance() {
        println("The current Balance is: $balance")
    }


}