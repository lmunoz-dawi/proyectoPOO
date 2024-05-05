package Clases;

public class Manga extends Producto implements IProductoAnime{
    //Constructor
    public Manga(String nombre, Double precio, int stock, String descripcion, String genero) {
        super(nombre, precio, stock, descripcion, genero);
    }

    @Override
    public void calcularDescuento() {

    }
    //Constructor

}
