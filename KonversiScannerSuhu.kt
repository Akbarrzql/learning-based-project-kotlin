import kotlin.jvm.JvmStatic

object KonversiScannerSuhu {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Reamur")
        println("Farenheit")
        println("Kelvin")
        println("Keseluruhan")

        print("Masukan Menu Yang Dipilih: ")
  
        when(readLine()!!.toString()){
            "Reamur" ->{
                val r : Double
                print("Masukan Bilangan = ")
                val c = readLine()!!.toDouble()
                r = c * 4 / 5
                print("Hasil Konversi Suhu Reamur adalah : $r ")
            }
            "Farenheit" ->{
                val f : Double
                print("Masukan Bilangan = ")
                val c = readLine()!!.toDouble()
                f = c * 9 / 5 + 32
                print("Hasil Konversi Suhu Farenheit adalah : $f ")
            }
            "Kelvin" ->{
                val k : Double
                print("Masukan Bilangan = ")
                val c = readLine()!!.toDouble()
                k = c + 273.15
                print("Hasil Konversi Suhu Kelvin adalah : $k ")
            }
            "Keseluruhan" -> {
                val r : Double
                val f : Double
                val k : Double

                print("Masukan Bilangan = ")
                val c = readLine()!!.toDouble()
                r = c * 4 / 5 // rumus reamur
                f = c * 9 / 5 + 32 //rumus farenfait
                k = c + 273.15 //rumus kelfin

                println("Hasil Keseluruhan Konversi")
                println("Celcius = $c")
                println("Reamur = $r")
                println("Farenheit = $f")
                println("Kelvin = $k")
            }
        }
    }

}
