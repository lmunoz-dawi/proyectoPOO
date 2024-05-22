package Clases;

public class Ropa extends Producto implements Detalles {
    private String talla;
    private String color;
    private String material;

    //Constructor
    public Ropa(String nombre, Double precio, int stock, String descripcion,String genero, String talla, String color, String material) {
        super(nombre, precio, stock, descripcion, genero);
        this.talla = talla;
        this.color = color;
        this.material = material;

    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String mostrarDetalles() {
        return String.format("Ropa: %s\s- Talla: %s\s- Color: %s\s- Material: %s\s- Precio: %.2f€ \n",
                this.getNombre(), this.getTalla(), this.getColor(), this.getMaterial(), this.getPrecio());
    }
}
