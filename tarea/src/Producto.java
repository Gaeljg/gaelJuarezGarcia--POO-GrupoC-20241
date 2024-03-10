public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = Math.sqrt(Math.pow(precio, 2));
        this.stock = stock;
    }

    Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = Math.sqrt(Math.pow(precio, 2));
        this.stock = 0;
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    public void setNombre(String nombre){
        if (nombre != null){
            this.nombre = nombre;
        } else {
            this.nombre = "default";
        }
    }
    public void setPrecio(double precio){
        this.precio = Math.sqrt(Math.pow(precio, 2));
    }
    public void setStock(int stock){
        this.stock = Math.abs(stock);
    }

    //Metodos adicionales
    public void aumentarStock(int cantidad){
        if (cantidad > 0){
            this.stock += cantidad;
        }
    }
    public void reducirStock(int cantidad){
        if (cantidad > 0 && cantidad <= this.stock){
            this.stock -= cantidad;
        }
    }
}
