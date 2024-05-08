package Clases;

import java.util.ArrayList;
import java.util.List;

//Carrito sera una Lista de Objetos
public class Carrito{
    public List<Producto> productos ;

    public Carrito(){
        this.productos = new ArrayList<>();
    }

    public void AgregarProducto(Producto producto){
        productos.add(producto);
        producto.setStock(producto.stock - 1);
    }
    public void QuitarProducto(Producto producto){
        productos.remove(producto);
        producto.setStock(producto.stock - 1);
    }
    public void MostrarCarrito(){
        for(Producto producto : productos){
            System.out.print(producto.nombre + " - ");
            System.out.print(producto.precio + "€ ");
            System.out.println(producto.descripcion);
        }
    }
    public void VaciarCarrito(){
        productos.clear();
    }
    public void MostrarPrecio(){
        Double precioTotal = 0.0;
        for(Producto producto : productos){
            precioTotal += producto.precio;
        }
        System.out.println(precioTotal + "€");
    }
}