public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();
    Rectangulo rectangulo = new Rectangulo(10, 20);

    System.out.println(persona.mostrarAtributos());
    System.out.println("\n\n"+Libro.mostrarAtributos());
    System.out.println("\n\n"+Libro.mostrarAtributos("Cien años de soledad","Gabriel Garcia Marquez", 1967 ));
    System.out.println("\n\n"+rectangulo.mostrarAtributos());
    }
}