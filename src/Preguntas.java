/**
 * Clase que representa las preguntas relacionadas a incidencias.
 */

public class Preguntas {
    private int codigo;
    private String incidencia;
    private String nombre;

    /**
     * Constructor de la clase Preguntas.
     *
     * @param codigo      el código de la pregunta
     * @param incidencia  la incidencia relacionada a la pregunta
     * @param nombre      el nombre de la pregunta
     */

    public Preguntas(int codigo, String incidencia, String nombre) {
        this.codigo = codigo;
        this.incidencia = incidencia;
        this.nombre = nombre;
    }

    // Getters y setters para los atributos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
