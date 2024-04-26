/**
 * Creamos una clase pública llamada Persona
 */
public class Persona {

    
    private String nombre; //Creamos una variable privada nombre
    private int edad; //Creamos una variable privada edad

    /**
     * Creamos un constructor 
     */ 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

/**
* @return Creamos un getter de nombre
 */
    public String getNombre() {
        return nombre;
    }

/**
* @param Nombre Creamos un setter de nombre
 */    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
* @return Creamos un getter de edad
 */
    public int getEdad() {
        return edad;
    }

/**
* @param Nombre Creamos un setter de edad
 */ 
    public void setEdad(int edad) {
        this.edad = edad;
    }

/**
 * Creamos un metodo llamado imprimirDetalles que lo que hace es mostrar por pantalla el nombre y la edad.
 */    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
