//definicion de una clase basica
class Persona(val name: String, var age: Int){
    fun greetings(){
        println("Hola me llamo $name y tengo $age de edad")
    }
}
//clase con constructor primario

class Coche(val marca: String, val modelo: String, var velocidad: Int = 0){
    fun acelerar(){
        velocidad+=10
        println("El coche esta acelerando a $velocidad km/hr")
    }
}

//constructor secundario
/*
* los constructores secundarios se utilizan para ofrecer múltiples formas de crear una instancia de una clase.
* */
//constructor primary
class Person(var name: String, var age: Int) {
    //constructor second
    constructor(name: String) : this(name, 18){
        println("Se asigno una edad predeterminada de 18 years")
    }
    constructor() :this("Desconocido", 0){
        println("nombre desconocido, y edad 0")
    }
}

class Car(var marca: String, var model: String, var color: String ){
    constructor(marca: String, color: String): this(marca, "Modelo desconocido", color)
    constructor(marca: String): this(marca, "Modelo desconocido", "Marca desconocida")

}

class Book(var title: String, var author: String, var pages: Int){
    constructor(title: String, author: String): this(title,author,100){
        println("Se asignaron 100 paginas por defecto")
    }
    constructor(title: String):this(title, "Unknown", 200)
}

fun main() {
    val person = Persona("Killer", 32)
    val miCoche = Coche("mercedez benz", "2024")
//primer ejemplo
    val people1 = Person()
    val people2 = Person("Juan")
    val people3 = Person("Carmen", 56)
//segundo ejemplo
    val coche1 = Car("toyota");
    val coche2 = Car("Honda", "1992", "red")

    println(coche1.marca)
    println("${coche2.marca} ${coche2.model} ${coche2.color}")

    println("${people1.age} ${people1.name}")//sin nombre y 0 edad
    println("${people2.name} ${people2.age}")//con edad por defecto
    println("${people3.name} ${people3.age}")//con nombre y edad
    miCoche.acelerar()
    person.greetings()

    //ejemplo ultimo de libros
    val book1 = Book("Harry pother", "ana", 80)
    val book2 = Book("Dumbo","Disney")
    val book3 = Book("kamasutra")

    println("${book1.title} ${book1.author} ${book1.pages}")
    println("${book2.author} ${book2.title} ${book2.pages}")
    println("${book3.title} ${book3.author} ${book3.pages}")
}