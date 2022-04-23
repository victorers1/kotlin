fun main() {
    // DECLARING OR OMITTING TYPES
    var nome = "Victor" // Type not specified, it's infered
    var sobrenome: String = "Emanuel" // Type declared and fixed

    // VAL KEYWORD: value is 'final',that is, cannot be reassigned
    val nomeSocial: String // Declared but not assigned
    nomeSocial = "Shayene" // First assignment, from now on cannot be reassigned

    // VAR KEYWORD: variable is mutable, that is, can be reassigned
    var idade: Int = 0
    idade = 1;
    idade = 2;

    println("nome: $nome")
    println("sobrenome: $sobrenome")
    println("nomeSocial: $nomeSocial")
    println("idade: $idade")

}

