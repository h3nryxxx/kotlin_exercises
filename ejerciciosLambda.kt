// Definir la lambda y realizar la operación
// Debe imprimir 15

fun main() {
    //ejercicio 1
    sum()
    //ejercicio 2
    pairsNum()
    //ejercicio 3
    upperStr()
    //ejercicio4
    val suma = operar(10,5){x,y->x+y}
    val resta = operar(10,5){x,y-> x-y}
    val multi = operar(10,5){x,y->x*y}
    val div = operar(10,5){x,y->x/y}
    println("$suma\n$resta\n$multi\n$div")
    //ejercicio5
    findValue()
    //ejercicio6
    //ejercicio7
    sortedList()
    //ejercicio8
    countStr()
}

fun sum(){
    val sum  = {a: Int, b: Int -> a + b}
    println(sum(10,5))
    println(sum(10,52))
}

fun pairsNum(){
    //filtar nummeros pares
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pairs = nums.filter { it % 2 == 0}
    println(pairs)
}

fun upperStr(){
    //Dada una lista de cadenas, usa una lambda para convertir cada cadena en su versión en mayúsculas.
    val cadenas = listOf("kotlin", "java", "python")
    val strUpper = cadenas.map { it.uppercase() }
    println(strUpper)
}
/*
Escribe una función llamada operar que reciba dos números y una lambda que represente una
operación matemática. Usa la función con diferentes operaciones como suma, resta, multiplicación, etc.
* */
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int{

    return operacion(a,b)
}
/*
Dada una lista de enteros, usa una lambda para encontrar el primer elemento que sea mayor que un valor dado.
(8)
* */
fun findValue(){
    val numeros = listOf(3, 7, 2, 9, 12, 5)
    val encontrado = numeros.find { it > 8 }
    println(encontrado)
}
/*
* Ejercicio 6: Ordenar una Lista de Pares
* Dada una lista de pares (nombre, edad), ordena la lista por
* edad usando una lambda.
* */
fun sortedList(){
    val personas = listOf(Pair("Juan", 25), Pair("Ana", 30), Pair("Luis", 22))
    val orden = personas.sortedBy{ it.second }
    println(orden)
}

fun countStr(){
    val palabras = listOf("sol", "mar", "tierra", "nube", "montaña")
    val contador = palabras.filter { it.length >= 4 }
        println(contador)
}