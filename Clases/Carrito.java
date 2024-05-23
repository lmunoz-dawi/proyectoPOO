package Clases;

import java.util.ArrayList;
import java.util.List;

//Carrito sera una Lista de Objetos
public class Carrito{
    public List<Producto> productos ;
    private double precioTotal;
    public Carrito(){
        this.precioTotal = precioTotal;
        this.productos = new ArrayList<>();
    }


    public double MostrarPrecio(){
        double precioTotal = 0.0;
        for(Producto producto : productos){
            precioTotal += producto.precio;
        }
        return precioTotal;
    }

    public void setPrecioTotal(double nuevoPrecioTotal){
        this.precioTotal = nuevoPrecioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
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
            System.out.print(producto.mostrarDetalles());
        }
    }

    public void VaciarCarrito(){
        productos.clear();
    }
}
