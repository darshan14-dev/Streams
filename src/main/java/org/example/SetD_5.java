//You have a list of libraries,
// each library has a list of books.
// You want to group all the books across all libraries by their authors.

package org.example;
import java.util.*;
import java.util.stream.*;


class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}


public class SetD_5 {

    public static void main(String[] args) {

        // Dummy data
        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Java Concurrency", "Brian Goetz");
        Book b4 = new Book("Clean Architecture", "Robert Martin");
        Book b5 = new Book("Java Puzzlers", "Joshua Bloch");

        Library lib1 = new Library("Central Library",
                Arrays.asList(b1, b2, b3));

        Library lib2 = new Library("City Library",
                Arrays.asList(b4, b5));

        List<Library> libraries = Arrays.asList(lib1, lib2);

        Map<String,List<String>> mp = libraries.stream()
                .flatMap(l -> l.getBooks().stream())
                .collect(Collectors.groupingBy( Book::getAuthor,Collectors.mapping(
                        Book::getTitle,
                        Collectors.toList()
                )));

        System.out.println(mp);

    }
}
