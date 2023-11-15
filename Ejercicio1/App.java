public class App {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("978-1-4028-9462-6", "El Alquimista", "Paulo Coelho", 208);
        Libro libro2 = new Libro("978-84-666-1369-7", "Cien años de soledad", "Gabriel García Márquez", 432);
  
        libro1.mostrar();
        libro2.mostrar();

        if (libro1.mostrarNumPaginas() > libro2.mostrarNumPaginas()) {
            System.out.println("El libro \"" + libro1.mostrarTitulo() + "\" tiene más páginas que el libro \"" + libro2.mostrarTitulo() + "\".");
        } else if (libro1.mostrarNumPaginas() < libro2.mostrarNumPaginas()) {
            System.out.println("El libro \"" + libro2.mostrarTitulo() + "\" tiene más páginas que el libro \"" + libro1.mostrarTitulo() + "\".");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}