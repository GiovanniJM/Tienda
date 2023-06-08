/**
 * Clase abstracta que representa a los usuarios del sistema.
 */


public abstract class Usuarios {
    private String nombre;
    private String apellidos;
    private String email;
    private String permisos;
    private String dni;

    /**
     * Constructor de la clase Usuarios.
     *
     * @param nombre    el nombre del usuario
     * @param apellidos los apellidos del usuario
     * @param email     el correo electrónico del usuario
     * @param permisos  los permisos asignados al usuario
     * @param dni       el DNI del usuario
     */

    public Usuarios(String nombre, String apellidos, String email, String permisos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.permisos = permisos;
        this.dni = dni;
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
