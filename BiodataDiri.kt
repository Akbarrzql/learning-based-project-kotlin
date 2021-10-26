fun main() {
    println("Biodata Diri")
    println("============================")

    println("Masukan Nama Anda:")
    val Nama = readLine()!!.toString()
    println("Masukan Alamat Anda:")
    val Alamat = readLine()!!.toString()
    println("Masukan Tangal Dan Tempat Lahir Anda:")
    val Ttl = readLine()!!.toString()
    println("Institusi Anda Sekarang:")
    val Institusi = readLine()!!.toString()
    print("1. Benar ")
    println(" 2.Belum Yakin")
    println("Yakin Sudah Benar?")
    val yakin = readLine()!!.toString()

    when(readLine()){
        "Benar" -> {
            println("Nama Anda Adalah = $Nama")
        println("Tempat Tanggal Lahir = $Ttl")
        println("Alamat = $Alamat")
        println("Institusi = $Institusi")}
        "Belum Yakin" ->{
            println("Silahkan Isi Ulang Dari Awal")
        }
        else -> {
            println("Terjadi Kesalahan, Silahkan Mengulang")
        }
    }
    println("====Biodata Selesai====")



}