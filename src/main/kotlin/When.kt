fun main(){
    val cor = Cor.AMARELO

    val result = corToString(cor)
    println(result)

    var temp = temperaturaDaCor(cor)
    println("Tempetatura de $cor é: ${temperaturaDaCor(cor)}")
}

    // WHEN (like IF-ELSE) is an expression that returns a value
    // There's no need to write 'break'
fun corToString (cor:Cor) = when (cor){
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.AZUL -> "Legal"
        Cor.BRANCO -> "Braço"
    }

    // When if multi value in one branch
fun temperaturaDaCor(cor:Cor): String {
    return when(cor){
        Cor.AMARELO, Cor.VERMELHO -> "Quente"
        Cor.AZUL -> "Frio"
        Cor.BRANCO -> "Neutro"
    }
}