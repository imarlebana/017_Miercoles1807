package biblioteca;

public class Recurso extends Biblioteca{

    private String nombre;
    private String fechaPublicacion;

    public Recurso() { }

    public Recurso(String nombre, String fechaPublicacion) {
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(String fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }
}
