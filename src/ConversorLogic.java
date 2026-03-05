public class ConversorLogic {
    private ConsultaMoneda consulta = new ConsultaMoneda();

    public void ejecutarConversion(String base, String destino, double cantidad) {
        double tasa = consulta.obtenerTasa(base, destino);
        if (tasa != -1) {
            double resultado = cantidad * tasa;
            System.out.printf(">>> El valor %.2f [%s] corresponde a =>>> %.2f [%s]%n",
                    cantidad, base, resultado, destino);
            System.out.println();
        }
    }
}