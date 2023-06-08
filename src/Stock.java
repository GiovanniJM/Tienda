/**
 * Clase que representa el stock de productos en una tienda.
 */

public class Stock {
    private int codigo;
    private int codigoBarras;
    private String modelo;
    private String ofertas;
    private char talla;

    /**
     * Constructor de la clase Stock.
     *
     * @param codigo        el código del producto en el stock
     * @param codigoBarras  el código de barras del producto
     * @param modelo        el modelo del producto
     * @param ofertas       las ofertas aplicables al producto
     * @param talla         la talla del producto
     */

    public Stock(int codigo, int codigoBarras, String modelo, String ofertas, char talla) {
        this.codigo = codigo;
        this.codigoBarras = codigoBarras;
        this.modelo = modelo;
        this.ofertas = ofertas;
        this.talla = talla;
    }

    // Getters y setters para los atributos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOfertas() {
        return ofertas;
    }

    public void setOfertas(String ofertas) {
        this.ofertas = ofertas;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }
}
