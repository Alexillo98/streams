import java.util.ArrayList;

public class NombresUnicosAlfabetico
{
    public static void main(String[] args)
    {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona = new Person("Alex","Musat",1998);
        personas.add(persona);
        persona = new Person("Pepe","García",1968);
        personas.add(persona);
        persona = new Person("Juan","Martinez",1950);
        personas.add(persona);

        personas.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}