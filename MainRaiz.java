import java.util.Scanner;

public class MainRaiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double num = scanner.nextDouble();

        try {
            if (num < 0) {
                throw new NumeroNegativoExcepcion();
            } else {
                double raizCuadrada = Math.sqrt(num);
                System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}
