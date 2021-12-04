import java.util.*
import kotlin.jvm.JvmStatic

object KonversiSuhu1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        val r: Double
        val f: Double
        val k: Double //variabel
        print("Masukan Bilangan = ")
        val c = input.nextInt().toDouble() //input suhu Celcius
        r = c * 4 / 5 // rumus reamur
        f = c * 9 / 5 + 32 //rumus farenfait
        k = c + 273.15 //rumus kelfin
        println("  ")
        println("Celsius = $c") //
        println("Reamur = $r") //Hasail dari rumus
        println("Fahrenheit = $f") //
        println("Kelvin = $k") //
    }
}