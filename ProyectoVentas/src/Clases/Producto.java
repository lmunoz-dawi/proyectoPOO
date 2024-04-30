package Clases;

public abstract class Producto {
    protected String nombre;
    protected int precio;
    protected int stock;
    protected String descripcion;
    protected String genero;

    public Producto(String nombre, int precio, int stock, String descripcion, String genero) {
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

    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
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

    public String getGenero(){
        return genero;
    }
    public void setGenero(){
        this.genero = genero;
    }


}
