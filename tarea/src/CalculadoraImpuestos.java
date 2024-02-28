public class CalculadoraImpuestos {
    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

    public double calcularImpuestos(int ingresos, double porcentajeImpuesto) {
        return ingresos * (porcentajeImpuesto / 100);
    }

    public double calcularImpuestos(int ingresos, double porcentajeImpuesto,
                                    double dividendos, double excencion) {

        double impuestos = dividendos * (porcentajeImpuesto / 100);
        if (impuestos > excencion) {
            return impuestos - excencion;
        } else {
            return 0;
        }
    }
}
