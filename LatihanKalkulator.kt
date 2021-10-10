fun main() {
   println("Kalkulator Dengahn Kotlin")
    print("Masukan Angka 1 = ")
    val angka1 = readLine()!!.toDouble()
    print("Masukan Angka 2 = ")
    val angka2 = readLine()!!.toDouble()
    print("Pilih Operasi yang Akan Digunakan : ")
    when(readLine()){
        "+" -> {
            print("Hasilnya Adalah ${angka1+angka2}")
        }
        "-" ->{
            print("Hasilnya Adalah ${angka1-angka2}")
        }
        "*" ->{
            print("Hasilnya Adalah ${angka1*angka2}")
        }
        "/" ->{
            print("Hasilnya Adalah ${angka1/angka2}")
        }
        else ->{
            print("Operasi Yang Anda Pilih Tidak Ada")
        }
    }
}