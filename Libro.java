public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private int numPaginas;
    private boolean prestado;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Sin autor";
        this.añPublicacion = 0;
        this.numPaginas = 0;
        this.prestado = false;
    }

    // Constructor sobrecargado
    public Libro(String titulo, String autor, int añoPublicacion, int numPaginas, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.numPaginas = numPaginas;
        this.prestado = prestado;
    }

    // Métodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = anioPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Método toString
    public String toString() {
        return "Libro: " + titulo + " (" + añoPublicacion + "), de " + autor + ", " + numPaginas + " páginas" + (prestado ? ", prestado" : "");
    }

    // Métodos de uso general
    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya ha sido prestado.");
        } else {
            prestado = true;
            System.out.println("El libro ha sido prestado.");
        }
    }

    public void devolver() {
        if (!prestado) {
            System.out.println("El libro no ha sido prestado.");
        } else {
            prestado = false;
            System.out.println("El libro ha sido devuelto.");
        }
    }
}
