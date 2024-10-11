/*
 * Reto #7
 * CONTANDO PALABRAS
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 */

//ejemplo 1 mapas inmutables
//mapa de solo consulta
fun main() {
    val userSettings: Map<String,String> = mapOf(
        "name" to "Catrina",
        "language" to "Spanish",
        "logo" to "logo.png",
        "website" to "www.myweb.com"
    )
    //operaciones de solo lectura
    println(userSettings.size)
    println(userSettings.entries)
    println(userSettings.keys)
    println(userSettings.values)
    //metodos
    println(userSettings["name"])
    println(userSettings.isEmpty())
    println("logo" in userSettings.keys)
    //mapa mutable
    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "Cien años de soledad" to 1991
    )
    println(booksMap)
    //aniadir y actualizar entradas
    booksMap.put("La maquina del tiempo", 1890)
    booksMap["La maquina del tiempo"] = 1895
    println(booksMap)
    //remover entradas
    booksMap.remove("Sinsajo")
    println(booksMap)
    //otra variante)
    println(booksMap.remove("Cien años de soledad", 2015))//remueve si y solo si su valor es verdadero
    //recorrer un mapa
    val operationsMap = mapOf(
        "Suma" to '+',
        "Resta" to '-',
        "Multiplicación" to 'x',
        "División" to '÷'
    )
    println()
    for ((key, value) in operationsMap){
        println("$key: $value")
    }
    //usando una lambda
    println("Con una lambda")
    operationsMap.forEach { k, v -> println("$k: $v") }
}