// There is no need to match class and file names
// Property = field + acessor method
// Parenthesis sintax replaces the usual field-acessor lines
class Pessoa(
    val nome: String, // Field 'nome'
    val idade: Int // Field 'idade'
) {
    // Custom getter
    val isMaiorDeIdade: Boolean
        get() = idade >= 18

    val firstName: String
        get() = this.nome.split(" ").first()
}

fun main() {
    val p1 = Pessoa(nome = "Victor", idade = 25)
    val p2 = Pessoa(nome = "Victor", idade = 25)

    println("Pessoas são iguais? ${p1 == p2}")
    println("Primeiro nome de p2 é ${p2.firstName}")
    println("p1 é maior de idade? ${p1.isMaiorDeIdade}")
}
