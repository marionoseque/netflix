package poo.pl2;

public class Tarjeta {
    
    private String numero;
    private String mesCaducidad;
    private String añoCaducidad;
    private String saldo;

    public Tarjeta(String numero, String mesCaducidad, String añoCaducidad, String saldo) {
        this.numero = numero;
        this.mesCaducidad = mesCaducidad;
        this.añoCaducidad = añoCaducidad;
        this.saldo = saldo;
    }
    
    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getAñoCaducidad() {
        return añoCaducidad;
    }

    public void setAñoCaducidad(String añoCaducidad) {
        this.añoCaducidad = añoCaducidad;
    }

    public String getMesCaducidad() {
        return mesCaducidad;
    }

    public void setMesCaducidad(String mesCaducidad) {
        this.mesCaducidad = mesCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tarjeta: {"+"numero="+numero+", mesCaducidad="+mesCaducidad+", añoCaducidad="+añoCaducidad+", saldo="+saldo+"}";
    }
    
}
