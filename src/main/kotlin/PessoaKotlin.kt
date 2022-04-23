class PessoaKotlin(
    val nome: String,
    val idade: Int
)

fun main(){
    val p1 = PessoaKotlin(nome = "Victor", idade = 25)
    val p2 = PessoaKotlin(nome = "Victor", idade = 25)


    println("Pessoas são iguais? ${p1==p2}")
}
