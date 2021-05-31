package poo.PL2;

public class Cliente extends Usuario{
   
    private String dni;
    private String nombre;
    private Tarjeta tarjeta;

    public Cliente(String dni, String nombre, String correo, String clave,Tarjeta tarjeta) {
        super(correo, clave);
        this.dni = dni;
        this.nombre = nombre;
        this.tarjeta=tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    @Override
    public String toString() {
        return super.toString()+" DNI: "+dni+". Nombre: "+nombre+". Tarjeta: "+tarjeta+'.';
    }

}
