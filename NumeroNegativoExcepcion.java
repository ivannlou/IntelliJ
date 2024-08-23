public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super("Error: Número negativo. La raíz cuadrada no está definida para números negativos.");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}

