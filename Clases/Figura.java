package Clases;

public class Figura extends Producto implements Detalles {
    private String material;
    private double escala;
    private String marca;
    public Figura(String nombre, Double precio, int stock, String descripcion, String genero, String material, double escala, String marca) {
        super(nombre, precio, stock, descripcion, genero);
        this.material = material;
        this.escala = escala;
        this.marca = marca;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getEscala() {
        return escala;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String mostrarDetalles() {
        return String.format("Figura: %s\s- Material: %s\s- scala: %f\s- Marca: %s\s- Precio: %.2f€\n",
                this.getNombre(), this.getMaterial(), this.getEscala(), this.getMarca(), this.getPrecio());
    }
}
