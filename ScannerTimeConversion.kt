import java.util.concurrent.TimeUnit

fun main() {
    print("Masukkan Jumlah Milidetik Yang Ingin Anda Masukan : ")
    val Milidetik = readLine()!!.toLong()

    val Detik = TimeUnit.MILLISECONDS.toSeconds(Milidetik)
    println("Hasil Konversi : " + Milidetik + " Milidetik Adalah " + Detik + " Menit ")

    val Menit = TimeUnit.MILLISECONDS.toMinutes(Milidetik)
    println("Hasil Konversi : " + Milidetik + " Milidetik Adalah " + Menit + " Menit ")

    val Jam = TimeUnit.MILLISECONDS.toHours(Milidetik)
    println("Hasil Konversi : " + Milidetik + " Milidetik Adalah " + Jam + " Jam ")

    val Hari = TimeUnit.MILLISECONDS.toHours(Milidetik)
    println("Hasil Konversi : " + Milidetik + " Milidetik Adalah " + Hari + " Menit ")



}