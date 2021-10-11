fun main() {
    println("Menu Matematika")
    println("1. Cek Bilangan Genap")
    println("2. Cek Bilangan Ganjil")
    println("3. Luas Persegi")
    println("4. Luas Persegi Panjang")
    println("==========================")

    println("Masukan Pilihan : ")
    readLine()!!.toString()

    var Angka : Int
    var Angka2 : Int
    var Sisi : Double
    var Panjang : Double
    var Luas : Double


    when(readLine()){
        "1. Cek Bilangan Genap" ->{
            println("Bilangan Genap")
            println("Masukan Angka : ")
            val Angka= readLine()!!.toInt()

            if (Angka % 2 == 0)
                println("Hasil = Bilangan Genap")
            else
                println("Hasil = Bilangan Ganjil")
        }
        "2. Cek Bilangan Ganjil" ->{
            println("Bilangan Ganjil")
            println("Masukan Angka : ")
            val Angka2= readLine()!!.toInt()

            if (Angka2 % 2 == 1)
                println("Hasil = Bilangan Ganjil")
            else
                println("Hasil = Bilangan Genap")
        }
        "3. Luas Persegi" ->{
            println("Menghitung Luas Persegi")
            println("Masukan Ukuran Sisi :")
            val Sisi= readLine()!!.toDouble()

            val LuasPersegi = Sisi*Sisi
            println("Hasil Luas Persegi Adalah = $LuasPersegi")
        }
        "4. Luas Persegi Panjang" ->{
            println("Menghitung Luas Persegi Panjang")
            println("Masukan Panjang : ")
            val Panjang= readLine()!!.toDouble()
            println("Masukan Luas : ")
            val Luas= readLine()!!.toDouble()

            val MenghitungLuas = Panjang*Luas
            println("Hasil Luas Persegi Panjang Adalah = $MenghitungLuas")

        }
        else ->{
            println("Pilihan Tidak Tersedia")
        }

    }


}