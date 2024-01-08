import java.util.ArrayList;

public class SumaPosNeg
{
    public static void main(String[] args)
    {
        ArrayList<Integer> valores = new ArrayList<>();

        valores.add(5);
        valores.add(10);
        valores.add(-5);
        valores.add(7);

        long contarPos = valores.stream()
                .filter(numero -> numero >= 0)
                .count();

        long contarNeg = valores.stream()
                .filter(numero -> numero <0)
                .count();

        System.out.print("Hay " + contarPos + " números positivos y " + contarNeg + " numeros negativos.");
    }
}
