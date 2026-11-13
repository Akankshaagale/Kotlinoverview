class BankAccount {

    private var balance = 5000

    fun showBalance() {
        println(balance)
    }
}

fun main() {
    val account = BankAccount()
    account.showBalance()
}