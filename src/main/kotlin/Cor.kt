enum class Cor(val red: Int, val green: Int, val blue: Int) {
    AMARELO(255, 255, 0),
    AZUL(0, 0, 255),
    BRANCO(255, 255, 255),
    VERMELHO(255, 0, 0);

    // Calculates decimal value of some rgb
    fun rgb() = ((red * 256 + green) * 256 + blue)
}

fun main() {
    val rgb = Cor.VERMELHO.rgb()
    println(rgb)
}
