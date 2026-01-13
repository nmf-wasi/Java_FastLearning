public class Library {

    String name;
    int year;
    Book[] books; //this is using another class, it's aggregation

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    @Override
    public String toString() {
        return "The " + this.name + " " + this.year + " ";
    }
}
