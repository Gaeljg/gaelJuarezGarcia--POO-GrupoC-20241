public class Rectangulo {
    double ancho, altura;
    Rectangulo(int ancho, int altura){
        this.ancho = ancho;
        this.altura = altura;
    }

    double area(){
        return ancho*altura;
    }

    double perimetro(){
        return 2*ancho+2*altura;
    }

    String mostrarAtributos(){
        return String.format("Ancho: %f\nAltura: %f\nArea: %f\nPerimetro: %f", ancho, altura, area(), perimetro());
    }
}
