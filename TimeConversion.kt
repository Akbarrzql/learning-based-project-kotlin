import java.util.concurrent.TimeUnit

    fun main() {
        val Milidetik = 3600000L
        val Detik = TimeUnit.MILLISECONDS.toSeconds(Milidetik)

        println("\nKonversi Milik Detik Ke Detik Menggunakan TimeUnit")
        println("$Milidetik Milidetik Adalah $Detik Detik")

        val Menit = TimeUnit.MILLISECONDS.toMinutes(Milidetik)

        println("\nKonversi Milidetik Ke Menit Menggunakan TimeUnit")
        println("$Milidetik Milidetik Adalah $Menit Menit")

        val Jam = TimeUnit.MILLISECONDS.toHours(Milidetik)

        println("\nKonversi Milidetik Ke jam Menggunakan TimeUnit")
        println("$Milidetik Milidetik Adalah $Jam Jam")

        val Hari = TimeUnit.MILLISECONDS.toDays(Milidetik)

        println("\nKonversi Milidetik Ke Hari Menggunakan TimeUnit")
        println("$Milidetik Milidetik Adalah $Hari Hari")

    }


