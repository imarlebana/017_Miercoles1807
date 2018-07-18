package biblioteca;

import enums.Formatos;

public class RecursoMultimedia extends Biblioteca{

    private String titulo;
    private Formatos formato;
    private String duracion;

    public RecursoMultimedia() { }

    public RecursoMultimedia(String titulo, Formatos formato, String duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Formatos getFormato() { return formato; }
    public void setFormato(Formatos formato) { this.formato = formato; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }


}
