import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String lectTeclado = scanner.nextLine();

        try {
            char result = encontrarCaracter.caracterEn(lectTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + result);
        } catch (Exception e) {
            System.err.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }

        scanner.close();
    }
}

