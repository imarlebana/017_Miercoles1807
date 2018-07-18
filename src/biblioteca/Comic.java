package biblioteca;

public class Comic extends Recurso {

    private int numero;
    private String coleccion;

    public Comic() { }

    public Comic(String nombre, String fechaPublicacion, int numero, String coleccion) {
        super(nombre, fechaPublicacion);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getColeccion() { return coleccion; }
    public void setColeccion(String coleccion) { this.coleccion = coleccion; }


}
