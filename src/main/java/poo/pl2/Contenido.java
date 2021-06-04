package poo.pl2;
import java.util.ArrayList;

public class Contenido {
    private String titulo;
    private String sinopsis;
    private String genero;
    private int año;
    private ArrayList<String>actores;
    private String imagen;

    public Contenido(String titulo, String sinopsis, String genero, int año, ArrayList<String> actores, String imagen) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.año = año;
        this.actores = actores;
        this.imagen=imagen;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public ArrayList<String> getActores() {
        return actores;
    }
    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Título:"+titulo+", sinopsis:"+sinopsis+", genero:"+genero+", año:"+año+", lista de actores:"+actores;
    }
    
    
}
