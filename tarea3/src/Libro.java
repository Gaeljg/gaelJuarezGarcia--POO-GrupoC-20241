public class Libro {
    static String titulo="El laberinto de la soledad";
    static String autor="Otavio Paz";
    static int añoDePublicacion=1950;
    public static String mostrarAtributos(){
        return String.format("Titulo: %s\nAutor: %s\nAño De Publicacion: %d", titulo,autor,añoDePublicacion);
    }
    public static String mostrarAtributos(String titulo, String autor, int añoDePublicacion){
        return String.format("Titulo: %s\nAutor: %s\nAño De Publicacion: %d", titulo,autor,añoDePublicacion);
    }
}
