
fun main(){
    var maior = max(10, 5)
    println("Tipo de 'maior' é inferido? ${boolToString(maior is Int)}")
}

// Block body, must specify return type
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Expression body, may omit return type
fun boolToString(b: Boolean) = if (b) "Sim" else "Não"