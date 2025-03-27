package autonoma.DirectorioAmistades.models;

/**
 * Clase que representa a un amigo en el directorio de amistades.
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.views
 */
public class Amigo {
    
    //////////////////////////////////
    /// Atributos
    
    /**
     * Nombre del amigo.
     */
    private String nombre;
    
    /**
     * Numero de telefono del amigo.
     */
    private int telefono;
    
    /**
     * Correo electronico del amigo.
     */
    private String correo;

    //////////////////////////////////
    /// Constructor
    
    /**
     * Constructor de la clase Amigo.
     * 
     * @param nombre   Nombre del amigo
     * @param telefono Numero de telefono del amigo
     * @param correo   Correo electronico del amigo
     */
    public Amigo(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //////////////////////////////////
    /// Metodos de acceso
    
    /**
     * Obtiene el nombre del amigo.
     * 
     * @return Nombre del amigo
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el numero de telefono del amigo.
     * 
     * @return Numero de telefono del amigo
     */
    public int getTelefono() {
        return telefono;
    }
    
    /**
     * Obtiene el correo electronico del amigo.
     * 
     * @return Correo electronico del amigo
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Establece el nombre del amigo.
     * 
     * @param nombre Nuevo nombre del amigo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Establece el numero de telefono del amigo.
     * 
     * @param telefono Nuevo numero de telefono del amigo
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Establece el correo electronico del amigo.
     * 
     * @param correo Nuevo correo electronico del amigo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
