import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        int numero;
        do
        {
            numero = escaner.nextInt();
            if (numero >= 0)
            {
                valores.add(numero);
            }
        }while (numero >= 0);

        valores.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(System.out::println);
    }
}
