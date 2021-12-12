import java.io.File
import kotlin.jvm.JvmStatic
import java.lang.ProcessBuilder
import java.lang.Exception
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.IOException
import java.lang.IndexOutOfBoundsException
import java.util.*

object ToDoList {
    // deklarasi variabel global
    var fileName: String? = null
    var todoLists: ArrayList<String>? = null
    var isEditing = false
    var input: Scanner? = null
    @JvmStatic
    fun main(args: Array<String>) {
        // initialize
        todoLists = ArrayList()
        input = Scanner(System.`in`)
        val filePath = if (System.console() == null) "/src/todolist.txt" else "/todolist.txt"
        fileName = System.getProperty("user.dir") + filePath
        println("FILE: " + fileName)

        // run the program (main loop)
        while (true) {
            showMenu()
        }
    }

    fun clearScreen() {
        try {
            val os = System.getProperty("os.name")
            if (os.contains("Windows")) {
                // clear screen untuk windows
                ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor()
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear")
                print("\u001b[H\u001b[2J")
                System.out.flush()
            }
        } catch (e: Exception) {
            println("Error karena: " + e.message)
        }
    }

    fun showMenu() {
        println("=== TODO LIST APP ===")
        println("[1] Lihat Todo List")
        println("[2] Tambah Todo List")
        println("[3] Edit Todo List")
        println("[4] Hapus Todo List")
        println("[0] Keluar")
        println("---------------------")
        print("Pilih menu> ")
        val selectedMenu = input!!.nextLine()
        if (selectedMenu == "1") {
            showTodoList()
        } else if (selectedMenu == "2") {
            addTodoList()
        } else if (selectedMenu == "3") {
            editTodoList()
        } else if (selectedMenu == "4") {
            deleteTodoList()
        } else if (selectedMenu == "0") {
            System.exit(0)
        } else {
            println("Kamu salah pilih menu!")
            backToMenu()
        }
    }

    fun backToMenu() {
        println("")
        print("Tekan [Enter] untuk kembali..")
        input!!.nextLine()
        clearScreen()
    }

    fun readTodoList() {
        try {
            val file = File(fileName)
            val fileReader = Scanner(file)

            // load isi file ke dalam array todoLists
            todoLists!!.clear()
            while (fileReader.hasNextLine()) {
                val data = fileReader.nextLine()
                todoLists!!.add(data)
            }
        } catch (e: FileNotFoundException) {
            println("Error karena: " + e.message)
        }
    }

    fun showTodoList() {
        clearScreen()
        readTodoList()
        if (todoLists!!.size > 0) {
            println("TODO LIST:")
            var index = 0
            for (data in todoLists!!) {
                println(String.format("[%d] %s", index, data))
                index++
            }
        } else {
            println("Tidak ada data!")
        }
        if (!isEditing) {
            backToMenu()
        }
    }

    fun addTodoList() {
        clearScreen()
        println("Apa yang ingin kamu kerjakan?")
        print("Jawab: ")
        val newTodoList = input!!.nextLine()
        try {
            // tulis file
            val fileWriter = FileWriter(fileName, true)
            fileWriter.append(String.format("%s%n", newTodoList))
            fileWriter.close()
            println("Berhasil ditambahkan!")
        } catch (e: IOException) {
            println("Terjadi kesalahan karena: " + e.message)
        }
        backToMenu()
    }

    fun editTodoList() {
        isEditing = true
        showTodoList()
        try {
            println("-----------------")
            print("Pilih Indeks> ")
            val index = input!!.nextLine().toInt()
            if (index > todoLists!!.size) {
                throw IndexOutOfBoundsException("Kamu memasukan data yang salah!")
            } else {
                print("Data baru: ")
                val newData = input!!.nextLine()

                // update data
                todoLists!![index] = newData
                println(todoLists.toString())
                try {
                    val fileWriter = FileWriter(fileName, false)

                    // write new data
                    for (data in todoLists!!) {
                        fileWriter.append(String.format("%s%n", data))
                    }
                    fileWriter.close()
                    println("Berhasil diubah!")
                } catch (e: IOException) {
                    println("Terjadi kesalahan karena: " + e.message)
                }
            }
        } catch (e: Exception) {
            println(e.message)
        }
        isEditing = false
        backToMenu()
    }

    fun deleteTodoList() {
        isEditing = true
        showTodoList()
        println("-----------------")
        print("Pilih Indeks> ")
        val index = input!!.nextLine().toInt()
        try {
            if (index > todoLists!!.size) {
                throw IndexOutOfBoundsException("Kamu memasukan data yang salah!")
            } else {
                println("Kamu akan menghapus:")
                println(String.format("[%d] %s", index, todoLists!![index]))
                println("Apa kamu yakin?")
                print("Jawab (y/t): ")
                val jawab = input!!.nextLine()
                if (jawab.equals("y", ignoreCase = true)) {
                    // hapus data
                    todoLists!!.removeAt(index)

                    // tulis ulang file
                    try {
                        val fileWriter = FileWriter(fileName, false)

                        // write new data
                        for (data in todoLists!!) {
                            fileWriter.append(String.format("%s%n", data))
                        }
                        fileWriter.close()
                        println("Berhasil dihapus!")
                    } catch (e: IOException) {
                        println("Terjadi kesalahan karena: " + e.message)
                    }
                }
            }
        } catch (e: Exception) {
            println(e.message)
        }
        isEditing = false
        backToMenu()
    }
}