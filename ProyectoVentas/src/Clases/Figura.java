package Clases;

public class Figura extends Producto implements IProductoAnime{
    public Figura(String nombre, Double precio, int stock, String descripcion, String genero) {
        super(nombre, precio, stock, descripcion, genero);
    }

    @Override
    public void calcularDescuento() {

    }
}
