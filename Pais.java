public class Pais {
    // Atributos
    private String nombre;
    private String capital;
    private int poblacion;

    // Constructor por defecto
    public Pais() {
        this.nombre = "";
        this.capital = "";
        this.poblacion = 0;
    }

    // Constructor sobrecargado
    public Pais(String nombre, String capital, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    // Método toString
    public String toString() {
        return "País: " + nombre + ", Capital: " + capital + ", Población: " + poblacion;
    }

    // Métodos de uso general
    public void aumentarPoblacion(int cantidad) {
        poblacion += cantidad;
    }

    public boolean esIgual(Pais otroPais) {
        return nombre.equals(otroPais.getNombre()) && capital.equals(otroPais.getCapital()) && poblacion == otroPais.getPoblacion();
    }
}
