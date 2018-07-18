package biblioteca;

import interfaces.IPrestable;

public class Libro extends Recurso implements IPrestable{

    private String edicion;
    private String isbn;
    private String autor;
    private Boolean estaPrestado;

    public Libro() { }

    public Libro(String nombre, String fechaPublicacion, String edicion, String isbn, String autor) {
        super(nombre, fechaPublicacion);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getEdicion() { return edicion; }
    public void setEdicion(String edicion) { this.edicion = edicion; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public boolean prestar() {

        if(esPrestado()){
            return false;
        }
        this.estaPrestado = true;

        return true;
    }

    @Override
    public boolean devolver() {
        if(!esPrestado()){
            return false;
        }
        this.estaPrestado = false;

        return true;
    }

    @Override
    public boolean esPrestado() {
        return this.estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre ='" + super.getNombre() + '\'' +
                ", fechaPublicacion='" + super.getFechaPublicacion() + '\'' +
                ", edicion='" + edicion + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", estaPrestado=" + estaPrestado +
                '}';
    }
}
