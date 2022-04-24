import java.util.*

// Print the binary representation of character 'A' to 'F'
fun main() {
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code)
        binaryRepresentation[c] = binary
    }

    for ((letter, binary) in binaryRepresentation){
        println("$letter = $binary")
    }
}