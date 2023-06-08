import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a los trabajadores en el sistema.
 */
public class Trabajadores extends Usuarios {
    private String numeroSeguridadSocial;

    /**
     * Constructor de la clase Trabajadores.
     *
     * @param nombre                  el nombre del trabajador
     * @param apellidos               los apellidos del trabajador
     * @param email                   el correo electrónico del trabajador
     * @param permisos                los permisos asignados al trabajador
     * @param dni                     el DNI del trabajador
     * @param numeroSeguridadSocial   el número de seguridad social del trabajador
     */
    public Trabajadores(String nombre, String apellidos, String email, String permisos, String dni, String numeroSeguridadSocial) {
        super(nombre, apellidos, email, permisos, dni);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    /**
     * Crea un nuevo cliente con los datos proporcionados.
     *
     * @param nombre      el nombre del cliente
     * @param apellidos   los apellidos del cliente
     * @param email       el correo electrónico del cliente
     * @param permisos    los permisos asignados al cliente
     * @param dni         el DNI del cliente
     * @param codigo      el código del cliente
     */
    public void crearCliente(String nombre, String apellidos, String email, String permisos, String dni, String codigo) {
        Clientes clientes = new Clientes(nombre, apellidos, email, permisos, dni, codigo);
    }

    /**
     * Muestra los pedidos del cliente con el código especificado.
     *
     * @param cod_cliente el código del cliente
     */
    public void mirarPedidosClientes(int cod_cliente) {
        List<Pedidos> pedidosCliente = buscarPedidosPorCliente(cod_cliente);

        if (pedidosCliente.isEmpty()) {
            System.out.println("No se encontraron pedidos para el cliente con el código " + cod_cliente);
        } else {
            System.out.println("Pedidos del cliente con el código " + cod_cliente + ":");
            for (Pedidos pedido : pedidosCliente) {
                System.out.println("Código: " + pedido.getCodigo());
                System.out.println("Nombre: " + pedido.getNombre());
                System.out.println("Modelo: " + pedido.getModelo());
                System.out.println("Talla: " + pedido.getTalla());
                System.out.println("Dirección: " + pedido.getDireccion());
                System.out.println("--------------------");
            }
        }
    }

    /**
     * Busca los pedidos de un cliente por su código.
     *
     * @param cod_cliente el código del cliente
     * @return una lista de pedidos del cliente
     */
    private List<Pedidos> buscarPedidosPorCliente(int cod_cliente) {
        // Aquí puedes implementar la lógica para buscar los pedidos de un cliente
        // Utiliza la base de datos, servicios externos, o cualquier método que tengas para obtener los datos

        // Ejemplo de lista de pedidos ficticios
        List<Pedidos> pedidos = new ArrayList<>();
        List<Pedidos> pedidosCliente = new ArrayList<>();
        for (Pedidos pedido : pedidos) {
            if (pedido.getCodCliente() == cod_cliente) {
                pedidosCliente.add(pedido);
            }
        }

        return pedidosCliente;
    }

    /**
     * Crea un nuevo pedido con los datos proporcionados.
     *
     * @param codigo        el código del pedido
     * @param nombre        el nombre del pedido
     * @param modelo        el modelo del pedido
     * @param talla         la talla del pedido
     * @param direccion     la dirección de entrega del pedido
     * @param cod_cliente   el código del cliente asociado al pedido
     */
    public void crearPedido(int codigo, String nombre, String modelo, String talla, String direccion, int cod_cliente) {
        Pedidos pedidos = new Pedidos(codigo, nombre, modelo, talla, direccion, cod_cliente);
    }

    /**
     * Obtiene el número de seguridad social del trabajador.
     *
     * @return el número de seguridad social del trabajador
     */
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    /**
     * Establece el número de seguridad social del trabajador.
     *
     * @param numeroSeguridadSocial el número de seguridad social a establecer
     */
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}

