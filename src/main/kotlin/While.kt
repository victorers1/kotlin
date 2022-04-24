// Calculating the mean of some temperatures given by the user
fun main() {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999) {
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() // Not recommended: user can insert a string ou a null value

        if (temperatura != 999) {
            somatorio += temperatura
            quantidade++;
        }
    }

    println("A média é ${somatorio / quantidade}")
}