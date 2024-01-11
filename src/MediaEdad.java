import java.util.ArrayList;
import java.util.List;

public class MediaEdad
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        List<Person2> personas = new ArrayList<>();

        Person2 persona = new Person2("Fedor Dostoievski",1976);
        personas.add(persona);
        Book libro = new Book(persona,"Crimen y castigo",197);
        books.add(libro);

        persona = new Person2("J. K. Rowling",1965);
        personas.add(persona);
        libro = new Book(persona,"Harry Potter y la piedra filosofal",321);
        books.add(libro);

        persona = new Person2("J. K. Rowling",1965);
        personas.add(persona);
        libro = new Book(persona,"Harry Potter y la cámara secreta",415);
        books.add(libro);

        double average = books.stream()
                .map(Book::getAuthor)
                .mapToInt(Person2::getBirthYear)
                .average()
                .getAsDouble();

        System.out.println("Media de edad de los autores: " + average);

        books.stream()
                .filter(book -> book.getName().contains("Potter"))
                .map(Book::getAuthor)
                .forEach(System.out::println);
    }
}
