public class Giroscopio {
    // Atributos
    private String modelo;
    private double rango;
    private boolean activo;

    // Constructor por defecto
    public Giroscopio() {
        this.modelo = "";
        this.rango = 0.0;
        this.activo = false;
    }

    // Constructor sobrecargado
    public Giroscopio(String modelo, double rango, boolean activo) {
        this.modelo = modelo;
        this.rango = rango;
        this.activo = activo;
    }

    // Métodos de acceso
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getRango() {
        return rango;
    }

    public void setRango(double rango) {
        this.rango = rango;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método toString
    public String toString() {
        return "Giroscopio: " + modelo + ", Rango: " + rango + ", Activo: " + activo;
    }

    // Métodos de uso general
    public void encender() {
        activo = true;
        System.out.println("El giroscopio está encendido");
    }

    public void apagar() {
        activo = false;
        System.out.println("El giroscopio está apagado");
    }
}
