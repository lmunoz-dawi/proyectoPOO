package Clases;

public class Ropa extends Producto implements IProductoAnime{
    public String tallas;

    //Constructor
    public Ropa(String nombre, Double precio, int stock, String descripcion,String genero, String tallas) {
        super(nombre, precio, stock, descripcion, genero);
        this.tallas = tallas;

    }
    public String getTallas() {
        return tallas;
    }
    public void setTallas(String tallas) {
        this.tallas = tallas;
    }


    @Override
    public void calcularDescuento() {

    }
}
