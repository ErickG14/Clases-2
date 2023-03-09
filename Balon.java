public class Balon {
    private String deporte;
    private String color;
    private double peso;

    // Constructor por defecto
    public Balon() {
        this.deporte = "Desconocido";
        this.color = "Blanco";
        this.peso = 0.0;
    }

    // Constructor sobrecargado
    public Balon(String deporte, String color, double peso) {
        this.deporte = deporte;
        this.color = color;
        this.peso = peso;
    }

    // Métodos de acceso
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método toString
    public String toString() {
        return "Balon{deporte=" + deporte + ", color=" + color + ", peso=" + peso + "}";
    }

    // Métodos de uso general
    public void inflar() {
        System.out.println("El balón se está inflando...");
    }

    public void desinflar() {
        System.out.println("El balón se está desinflando...");
    }
}
