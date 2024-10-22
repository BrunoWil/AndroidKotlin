class BankAccount(accountHolder:String){
    private var balance:Double = 0.0 // (privada), do tipo Double, representando o saldo da conta.

    fun balanceGet(): Double {
        println("Saldo: $balance")
        return balance
    }

    fun deposit(amount: Double){ // - adiciona o valor passado ao saldo.
        if (amount<=0.0) {
            println("Valor Invalido")
        } else {
            balance += amount
        }

    }
    fun withdraw(amount: Double){// - subtrai o valor do saldo, mas só se houver saldo suficiente. Caso contrário, exiba uma mensagem de erro
        if(amount<=0.0){
            println("Valor Invalido")
        }else if (amount<=balance ) {
            balance -= amount
        } else{
            println("Saldo insuficiente")
        }
    }
}

fun main() {
    val name:String = "Bruno Wilson"
    val bruno = BankAccount("$name")
    bruno.balanceGet()
    println("Depositou: 100 ")
    bruno.deposit(100.0)
    bruno.balanceGet()
    println("Gastou: 99")
    bruno.withdraw(99.0)
    bruno.balanceGet()
    bruno.deposit(-1.0)
    bruno.balanceGet()
    bruno.withdraw(-9.0)
    bruno.balanceGet()
}