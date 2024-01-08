import java.util.ArrayList;

public class PersonaAntes1970
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

        long count = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();

        System.out.println("Cuantos hay de antes del 1970: " + count);
    }
}
