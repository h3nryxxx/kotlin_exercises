import kotlin.math.exp
import kotlin.math.pow
import kotlin.math.roundToInt

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

/*Es aquel que es igual a la suma de sus dígitos elevados a la potencia de su número
de cifras. Su nombre alude a lo mucho que parecen "quererse a sí mismos".
371 = 3^3 + 7^3 + 1^3  = 371 otravez
input: Int
output: Boolean == true || false
1. insertamos un numero entero (371)
2.contamos la cantidad de digitos que tiene el numero (371 == 3 digitos)
3. cada digito por separa lo elevamos su cantidad base y lo sumamos => 3^3 + 7^3 + 1^3
4. la catidad obtenida la comparamos con la cantidad inicial ingresada 371 == 371 retorna true
5.salimos del programa

DUDAS
1. COMO CUENTO LA CANTIDAD DE DIGITOS QUE TIENE EL NUMERO? => ENTRA 3|7|1 => 3 DIGITOS=>RESUELTO
LA PRIMERA ES TRANSFORMARLO A UNA CADENA Y CONTAR SU LONGITUD PARA LA BASE=> RESUELTO

2.COMO SEPARO LOS DIGITOS DE LA CANTIDAD INICIAL? 3 + 7 + 1
SI LOS TRANSFORMO A UN ARRAY
LO DEMAS ES PURA ARITMETICA BASICA
*/

//fun powCal(number: Int, base: Int): Int{
//    var pow = 1
//   for (i in 1..base){
//       pow*=number
//   }
//    return pow
//}
fun powCal(number: Int, base: Int): Int{
   if (base == 0) return 1
    return number * powCal(number,base - 1 )
}

fun isANumberArmstrong(number: Int): Boolean{
    val base = number.toString().length
    var result = 0
    for (n in number.toString()){
        result += powCal(n.toString().toInt(), base)
    }
    println(result)
    return number == result
}

fun main() {
   if (isANumberArmstrong(371)) println("Si es un numero narcicista")
   else println("No los es")
}