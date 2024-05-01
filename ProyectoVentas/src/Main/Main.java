package Main;
import Clases.*;

public class Main {
    public static void main(String[] args) {

        Figura figura1 = new Figura("Isabel", 3.4, 100, "Luchadora", "Grey");
        Ropa ropa1 = new Ropa("Sudadera Verde Fosfi",5.0, 50, "Comoda", "Guerrero", "XL");
        Manga manga1 = new Manga("El sabueso de Lava", 1.2, 100, "Quema", "Medieval");

        Carrito carrito = new Carrito();

        carrito.AgregarProducto(figura1);
        carrito.AgregarProducto(ropa1);
        carrito.AgregarProducto(manga1);

        carrito.MostrarCarrito();
        carrito.MostrarPrecio();

        System.out.println(figura1.getStock());

    }
}
