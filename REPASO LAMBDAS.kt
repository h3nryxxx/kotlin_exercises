import java.text.NumberFormat

//LAMBDA BASICA
    fun main() {

        val sum = {a:Int, b:Int -> a + b}
        val boolean = {d:Int, c:Int -> d < c}
        val res = {a:Int, b:Int -> a - b}
        val mul = {a: Int, b: Int -> a * b}
        val div = {a: Int, b: Int -> if (b!=0) a / b else println("Error") }

        println(sum(10,5))
        println(boolean(10,5))
        println(res(10,5))
        println(mul(10,5))
        println(div(10,0))

        val result = operation(4,2) { x, y -> x * y }
        println(result)

        val resultTwo = compare("Calamardo", "Calamardo") {x , y -> x == y}
        println(resultTwo)

        val pass = entry(18, "Killer", true){a,n,i -> a in 18 .. 60 && n == "killer" && i }
        println(pass)

//        val fahrenheit = temperature("Fahrenheit", 0.0){x, y -> y * 1.8 + 32}
//        val celsius = temperature("Celsius", 32.0){x, y -> (y - 32) * 5 / 9}

        val measure = temperature("Celsius", 100.0){ x,y
            -> when(x){
                "Celsius" -> "${(y - 32) * 5 / 9} $x"
                "Fahrenheit" -> "${y * 1.8 + 32} $x"
                else -> "Mal"
            }
        }

//        println(fahrenheit)
//        println(celsius)
        println(measure)
    square()
    }

    fun operation(a: Int, b: Int, op: (Int, Int) -> Int): Int{

        return op(a,b)
    }

    fun compare(a: String, b: String, bool: (String, String) -> Boolean): Boolean{
        return bool(a,b)
    }

    fun entry(
        age: Int,
        name: String,
        isInList: Boolean,
        entry: (Int, String, Boolean) -> Boolean
    ): Boolean{
        return entry(age,name.lowercase(),isInList)
    }
    //Grados Fahrenheit = (grados centígrados × 9/5) + 32
    //Grados centígrados = (grados Fahrenheit − 32) × 5/9

    fun temperature(measurer:String,number: Double, temp:(String,Double) -> String): String{
        return temp(measurer,number)
    }

fun square(){
    val square = {x: Int -> x * x}
    println(square(2))
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMul = list.map { it * 2 }
    println(listMul)
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val pairs = numbers.filter { it%2 ==0 }
    val nones = numbers.filter { it % 2 == 1 }
    val minor  = numbers.filter { it in 5..10 && it != 7 }
    println(pairs)
    println(nones)
    println(minor)

}