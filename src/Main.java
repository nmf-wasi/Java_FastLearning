import java.util.Scanner;

public class Main {
    static void main(String[] args) {
// represents has a relationship

//        One obj contains another obj as part of it's sturcture, but the contained ibj can exist independently

    Book book1=new Book("idk", 95);
    Book book2=new Book("idk either", 96);
    Book book3=new Book("idk eitherrr", 69);

//        Aggregation → coupled, but loosely
//        Composition → tightly coupled
//        Tight coupling = control + knowledge
//        Loose coupling = use without ownership

    Book[]books={book1, book2, book3};

    for(Book book : books){
        System.out.println(book);
    }

    Library library=new Library("idu", 2006, books);

        System.out.println(library);

    }
}


