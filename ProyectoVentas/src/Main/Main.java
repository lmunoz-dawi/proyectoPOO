package Main;
import Clases.*;

public class Main {
    public static void main(String[] args) {

        Figura figura1 = new Figura("Pedro", 3.4, 100, "No hace nada", "Gey");
        Ropa ropa1 = new Ropa("Sudadera Verde Fosfi",5.0, 50, "Sin limpiar", "Guarro", "XL");
        Manga manga1 = new Manga("Pedro el sudoroso", 1.2, 100, "Huele fatal enserio", "Roñoso");

        Carrito carrito = new Carrito();

        carrito.AgregarProducto(figura1);
        carrito.AgregarProducto(ropa1);
        carrito.AgregarProducto(manga1);

        carrito.MostrarCarrito();
        carrito.MostrarPrecio();

        System.out.println(figura1.getStock());

    }
}
