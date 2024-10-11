import kotlin.reflect.typeOf

//ESTE ES UN COMENTARIO
/*
* HOLA COM ESAS
* */

fun main() {
    val name = "Killer"
    var lastName = "Killer 2"
    val num = 1
    val num2 = 2
    val decimal = 10.0f
    val myBool = true
    println(name)
    println(lastName)
    lastName = "kahoon"
    println(lastName)
    val language = "Kotlin"
    println("Hola $language")
//OPERADORES DE KOLTIN TODOS Y ESTRUCTURAS DE CONTROL
    //operadores aritmeticos
    println(5+56)
    println(20*3)
    println(10/2)
    println(5-5)
    //operadores de asignacion
    var  n = 1
    n+=4
    println(n)
    n-=3
    println(n)
    n*=5
    println(n)
    n/=2
    println(n)
    n%=2
    println(n)
    //operadores de comparacion
    val a = 10
    val b = 11
    println(a.equals(b))
    println(a.compareTo(other = b) < 0)
    println(a.compareTo(b) > 0)
    println(a != b)
    println(b >= a)
    println(message = a<=b)
    //logicos
    var x = 10
    val y = 5
    if (x > 0 && y  > 0) println("Ambos numeros son positivos")
    x = -10
    if (x > 0 || y > 0) println("Almenos un numero es positivo")
    val isActive = false
    if (!isActive) println("La cuenta no esta activa")
    //operador logico combinado
    val age = 25
    val hasID = true
    if ((age > 18 && age < 65) && hasID) println("la persona puede entrar")
    //operaciones bit a bit
    val s = 6//(110)
    val o = 3//(011)
    val result = s and o //(010) => 2
    val result2 = s or o//(111) => 7
    println(result2)
    println(result)
    //xor
    val result3 = s xor o//(101) =>5
    println(result3)
    val result4 = a.inv()
    println(result4)

    //desplazamiento bits
    val p = 3
    val desI = p shl 1
    println(desI)
    val q = 8
    val desD = q shr 1
    println(desD)
    var pe = 3
    pe++
    println(pe)
    pe--
    println(pe)
    val value = 5
    if (value in 1 .. 5) println("Es su rango")
    val fruits = listOf("Banana", "Manzana", "Pera")
    if ("Banana" in fruits) println(true)
    val text: Any = "Perro"
    if (text is String) println("Es una cadena")
    val num3:Any = 10
    if (text != String) println("No es una cadena")

    var name23: String? = null
    val checkName = name23 ?: "No ingresaste tu nombre"
    println(checkName)
    printNumber()


}

fun printNumber(){
    for (i in 10..55) {
        if (i % 3 == 0 || i == 16) continue
        else if (i % 2 == 0 ) println(i)
    }
}