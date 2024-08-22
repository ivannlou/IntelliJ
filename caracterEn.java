import java.util.Scanner;

public class caracterEn {
        public static char caracterEn(String cadena, int posicion) throws Exception {
            if (posicion >= 0 && posicion < cadena.length()) {
                return cadena.charAt(posicion);
            } else {
                throw new Exception("Error: La posición " + posicion + " está fuera de los límites de la cadena.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce una cadena: ");
            String cadena = scanner.nextLine();

            System.out.print("Introduce la posición del carácter que deseas obtener: ");
            int posicion = scanner.nextInt();

            try {
                System.out.println("El carácter en la posición " + posicion + " es: " + caracterEn(cadena, posicion));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            scanner.close();
        }
    }





