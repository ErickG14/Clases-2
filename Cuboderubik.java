public class CuboDeRubik {
    // Atributos
    private int tamaño;
    private String[] caras;
    private boolean resuelto;

    // Constructor por defecto
    public CuboDeRubik() {
        this.tamaño = 3;
        this.caras = new String[] {"Rojo", "Azul", "Blanco", "Verde", "Naranja", "Amarillo"};
        this.resuelto = false;
    }

    // Constructor sobrecargado
    public CuboDeRubik(int tamano, String[] caras, boolean resuelto) {
        this.tamaño = tamaño;
        this.caras = caras;
        this.resuelto = resuelto;
    }

    // Métodos de acceso
    public int getTamaño() {
        return tamano;
    }

    public void setTamaño(int tamaño) {
        this.tamano = tamano;
    }

    public String[] getCaras() {
        return caras;
    }

    public void setCaras(String[] caras) {
        this.caras = caras;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    // Método toString
    public String toString() {
        return "Cubo de Rubik de tamaño " + tamano + ", caras: " + Arrays.toString(caras) + ", Resuelto: " + resuelto;
    }

    // Métodos de uso general
    public void mezclar() {
        resuelto = false;
        System.out.println("El cubo de Rubik ha sido mezclado.");
    }

    public void resolver() {
        resuelto = true;
        System.out.println("El cubo de Rubik ha sido resuelto.");
    }
}
