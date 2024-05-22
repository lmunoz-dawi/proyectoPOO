package Clases;

public abstract class Producto implements Detalles {
    protected String nombre;
    protected Double precio;
    protected int stock;
    protected String descripcion;
    protected String genero;

    public Producto(String nombre, Double precio, int stock, String descripcion, String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getPrecio(){
        return precio;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}
