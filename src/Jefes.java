/**
 * Clase que representa a los jefes, quienes son trabajadores con un código de jefe adicional.
 */
public class Jefes extends Trabajadores {
    private String codigoJefe;

    /**
     * Constructor de la clase Jefes.
     *
     * @param nombre         el nombre del jefe
     * @param apellidos      los apellidos del jefe
     * @param email          el correo electrónico del jefe
     * @param permisos       los permisos del jefe
     * @param dni            el número de identificación del jefe
     * @param numSegSocial   el número de seguridad social del jefe
     * @param codigoJefe     el código del jefe
     */
    public Jefes(String nombre, String apellidos, String email, String permisos, String dni, String numSegSocial, String codigoJefe) {
        super(nombre, apellidos, email, permisos, dni, numSegSocial);
        this.codigoJefe = codigoJefe;
    }


    public String getCodigoJefe() {
        return codigoJefe;
    }


    public void setCodigoJefe(String codigoJefe) {
        this.codigoJefe = codigoJefe;
    }
}
