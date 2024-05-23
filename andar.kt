fun main() {
    // Cria uma instância da classe Pessoa com a distância padrão de 5000m até precisar beber água
    val p1 = Pessoa()

    // Simula a pessoa andando 5 vezes, o que totaliza 5000m
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()

    // A pessoa bebe água para poder andar mais
    p1.beberAgua()

    // Simula a pessoa andando mais 5 vezes
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()
    p1.andar()

    // A pessoa bebe água novamente
    p1.beberAgua()

    // A pessoa anda mais uma vez
    p1.andar()

    // Imprime a distância total percorrida pela pessoa p1
    println("A pessoa andou ${p1.distanciaPercorrida()}m")

    // Cria uma nova instância da classe Pessoa, mas desta vez com uma resistência menor (1000m até precisar beber água)
    val p2 = Pessoa(1000)
    
    // Simula a pessoa p2 andando uma vez e bebendo água
    p2.andar()
    p2.beberAgua()
    
    // A pessoa anda mais uma vez
    p2.andar()
    
    // Imprime a distância total percorrida pela pessoa p2
    println("A pessoa andou ${p2.distanciaPercorrida()}m")
}

private class Pessoa(
    // Distância inicial até a pessoa precisar beber água, valor padrão é 5000m
    private val distanciaInicialParaAgua: Int = 5000
) {
    // Armazena a distância total percorrida pela pessoa
    private var distancia = 0

    // Armazena a distância restante até a pessoa precisar beber água
    private var distanciaParaAgua: Int = distanciaInicialParaAgua

    // Método para simular a pessoa andando 1000m
    fun andar() {
        // Verifica se a pessoa ainda pode andar antes de precisar beber água
        if (distanciaParaAgua > 0) {
            distancia += 1000 // Incrementa a distância total percorrida
            distanciaParaAgua -= 1000 // Decrementa a distância restante até precisar beber água
        }
    }

    // Método para simular a pessoa bebendo água, resetando a distância para precisar beber água novamente
    fun beberAgua() {
        distanciaParaAgua = distanciaInicialParaAgua
    }

    // Método para obter a distância total percorrida pela pessoa
    fun distanciaPercorrida(): Int {
        return distancia
    }
}