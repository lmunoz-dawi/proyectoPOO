package Clases;
import java.util.ArrayList;
import java.util.List;

public class TarjetaPago {
    private final String nTarjeta;
    private final String titular;
    private final String fechaCaducidad;
    private final String cvv;
    private List<TarjetaPago> tarjetas;

    public TarjetaPago(String nTarjeta, String titular, String fechaCaducidad, String cvv){
        this.nTarjeta = nTarjeta;
        this.titular = titular;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
        this.tarjetas = new ArrayList<>();
    }

    public String getnTarjeta() { return nTarjeta; }

    public String getTitular() { return titular; }

    public String getFechaCaducidad() { return fechaCaducidad; }

    public String getCvv() { return cvv; }

    public void guardarTarjeta(TarjetaPago tarjeta){
        tarjetas.add(tarjeta);
    }
    public void verTarjetas(){
        for(TarjetaPago i : tarjetas){
            System.out.println(i);
        }
    }

}
