package biblioteca;

public class Revista extends Recurso {

    private int numero;
    private String periocidad;

    public Revista() { }

    public Revista(String nombre, String fechaPublicacion, int numero, String periocidad) {
        super(nombre, fechaPublicacion);
        this.numero = numero;
        this.periocidad = periocidad;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getPeriocidad() { return periocidad; }
    public void setPeriocidad(String periocidad) { this.periocidad = periocidad; }
}
