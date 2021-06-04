package poo.pl2;

import java.util.ArrayList;

public class Pelicula extends Contenido {
    private int duracion;
    private String director;

    public Pelicula(int duracion, String director, String titulo, String sinopsis, String genero, int año, ArrayList<String> actores, String imagen) {
        super(titulo, sinopsis, genero, año, actores, imagen);
        this.duracion = duracion;
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString()+", duración:"+duracion+", director:"+director; 
    }
}
