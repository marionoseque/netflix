package poo.pl2;

import java.util.ArrayList;

public class Serie extends Contenido {
    private int temporadas;
    private Capitulo capitulo;

    public Serie(int temporadas, Capitulo capitulo, String titulo, String sinopsis, String genero, int año, ArrayList<String> actores, String imagen) {
        super(titulo, sinopsis, genero, año, actores, imagen);
        this.temporadas = temporadas;
        this.capitulo = capitulo;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public Capitulo getCapitulo() {
        return capitulo;
    }
    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    @Override
    public String toString() {
        return super.toString()+"nº de temporadas:"+temporadas+", capitulo:"+capitulo; 
    }

    
    
    
}
