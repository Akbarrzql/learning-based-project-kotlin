import java.util.*
import kotlin.jvm.JvmStatic

object KonversiScanner {
    // Global Variable
    var name: String? = null
    var jenis_kelamin: String? = null
    var jk: String? = null
    var bilDes = 0
    fun Biner(n: Int) {
        if (n > 1) {
            Biner(n / 2)
        }
        print(n % 2)
    }

    fun Oktal(n: Int) {
        val daftarOktal = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7')
        val sisaBagi = n % 8
        if (n > 0) {
            Oktal((n - sisaBagi) / 8)
            print(daftarOktal[n % 8])
        }
    }

    fun Hexa(n: Int) {
        val daftarHexa = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
        val sisaBagi = n % 16
        if (n > 0) {
            Hexa((n - sisaBagi) / 16)
            print(daftarHexa[n % 16])
        }
    }

    fun inputDes() {
        print("Masukkan Bilangan Desimal = ")
        val inputan = Scanner(System.`in`)
        bilDes = inputan.nextInt()
        // return bilDes;
    }

    fun tampilBiner() {
        inputDes()
        print("Binernya Adalah ")
        Biner(bilDes)
    }

    fun tampilHexa() {
        inputDes()
        print("Hexanya Adalah ")
        Hexa(bilDes)
    }

    fun tampilOktal() {
        inputDes()
        print("Oktalnya Adalah ")
        Oktal(bilDes)
    }

    fun inpBil(): Int {
        println(
            """
                ==================================
                Selamat Datang $jk, $name,
                """.trimIndent()
        )
        println(
            """
                Silahkan Memilih Menu Konversi Bilangan ke: 
                1. Biner 
                2. Hexa 
                3. Oktal 
                4. Exit
                """.trimIndent()
        )
        print("Masukkan Angka Menu = ")
        val inputan = Scanner(System.`in`)
        return inputan.nextInt()
    }

    fun menU(pil: Int) {
        println("\u001b")
        when (pil) {
            1 -> tampilBiner()
            2 -> tampilHexa()
            3 -> tampilOktal()
            4 -> {
                println("Kamsia ya, sudah mampir.")
                System.exit(0)
            }
            else -> println("(Maaf. Pilih Angka 1 - 4 Saja)")
        }
        println("\u001b")
    }

    fun input() {
        val input = Scanner(System.`in`)
        println("Masukkan Nama Anda :")
        name = input.nextLine()
        if (name == "") {
            nama_kosong()
            input()
        } else {
            jenis_kelamin()
        }
    }

    fun nama_kosong() {
        val nama_kosong = Scanner(System.`in`)
        println("Maaf, Nama Harus Diisi !!!")
    }

    fun jenis_kelamin() {
        val jenis = Scanner(System.`in`)
        println("Masukkan Jenis Kelamin = ")
        println("Pilih : \n 1 Laki-Laki \n 2 Perempuan")
        val response = jenis.nextInt()
        when (response) {
            1 -> jk = "1"
            2 -> jk = "2"
            else -> {
                val waria = Scanner(System.`in`)
                println("Wah, Maaf Anda Harus Memilih 1 atau 2 :D")
                jenis_kelamin()
            }
        }
    }

    @JvmStatic
    fun main(aKU: Array<String>) {
        input()
        do {
            menU(inpBil())
        } while (true)
    }
}