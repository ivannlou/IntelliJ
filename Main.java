import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String leerTeclado = scanner.nextLine();

        System.out.print("Introduce un número para encontrar el caracter: ");
        int posicion = scanner.nextInt();

        try {
            char resultado = caracterEn(leerTeclado, posicion);
            System.out.println("El carácter en la posición " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("No existe un caracter en la posicion solicitada.");
        }
    }

    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición inválida.");
        }
    }
}
