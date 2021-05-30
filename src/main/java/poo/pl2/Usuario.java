package poo.PL2;

public class Usuario {
    
    private final String correo;
    private String clave;
    
    public Usuario (String correo, String clave){
        this.correo = correo;
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Correo: "+correo+". Clave: "+clave+'.';
    }
}