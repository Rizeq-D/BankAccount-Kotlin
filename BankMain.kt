package com.rizeq.backaccount

fun main () {

    val rizeqAccount = BankAccount("Rizeq", 2000000.0)

    val sarahAccount = BankAccount("Sarah", 0.0)



    /*rizeqAccount.deposit(50000.00)
    rizeqAccount.withdraw(1000000.00)*/

    sarahAccount.deposit(100.0)
    sarahAccount.withdraw(10.0)
    sarahAccount.deposit(300.0)



}