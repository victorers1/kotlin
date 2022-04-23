// Package structure doesn't need to reflect folder structure
package packageb

import packagea.nome

fun main() {
    // function 'nome' belongs to another package,
    // so it need to be imported
    println(nome())
}