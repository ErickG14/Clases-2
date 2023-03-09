public class Gato {

    // Atributos
    private String nombre;
    private int edad;
    private boolean estaVacunado;

    // Constructores
    public Gato() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.estaVacunado = false;
    }

    public Gato(String nombre, int edad, boolean estaVacunado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estaVacunado = estaVacunado;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", edad=" + edad + ", estaVacunado=" + estaVacunado + "]";
    }

    // Métodos de uso general
    public void maullar() {
        System.out.println(this.nombre + " está maullando...");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo...");
    }
}
