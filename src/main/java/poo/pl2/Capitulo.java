package poo.pl2;

public class Capitulo {
    private String titulo;
    private int duracion;

    public Capitulo(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "{titulo de capitulo:"+titulo+", duracion de capitulo:"+duracion+"}"; 
    }
    
    
}
