package biblioteca;

import enums.Formatos;
import interfaces.IPrestable;

public class Disco extends RecursoMultimedia implements IPrestable {

    private String selloDiscografico;
    private String artista;
    private Boolean estaPrestado;

    public Disco() { }

    public Disco(String titulo, Formatos formato, String duracion, String selloDiscografico, String artista) {
        super(titulo, formato, duracion);
        this.selloDiscografico = selloDiscografico;
        this.artista = artista;
    }

    public String getSelloDiscografico() { return selloDiscografico; }
    public void setSelloDiscografico(String selloDiscografico) { this.selloDiscografico = selloDiscografico; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }


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
        return "Disco{" +
                " titulo='" + super.getTitulo() + '\'' +
                ", formato='" + super.getFormato() + '\'' +
                ", duracion='" + super.getDuracion() + '\'' +
                ", selloDiscografico='" + selloDiscografico + '\'' +
                ", artista='" + artista + '\'' +
                ", estaPrestado=" + estaPrestado +
                '}';
    }
}
