public class Lampara {
    private boolean encendida;
    private int potencia;
    private String marca;

    // Constructor por defecto
    public Lampara() {
        this.encendida = false;
        this.potencia = 0;
        this.marca = "Desconocida";
    }

    // Constructor sobrecargado
    public Lampara(boolean encendida, int potencia, String marca) {
        this.encendida = encendida;
        this.potencia = potencia;
        this.marca = marca;
    }

    // Métodos de acceso
    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método toString
    public String toString() {
        return "Lampara{encendida=" + encendida + ", potencia=" + potencia + ", marca=" + marca + "}";
    }

    // Métodos de uso general
    public void encender() {
        this.encendida = true;
        System.out.println("La lámpara se ha encendido.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("La lámpara se ha apagado.");
    }
}
