import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val idade = lerIdade()
    println(idade)

    val p = porcentagem(59)
    println(p)
    porcentagem(101)
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/main/kotlin/idades"))
    val buffer = BufferedReader(reader)

    return try {
        val numero = buffer.readLine()
        Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        null
    } finally {
        buffer.close()
    }
}

fun porcentagem(numero: Int): String =
    if (numero in 1..100)
        "$numero%"
    else
        throw IllegalArgumentException("numero deve estar entre 0 e 100")


