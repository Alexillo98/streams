import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);

        String palabra;
        do {
            palabra = escaner.nextLine();
            if (!palabra.isEmpty())
            {
                cadenas.add(palabra);
            }
        }while (!palabra.isEmpty());

        cadenas.stream()
                .forEach(System.out::println);
    }
}