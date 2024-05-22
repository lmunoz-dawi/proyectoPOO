package Main;
import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList productosLista = new ArrayList();

        Carrito carrito = new Carrito();

        Figura figura1 = new Figura("Melodias", 3.4, 100, "Cazador de Dragones", "Figura", "plastico", 432.4 , "Perico");
        Figura figura2 = new Figura("Naruto", 10.0, 100, "Lider de la banda", "Figura", "Silicona", 10.0, "Ford");
        Ropa ropa1 = new Ropa("Bandana",5.0, 50, "Bandana del caracteristico personaje Naruto", "Ropa", "XL", "Gris", "Aluminio");
        Ropa ropa2 = new Ropa("Capa",7.0, 50, "Capa Saitama", "Ropa", "Unica", "Rojo", "Polyester");
        Manga manga1 = new Manga("Berserk", 2.0, 100, "Tragica historia de un luchador", "Manga", 132, "Martin", "El pato");
        Manga manga2 = new Manga("Blue Lock", 2.2, 100, "Equipo de futbol de egoistas", "Manga", 543, "Carlos", "El pato");

        //Añadimos todos los productos creados al array productos para luego verlo
        productosLista.add(figura1);
        productosLista.add(figura2);
        productosLista.add(ropa1);
        productosLista.add(ropa2);
        productosLista.add(manga1);
        productosLista.add(manga2);


        //Menu para el usuario
        boolean salir = true;

        mostrarProductos(productosLista);
        do {
            System.out.println(" ");
            System.out.println("Presione 1 para AÑADIR un producto al carrito");
            System.out.println("Presione 2 para QUITAR un producto del carrito");
            System.out.println("Presione 3 para VER EL PRECIO del producto");
            System.out.println("Presione 4 para MOSTRAR el carrito");
            System.out.println("Presione 5 para VACIAR el carrito");
            System.out.println("-1 para salir");
            int opcion = sc.nextInt();

            Producto productoID = null;
            if(opcion == 1 || opcion == 2 || opcion == 3){
                mostrarProductos(productosLista);
                System.out.println(" ");
                System.out.println("Escribe el ID del producto que te interesa");
                int idP = sc.nextInt();
                productoID = (Producto) productosLista.get(idP);
            }

            switch(opcion) {
                case 1:
                    carrito.AgregarProducto(productoID);
                    System.out.println("Has agregado el producto al carrito!");
                    System.out.println(" ");
                    break;
                case 2:
                    carrito.QuitarProducto(productoID);
                    System.out.println("Has quitado el producto del carrito");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("El producto vale: ");
                    System.out.print(productoID.getPrecio());
                    System.out.println(" €");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Estos son los productos de tu carrito: ");
                    carrito.MostrarCarrito();
                    System.out.println(" ");
                    System.out.println("Total del carrito:");
                    System.out.println(carrito.MostrarPrecio() + "€");
                    // Solicitar cupón de descuento
                    if(carrito.MostrarPrecio() > 0.0){
                        System.out.print("Introduce un cupón de descuento (si tienes uno): ");
                        Scanner sc2 = new Scanner(System.in);
                        String cupon = sc2.nextLine();
                        double descuentoAplicado = aplicarDescuento(cupon, carrito.MostrarPrecio());
                        if (descuentoAplicado > 0) {
                            System.out.println("¡Cupón válido! Se aplicó un descuento de " + (descuentoAplicado / carrito.MostrarPrecio() * 100) + "%.");
                            carrito.setPrecioTotal(carrito.MostrarPrecio() - descuentoAplicado);
                        } else {
                            System.out.println("Cupón no válido.");
                        }

                        System.out.println("Total con descuento: " + (carrito.MostrarPrecio()-aplicarDescuento(cupon, carrito.MostrarPrecio())) + "€");
                        break;
                    }
                    break;
                case 5:
                    carrito.VaciarCarrito();
                    System.out.println("Has vaciado el carrito");
                    System.out.println(" ");
                    break;
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
    public static double aplicarDescuento(String cupon, double precioTotal) {
        switch (cupon.toUpperCase()) {
            case "DESCUENTO10":
                return precioTotal * 0.1;
            case "MITAD":
                return precioTotal / 2;
            default:
                return 0;
        }
    }
}
