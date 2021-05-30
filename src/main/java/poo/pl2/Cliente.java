package poo.PL2;

public class Cliente extends Usuario{
   
    private String dni;
    private String nombre;

    public Cliente(String dni, String nombre, String correo, String clave) {
        super(correo, clave);
        this.dni = dni;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return super.toString()+" DNI: "+dni+". Nombre: "+nombre;
    }

}