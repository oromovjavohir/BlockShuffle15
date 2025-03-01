//package com.example.blockshuffle15
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
private fun init(){

}
private fun inir(){
    
}
data class Book(val id: Int, val title: String, val author: String)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Kitob qo'shildi: ${book.title} - ${book.author}")
    }

    fun removeBook(id: Int) {
        val removed = books.removeIf { it.id == id }
        if (removed) println("Kitob o'chirildi: ID $id")
        else println("Bunday ID ga ega kitob topilmadi")
    }

    fun getAllBooks(): List<Book> = books

    fun findBookByTitle(title: String): List<Book> {
        return books.filter { it.title.contains(title, ignoreCase = true) }
    }
}

fun main() {
    val library = Library()

    library.addBook(Book(1, "Kotlin Dasturlash", "Javohir Oromov"))
    library.addBook(Book(2, "Android Asoslari", "Bekzod Xudoyberdiev"))

    println("\nBarcha kitoblar:")
    library.getAllBooks().forEach { println(it) }

    println("\nQidiruv natijasi: 'Kotlin'")
    val foundBooks = library.findBookByTitle("Kotlin")
    foundBooks.forEach { println(it) }

    library.removeBook(1)

    println("\nYakuniy ro‘yxat:")
    library.getAllBooks().forEach { println(it) }
}
