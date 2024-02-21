public class Persona {
    String nombre="Gael Juarez Garcia";
    int edad=19;
    String genero="Hombre";

    String mostrarAtributos(){
        return String.format("Nombre: %s\nEdad: %d\nGenero: %s", nombre,edad,genero);
    }
}
