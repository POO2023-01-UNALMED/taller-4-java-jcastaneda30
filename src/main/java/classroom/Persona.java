package classroom;

public class Persona {

    long cedula=0;
    String nombre;
    static int totalPersonas;
    static int cedulaDefault;
    
    static {
        totalPersonas = 0;
        cedulaDefault = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula=1;
    	cedulaDefault++;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona() {
    	this.cedula=0;
    	cedulaDefault++;
        this.nombre = "";
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
