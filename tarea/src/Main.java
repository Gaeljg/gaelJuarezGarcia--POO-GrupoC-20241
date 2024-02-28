public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Empleado empleado = new Empleado();
        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos();

        System.out.println(rectangulo.area(5, 10));
        System.out.println(empleado.calcularSalario(1200, 100, 2));
        System.out.println(calculadoraImpuestos.calcularImpuestos(5000, 15, 100, 10));
    }
}