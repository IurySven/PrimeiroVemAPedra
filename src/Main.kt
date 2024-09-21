fun main() {

    var jogo:Boolean = true
    var contUser:Int = 0
    var contMachin:Int = 0
    val ppt = mutableListOf<Int>(1, 2, 3)
    val pprt = mapOf(1 to "Pedra", 2 to "Papel", 3 to "tesoura")

    while (jogo == true) {
        println()
        print("Pedra(1)|Papel(2)|Tesoura(3): ")
        var escolha = readln().toIntOrNull()

        if (escolha != null && escolha in ppt) {
            println("Voce escolheu ${pprt[escolha]}")
        }else{
            println("Digito invalido!\n" +
                    "Tente novamente")

            continue
        }

        val machine = ppt.random()


        println("A maquina jogou ${pprt[machine]} X Voce Jogou ${pprt[escolha]}")

        when {
            (machine == 1 && escolha == 3 || machine == 2 && escolha == 1 || machine == 3 && escolha == 2) ->
                {
                    println("A maquina Ganhou")
                    contMachin++
                }

            (escolha == 1 && machine == 3 || escolha == 2 && machine == 1 || escolha == 3 && machine == 2) ->
            {
                println("Você Ganhou!!!")
                contUser++
            }
            else ->{
                println("Empate")
            }
        }

        println()
        println("Maquina $contMachin X $contUser Você")

        print("Continuar(S/N)? ")
        var contenue = readln().lowercase()
        if (contenue == "n"){
            jogo = false
        }
    }
}

