fun main() {
    val frutas = arrayOf("Maçã", "Banana", "Laranja", "Maçã")
    println("${frutas.contentToString()} é da classe ${frutas.javaClass.kotlin.qualifiedName}? ${frutas is Array<String>}")

    /// character '*' isn't a pointer reference, but the spread operator of Kotlin
    val frutas2 = setOf(*frutas)
    println("$frutas2 é da classe ${frutas.javaClass.kotlin.qualifiedName}? ${frutas2 is HashSet<String>}")

    val inteiros = intArrayOf(1, 2, 3, 4, 5)
    println("Soma de ${inteiros.contentToString()} é ${sum(*inteiros)}")

}

/// Use 'vararg' to pass any number of params of same type
fun sum(vararg xs: Int): Int {
    println(xs.javaClass.kotlin.qualifiedName)
    return xs.sum()
}