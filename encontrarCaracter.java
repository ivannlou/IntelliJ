public class encontrarCaracter {

    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }
}





