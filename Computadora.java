public class Computadora {
    // Atributos
    private String marca;
    private int memoriaRam;
    private double capacidadDisco;
    private boolean encendida;

    // Constructor por defecto
    public Computadora() {
        this.marca = "";
        this.memoriaRam = 0;
        this.capacidadDisco = 0.0;
        this.encendida = false;
    }

    // Constructor sobrecargado
    public Computadora(String marca, int memoriaRam, double capacidadDisco, boolean encendida) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.capacidadDisco = capacidadDisco;
        this.encendida = encendida;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(double capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    // Método toString
    public String toString() {
        return "Computadora: " + marca + ", RAM: " + memoriaRam + " GB, Disco: " + capacidadDisco + " TB, Encendida: " + encendida;
    }

    // Métodos de uso general
    public void encender() {
        encendida = true;
        System.out.println("La computadora está encendida");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La computadora está apagada");
    }
}
