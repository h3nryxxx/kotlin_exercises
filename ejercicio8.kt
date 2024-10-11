//contar vocales de un texto

//fun main() {
//    val vocal = "aeiou"
//    val text = "Hola me llamo quique "
//    val total: MutableMap<Char,Int> = mutableMapOf()
//    var counterA = 1
//    var counterE = 1
//    var counterI = 1
//    var counterO = 1
//    var countU = 1
//    text.lowercase().forEach { c ->
//        if (c == 'a'){
//
//            total[c] = counterA++
//        }
//        if (c == 'e'){
//            total[c] = counterE++
//        }
//        if (c == 'i') {
//            total[c] = counterI++
//        }
//        if (c == 'o'){
//            total[c] = counterO++
//        }
//        if (c == 'u'){
//            total[c] = countU++
//        }
//    }
//    println(total)
//}

//fun main() {
//    val text = "Hola a todos como estan"
//    val vCounter = mutableMapOf<Char,Int>()
//
//    val vowels = listOf('a','e','i','o','u')
//    for (vowel in vowels){
//        vCounter[vowel] = 0
//    }
//
//    for (c in text){
//        if (c in vowels){
//            vCounter[c] = vCounter[c]!! + 1
//        }
//    }
//    println(vCounter.entries)
//
//}

fun main() {
    val text = "Me gusta la teoria de la relatividad"
    val vowelCounter = mutableMapOf<Char, Int>()
    val vowels = listOf('a','e','i','o','u')
    //inicializar map
    for (vowel in vowels){
        vowelCounter[vowel] = 0
    }
    text.lowercase().forEach { c ->
        if (c in vowels){
            vowelCounter[c] = vowelCounter[c]!! + 1
        }
    }
    println(vowelCounter.entries)
}