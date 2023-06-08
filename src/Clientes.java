/**
 * Clase que representa a los clientes.
 */
public class Clientes extends Usuarios {
    private String codigo;

    /**
     * Constructor de la clase Clientes.
     *
     * @param nombre    el nombre del cliente
     * @param apellidos los apellidos del cliente
     * @param email     el correo electrónico del cliente
     * @param permisos  los permisos del cliente
     * @param dni       el número de identificación del cliente
     * @param codigo    el código del cliente
     */
    public Clientes(String nombre, String apellidos, String email, String permisos, String dni, String codigo) {
        super(nombre, apellidos, email, permisos, dni);
        this.codigo = codigo;
    }

    /**
     * Crea un nuevo pedido para este cliente.
     *
     * @param codigo       el código del pedido
     * @param nombre       el nombre del pedido
     * @param modelo       el modelo del pedido
     * @param talla        la talla del pedido
     * @param direccion    la dirección del pedido
     * @param cod_cliente  el código del cliente asociado al pedido
     */
    public void crearPedido(int codigo, String nombre, String modelo, String talla, String direccion, int cod_cliente) {
        Pedidos pedidos = new Pedidos(codigo, nombre, modelo, talla, direccion, cod_cliente);
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
