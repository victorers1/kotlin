// Use 'is' to check the type of a object

interface Expressao

class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avaliaExpressao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliaExpressao(expressao.esquerdo) + avaliaExpressao(expressao.direito)
    }

    throw IllegalArgumentException("Expressão é desconhecida")
}


fun main(){
    // (1 + 2) + 4

    val um = Numero(1)
    val dois = Numero(2)
    val quatro = Numero(4)
    val primeiraSoma = Soma(um, dois)
    val segundaSoma = Soma(primeiraSoma, quatro)
    var resultado = avaliaExpressao(segundaSoma)
    println("Resultado da soma: $resultado")

    // In one line
    resultado = avaliaExpressao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println("Resultado da soma: $resultado")
}