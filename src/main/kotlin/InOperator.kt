fun main(){
    println(isLetter('y'))
    println(isNotDigit('y'))

    println(isLetter('5'))
    println(isNotDigit('5'))
}

fun isLetter (c:Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c:Char) = c !in '0'..'9'