public class Rectangulo {


    public String area(double base, double altura) {
        return String.format("El area es: %f", base*altura);
    }

    public String area(int base, int altura) {
        return String.format("El area es: %d", base*altura);
    }
}
