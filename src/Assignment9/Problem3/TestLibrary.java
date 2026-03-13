package Assignment9.Problem3;

import java.util.HashMap;

public class TestLibrary
{
    static void main()
    {
        Library bookCollection = new Library();
        bookCollection.addBook("123ABC","The world of lies","Rahul Lama");
        bookCollection.addBook("123DEF","The world of truth","Rahul Lama");
        bookCollection.addBook("123GHI","How am I wrong?","Rahul Lama");
        bookCollection.addBook("123JKL","Who are you?","Rahul Lama");
        bookCollection.addBook("123MNO","I don't know anymore","Rahul Lama");
        bookCollection.addBook("123PQR","The laugh we all want","Rahul Lama");

        bookCollection.listAllBooks();

        bookCollection.borrowBook("123ABC");
        bookCollection.getBookDetails("123ABC");
        bookCollection.isBookBorrowed("123ABC");

        bookCollection.borrowBook("123ABC");
        System.out.println(bookCollection.isBookBorrowed("123ABC"));

        bookCollection.returnBook("123ABC");
        System.out.println(bookCollection.isBookBorrowed("123ABC"));

    }
}
