package Clases;

public class Manga extends Producto implements Detalles {
    private int numeroPaginas;
    private String autor;
    private String editorial;
    //Constructor
    public Manga(String nombre, Double precio, int stock, String descripcion, String genero, int numeroPaginas, String autor, String editorial) {
        super(nombre, precio, stock, descripcion, genero);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    @Override
    public String mostrarDetalles() {
        return String.format("Manga: %s\s- Número de páginas: %d\s- Autor: %s\s- Editorial: %s\s- Precio: %.2f€ \n",
                this.getNombre(), this.getNumeroPaginas(), this.getAutor(), this.getEditorial(), this.getPrecio());
    }
}
