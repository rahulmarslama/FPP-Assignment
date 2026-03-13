package Assignment9.Problem3;

import java.util.HashMap;

public class Library
{
    private HashMap<String,Book> books;

    public Library()
    {
        books = new HashMap<>();
    }


    public Book addBook(String ISBN, String title, String author)
    {
        if(books.containsKey(ISBN))
        {
            System.out.println("The book "+ title +" you are trying to add is already in the library.");
            return null;
        }
        Book newBook = new Book(ISBN,title,author);
        books.put(newBook.getISBN(),newBook);
        System.out.println("Book \""+title+"\" is added into the library.");
        return newBook;
    }

    public boolean borrowBook(String ISBN)
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return false;
        }

        Book book = books.get(ISBN);
        if(book==null)
        {
            System.out.println("The book with ISBN: "+ISBN+" is not available in the library.");
            return false;
        }
        if(book.isBorrowed())
        {
            System.out.println("The book with ISBN: "+ISBN+" is already borrowed and not availble.");
            return false;
        }
        else
        {
            System.out.println("The book with ISBN: "+ISBN+" is now borrowed to you.");
            book.setBorrowed(true);
            return true;
        }
    }

    public boolean returnBook(String ISBN)
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return false;
        }

        Book book = books.get(ISBN);
        if(book==null)
        {
            System.out.println("The book with ISBN: "+ISBN+" is not available in the library.");
            return false;
        }
        if(book.isBorrowed())
        {
            book.setBorrowed(false);
            System.out.println("You have successfully returned the book with ISBN: "+ISBN);
            return true;
        }
        else
        {
            System.out.println("The book with ISBN: "+ISBN+" was not borrowed and not available for the return.");
            return true;
        }
    }


    boolean isBookBorrowed(String ISBN)
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return false;
        }

        Book book = books.get(ISBN);
        if(book==null)
        {
            System.out.println("The book with ISBN: "+ISBN+" is not available in the library.");
            return false;
        }
        return book.isBorrowed();
    }

    public String getBookDetails(String ISBN)
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return null;
        }

        Book book = books.get(ISBN);
        if(book==null)
        {
            System.out.println("The book with ISBN: "+ISBN+" is not available in the library.");
            return null;
        }
        return book.toString();
    }

    public void listAllBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return;
        }
        books.forEach((key,book)->
        {
            System.out.println(book.toString());
        });
    }

    public void listBorrowedBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("No books available in the library.");
            return;
        }
        books.forEach((key,book)->
        {
            if(book.isBorrowed())
            {
                System.out.println(book.toString());
            }
        });
    }

}
