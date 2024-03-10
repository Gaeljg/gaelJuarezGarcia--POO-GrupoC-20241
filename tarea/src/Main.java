public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Jabon", 9.99, 50);
        Producto producto1 = new Producto("Maiz", 5.99);

        System.out.println("Nombre del producto: "+producto.getNombre());
        System.out.println("Precio del producto: "+producto.getPrecio());
        System.out.println("Stock del producto: "+producto.getStock());

        producto.setNombre("Jabon 2");producto.setPrecio(18.99);producto.setStock(100);

        System.out.println("Nombre del producto: "+producto.getNombre());
        System.out.println("Precio del producto: "+producto.getPrecio());
        System.out.println("Stock del producto: "+producto.getStock());

        producto.aumentarStock(5);
        System.out.println("Stock del producto: "+producto.getStock());
        producto.reducirStock(10);
        System.out.println("Stock del producto: "+producto.getStock());
    }
}