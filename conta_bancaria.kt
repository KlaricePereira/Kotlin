package classes

// Declaração da classe principal que contém o método main
fun main() {
    // Criando uma instância da classe Conta e atribuindo à variável conta1
    val conta1 = Conta("123456", "João Silva")
    // Depositando 100.0 na conta conta1
    conta1.depositar(100.0)
    // Imprimindo os detalhes da conta conta1
    conta1.imprimir()

    // Criando uma segunda instância da classe Conta e atribuindo à variável conta2
    val conta2 = Conta("654321", "Maria Souza", 500.0)
    // Depositando 50 na conta conta2
    conta2.depositar(50)
    // Imprimindo os detalhes da conta conta2
    conta2.imprimir()
}

// Definição da classe Conta
class Conta (
    // Propriedades da conta: número da conta e proprietário da conta
    val numeroConta: String,
    val proprietarioConta: String
) {
    // Propriedade para armazenar o saldo da conta, inicializado com 0.0
    var saldo: Double = 0.0

    // Construtor secundário vazio, chamando o construtor primário com valores padrão para numeroConta e proprietarioConta
    constructor() : this(proprietarioConta = "", numeroConta = "") {
        // Imprime uma mensagem quando este construtor é chamado
        println("construtor()")
    }

    // Construtor secundário com parâmetros numeroConta, proprietarioConta e saldo, chamando o construtor primário com numeroConta e proprietarioConta
    constructor(numeroConta: String, proprietarioConta: String, saldo: Double) : this(numeroConta, proprietarioConta) {
        // Define o saldo da conta com o valor passado como argumento
        this.saldo = saldo
    }

    // Método para depositar uma quantia (Double) na conta
    fun depositar(valor: Double) {
        // Adiciona a quantia ao saldo da conta
        saldo += valor
    }

    // Método sobrecarregado para depositar uma quantia (Int) na conta, converte o valor Int em Double e chama o método depositar(Double)
    fun depositar(valor: Int) {
        // Chama o método depositar(Double) convertendo o valor Int para Double
        depositar(valor.toDouble())
    }

    // Método para imprimir os detalhes da conta
    fun imprimir() {
        // Imprime o número da conta, o proprietário da conta e o saldo atual
        println("Número: $numeroConta; Proprietário: $proprietarioConta; Saldo: $saldo")
    }
}
