import java.util.ArrayList;

public class PersonasApellidoA
{
    public static void main(String[] args)
    {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona = new Person("Alex","Musat",1998);
        personas.add(persona);
        persona = new Person("Pepe","Alvarez",1968);
        personas.add(persona);
        persona = new Person("Juan","Martinez",1950);
        personas.add(persona);

        long contar = personas.stream()
                .filter(person -> person.lastName.startsWith("A")||person.lastName.startsWith("a")||person.lastName.startsWith("Á")||person.lastName.startsWith("À")||person.lastName.startsWith("á")||person.lastName.startsWith("à"))
                .count();

        System.out.println(contar + " apellido/s empiezan por A/Á/À/a/á/à.");
    }
}
