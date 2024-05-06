package Main;
import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList productosLista = new ArrayList();

        Carrito carrito = new Carrito();

        Figura figura1 = new Figura("Melodias", 3.4, 100, "Cazador de Dragones", "Figura");
        Figura figura2 = new Figura("Naruto", 10.0, 100, "Lider de la banda", "Figura");
        Ropa ropa1 = new Ropa("Bandana",5.0, 50, "Bandana del caracteristico personaje Naruto", "Ropa", "XL");
        Ropa ropa2 = new Ropa("Capa",7.0, 50, "Capa Saitama", "Ropa", "Unica");
        Manga manga1 = new Manga("Berserk", 2.0, 100, "Tragica historia de un luchador", "Manga");
        Manga manga2 = new Manga("Blue Lock", 2.2, 100, "Equipo de futbol de egoistas", "Manga");

        //Añadimos todos los productos creados al array productos para luego verlo
        productosLista.add(figura1);
        productosLista.add(figura2);
        productosLista.add(ropa1);
        productosLista.add(ropa2);
        productosLista.add(manga1);
        productosLista.add(manga2);


        //Menu para el usuario
        boolean salir = true;
        do {
            mostrarProductos(productosLista);

            System.out.println("Presione 1 para AÑADIR un producto al carrito");
            System.out.println("Presione 2 para QUITAR un producto del carrito");
            System.out.println("Presione 3 para VER EL PRECIO de un producto");
            System.out.println("Presione 4 para MOSTRAR el carrito");
            System.out.println("Presione 5 para VACIAR el carrito");
            System.out.println("-1 para salir");
            int opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("Escribe el id del producto a añadir");
                    int idP = sc.nextInt();
                    Producto productoID = (Producto) productosLista.get(idP);
                    carrito.AgregarProducto(productoID);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case -1:
                    salir = false;

            }

        } while (salir);
    }

    //Metodo para mostrar todos los productos recorriendo el ArrayList
    public static void mostrarProductos(ArrayList productosLista){
        System.out.println("Todos los productos de la tienda: ");
        for(int i = 0; i < productosLista.size(); i++){
            Producto p = (Producto) productosLista.get(i);
            System.out.println(i + ". " + p.getNombre() + " - Genero: " + p.getGenero());
        }
    }
}
