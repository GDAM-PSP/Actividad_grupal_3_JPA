package vista;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.Autor;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.persistencia.DaoAutorJPA;
import modelo.persistencia.DaoEditorialJPA;
import modelo.persistencia.DaoLibreriaJPA;
import modelo.persistencia.DaoLibroJPA;
import modelo.persistencia.interfaces.DaoAutor;
import modelo.persistencia.interfaces.DaoEditorial;
import modelo.persistencia.interfaces.DaoLibreria;
import modelo.persistencia.interfaces.DaoLibro;

public class DatosIniciales {
	public static void Iniciacion() {
			crearAutor();
			crearEditorial();
			crearLibros();
			crearLibreria();
		
	}
	public static void crearLibreria() {
		DaoLibreria daoLibreria = new DaoLibreriaJPA();
		DaoLibro daoLibro = new DaoLibroJPA();
		Libreria libreria = new Libreria();
		libreria.getLibros().add(daoLibro.buscar(1));
		libreria.getLibros().add(daoLibro.buscar(2));
		libreria.getLibros().add(daoLibro.buscar(3));
		libreria.getLibros().add(daoLibro.buscar(4));
		libreria.setDireccion("Barcelona, España");
		libreria.setNombre("Librería El Dorado");
		libreria.setNombreDueno("Pepe alonso");
		daoLibreria.insertar(libreria);
		
		libreria = new Libreria();
		libreria.getLibros().add(daoLibro.buscar(5));
		libreria.getLibros().add(daoLibro.buscar(6));
		libreria.getLibros().add(daoLibro.buscar(7));
		libreria.getLibros().add(daoLibro.buscar(8));
		libreria.setDireccion("Los Ángeles, Estados Unidos");
		libreria.setNombre("Book Haven");
		libreria.setNombreDueno("Paco Diaz");
		daoLibreria.insertar(libreria);
	}
	public static void crearLibros() {
		DaoAutor daoAutor = new DaoAutorJPA();
		DaoEditorial daoEditorial = new DaoEditorialJPA();
		DaoLibro daoLibro = new DaoLibroJPA();
		Libro libro = new Libro();
		libro.setNombre("El secreto del faro");
		libro.setPrecio(22.5);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("The Silent Forest");
		libro.setPrecio(29.5);
		libro.setAutor(daoAutor.buscar(2));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Destino incierto");
		libro.setPrecio(12.5);
		libro.setAutor(daoAutor.buscar(3));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Echoes of the Past");
		libro.setPrecio(30);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Infinite Horizons");
		libro.setPrecio(17.9);
		libro.setAutor(daoAutor.buscar(2));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Flor de loto");
		libro.setPrecio(9.99);
		libro.setAutor(daoAutor.buscar(3));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Under the Same Moon");
		libro.setPrecio(49.99);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Lost in Translation");
		libro.setPrecio(10.99);
		libro.setAutor(daoAutor.buscar(2));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
	}
	public static void crearAutor() {
		DaoAutor daoAutor = new DaoAutorJPA();
		Autor autor = new Autor();
		autor.setNombre("Ana");
		autor.setApellidos("García");
		autor.setFecha(crearFecha(1982,7,5));
		daoAutor.insertar(autor);

		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Michael");
		autor.setApellidos("Johnson");
		autor.setFecha(crearFecha(1979,3,12));
		daoAutor.insertar(autor);
		
		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Li");
		autor.setApellidos("Wei");
		autor.setFecha(crearFecha(1990,11,5));
		daoAutor.insertar(autor);
	}
	public static void crearEditorial() {
		DaoEditorial daoEditorial = new DaoEditorialJPA();
		Editorial editorial = new Editorial();
		editorial.setNombre("Luna Editores");
		editorial.setDireccion("Madrid,España");
		daoEditorial.insertar(editorial);
		
		editorial = new Editorial();
		editorial.setNombre("Stellar Press");
		editorial.setDireccion("Nueva York,Estados Unidos");
		daoEditorial.insertar(editorial);
	}
	public static Date crearFecha(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia); // Los meses en Calendar están indexados desde 0
        return cal.getTime();
    }
}
