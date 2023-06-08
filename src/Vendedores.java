public class Vendedores extends Trabajadores {
    private String codigoVendedor;

    /**
     * Constructor de la clase Vendedores.
     *
     * @param nombre          el nombre del vendedor
     * @param apellidos       los apellidos del vendedor
     * @param email           el correo electrónico del vendedor
     * @param permisos        los permisos asignados al vendedor
     * @param dni             el DNI del vendedor
     * @param numSegSocial    el número de seguridad social del vendedor
     * @param codigoVendedor  el código del vendedor
     */

    public Vendedores(String nombre, String apellidos, String email, String permisos, String dni, String numSegSocial, String codigoVendedor) {
        super(nombre, apellidos, email, permisos, dni, numSegSocial);
        this.codigoVendedor = codigoVendedor;
    }

    // Getters y setters para el atributo codigoVendedor
    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }
}
