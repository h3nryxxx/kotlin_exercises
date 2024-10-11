import java.lang.Math.PI

class People {
    var nombre: String = "Carlos"//getter y setter generados automaticamente
    val edad: Int = 30//kotlin genera getter (propiedad de solo lectura)
}
/*
* personalizar los getters y setters para controlar cómo se accede o modifica una propiedad.
* */

class Employee{
    var name: String = "Carlos"
    //getter para devolver el nombre en mayusculas
    get() = field.uppercase()
        set(value) {
            if (value.isNotEmpty()){
                field = value
            }else{
                println("Error: El nombre no puede estar vacio")
            }
        }
    var edad: Int = 18
    //setter para definir edad solo positiva
    set(value) {
        if (value >=0){
            field = value
        }
        else{
            println("La edad no puede ser negativa")
        }
    }
}

class Circulo(val radio: Double){
    //propiedad calculada con solo getter
    val area: Double
        get() = PI * radio * radio
}

class Rectangulo{
    private var _altura: Int = 1 //variable privada
    var altura: Int
        get() = _altura//Getter personalizado
        set(value) {//Setter personalizado con validacion
            if (value > 0) {
                _altura = value
            } else{
                println("Error: la altura debe ser positiva")
            }
        }
    private var _anchura: Int = 1
    var anchura: Int
        get() = _anchura
        set(value) {
            if (value > 0) {
                _anchura = value
            } else {
                println("La anchura debe ser positiva")
            }
        }

}

fun main() {
    val people1 = People()
    val employee1 = Employee()

    println("Nombre: ${people1.nombre}")// Accede al nombre usando el getter automático
    println("edad: ${people1.edad}")// Accede a la edad (solo lectura)
    // Usando el setter
    people1.nombre = "Ana"
    println("Nuevo nombre: ${people1.nombre}")

    println("Nombre: ${employee1.name}, Edad: ${employee1.edad}")
    employee1.name = ""
    employee1.edad = -2

    println("Nombre: ${employee1.name}, Edad: ${employee1.edad}")

    //calculo circulo solo con getter
    val circulo = Circulo(5.0)
    println("Area del circulo : ${circulo.area}")

    //setter y getter con una propiedad privada
    val rectangulo = Rectangulo()
    rectangulo.altura = -2
    rectangulo.anchura = 0
    println("altura${rectangulo.altura}, anchura${rectangulo.anchura}")
    rectangulo.altura=10
    rectangulo.anchura=12

    println("altura${rectangulo.altura}, anchura${rectangulo.anchura}")

}