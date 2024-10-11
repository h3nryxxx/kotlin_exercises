/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */
fun printStrings(str1: String, str2: String){
    val combination = str1.zip(str2)
    var outOne: String = ""
    var outTwo: String = ""
    for ((c1, c2) in combination){
        if (c1 != c2){
            outOne+=c1
            outTwo+=c2
        }
    }
    println(outOne)
    println(outTwo)
}

fun printStringWithFilter(str1: String, str2: String){
    println("outOne:${str1.uppercase().filter { !str2.uppercase().contains(it) }}")
    println("outTwo:${str2.uppercase().filter { !str1.uppercase().contains(it) }}")
}

fun main() {
    val str1 = "zorro"
    val str2 = "henry"
    printStrings(str1.uppercase(),str2.uppercase())
    printStringWithFilter(str1, str2)
}