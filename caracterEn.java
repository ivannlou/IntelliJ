public class caracterEn {

    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición inválida.");
        }
    }
}





