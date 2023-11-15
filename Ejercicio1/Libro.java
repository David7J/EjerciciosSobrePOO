public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

   
    public String mostrarISBN() {
        return ISBN;
    }

    public void establecerISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String mostrarTitulo() {
        return titulo;
    }

    public void establecerTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String mostrarAutor() {
        return autor;
    }

    public void establecerAutor(String autor) {
        this.autor = autor;
    }

    public int mostrarNumPaginas() {
        return numPaginas;
    }

    public void establecerNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

   
    public void mostrar() {
        System.out.println("El libro \"" + titulo + "\" con ISBN " + ISBN + " creado por el autor "
                + autor + " tiene " + numPaginas + " páginas.");
    }
}