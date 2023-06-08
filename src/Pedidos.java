/**
 * Clase que representa los pedidos realizados por los clientes.
 */

public class Pedidos {
    private int codigo;
    private String nombre;
    private String modelo;
    private String talla;
    private String direccion;

    private int cod_cliente;

    /**
     * Constructor de la clase Pedidos.
     *
     * @param codigo       el código del pedido
     * @param nombre       el nombre del pedido
     * @param modelo       el modelo del pedido
     * @param talla        la talla del pedido
     * @param direccion    la dirección del pedido
     * @param cod_cliente  el código del cliente asociado al pedido
     */
    public Pedidos(int codigo, String nombre, String modelo, String talla, String direccion, int cod_cliente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.talla = talla;
        this.direccion = direccion;
        this.cod_cliente = cod_cliente;

    }

    // Getters y setters para los atributos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodCliente() {
        return cod_cliente;
    }

    public void setCodCliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

}
