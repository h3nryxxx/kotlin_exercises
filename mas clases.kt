//propiedades mutables
class Televisor(private  var marca: String, private var encendido: Boolean = false){
    fun encender(){
        encendido = true
        println("El televisor $marca esta encendido")
    }
    fun apagar(){
        println("El televisor $marca esta apagado")
    }
}

//modificador publico esta por defecto en kotlin
class Dog{
    var name: String = "Marce"
    fun greetings(){
        println("Se llama $name")
    }
}
//metodo privado
class Bank(){
    private var saldo: Double =1000.0
    fun mostrarSaldo(){
        println("El saldo actual es $saldo")
    }
    private fun incrementarSaldo(cantidad: Double){
        saldo+=cantidad
        println(saldo)
    }
    fun depositar(cantidad: Double){
        incrementarSaldo(cantidad)
        println("Se han depositado $cantidad. Saldo actualizado.")
    }
    fun consultarSaldoTotal(){
        println("Saldo Total: $saldo")
    }
}

//MODIFICADOR PROTECTED

open class Animal{
    protected var tipo: String = "Desconocido"

    protected fun caminar(){
        println("El $tipo esta caminando")
    }
    fun sonido(){
        println("El animal esta haciendo un sonido")
    }
}

class Perro: Animal(){
    fun ladrar(){
        tipo = "Perro"
        println("El perro esta ladrando!")
    }
}

//modificador internal solo se puede desde un mismo proyecto, varios archivos compilados entre si
internal class Vehiculo{
    internal var marca: String = "Toyota"
    internal fun arrancar(){
        println("El vehiculo $marca esta arrancando")
    }
}


fun main() {
    val tv = Televisor("Sony")
    val dog1 = Dog()
    val cuenta = Bank()
    val perro1 = Perro()
    val miCoche = Vehiculo()
//publico
    tv.encender()
    tv.apagar()
    println(dog1.name)
    dog1.greetings()
//privado
    cuenta.mostrarSaldo()
    cuenta.depositar(200.0)
    cuenta.consultarSaldoTotal()
//protected
    perro1.ladrar()
//internal
    miCoche.arrancar()

}
