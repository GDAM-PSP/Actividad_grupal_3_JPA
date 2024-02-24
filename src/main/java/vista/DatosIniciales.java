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
			//Este metodo crea por defecto 3 autores en la bbdd
			crearAutor();
			//Este metodo crea por defecto 2 editoriales en la bbdd
			crearEditorial();
			//Este metodo crea por defecto 8 libros que asocia a 1 atutor creado anteriormente en la bbdd
			crearLibros();
			//Este metodo crea por defecto 2 librerias y asocia 4 libros en la bbdd
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
		libreria.setNombre("Librería Gigamesh");
		libreria.setNombreDueno("Pepe alonso");
		daoLibreria.insertar(libreria);
		
		libreria = new Libreria();
		libreria.getLibros().add(daoLibro.buscar(5));
		libreria.getLibros().add(daoLibro.buscar(6));
		libreria.getLibros().add(daoLibro.buscar(7));
		libreria.getLibros().add(daoLibro.buscar(8));
		libreria.setDireccion("Málaga, España");
		libreria.setNombre("Gigamesh");
		libreria.setNombreDueno("Paco Diaz");
		daoLibreria.insertar(libreria);
	}
	public static void crearLibros() {
		DaoAutor daoAutor = new DaoAutorJPA();
		DaoEditorial daoEditorial = new DaoEditorialJPA();
		DaoLibro daoLibro = new DaoLibroJPA();
		Libro libro = new Libro();
		libro.setNombre("El imperio final");
		libro.setPrecio(22.5);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("La voz de las espadas");
		libro.setPrecio(18.5);
		libro.setAutor(daoAutor.buscar(2));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("La guerra de la amapola");
		libro.setPrecio(22.95);
		libro.setAutor(daoAutor.buscar(3));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("El camino de los reyes");
		libro.setPrecio(33);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Un poco de odio");
		libro.setPrecio(17.9);
		libro.setAutor(daoAutor.buscar(2));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Elantris");
		libro.setPrecio(12.99);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("Babel");
		libro.setPrecio(29.99);
		libro.setAutor(daoAutor.buscar(3));
		libro.setEditorial(daoEditorial.buscar(2));
		daoLibro.insertar(libro);
		
		libro = new Libro();
		libro.setNombre("El aliento de los dioses");
		libro.setPrecio(10.99);
		libro.setAutor(daoAutor.buscar(1));
		libro.setEditorial(daoEditorial.buscar(1));
		daoLibro.insertar(libro);
	}
	public static void crearAutor() {
		DaoAutor daoAutor = new DaoAutorJPA();
		Autor autor = new Autor();
		autor.setNombre("Brandon");
		autor.setApellidos("Sanderson");
		autor.setFecha(crearFecha(1975,12,19));
		daoAutor.insertar(autor);

		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Joe");
		autor.setApellidos("Abercrombie");
		autor.setFecha(crearFecha(1974,12,31));
		daoAutor.insertar(autor);
		
		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Rebecca");
		autor.setApellidos("Kuang");
		autor.setFecha(crearFecha(1996,5,29));
		daoAutor.insertar(autor);
	}
	public static void crearEditorial() {
		DaoEditorial daoEditorial = new DaoEditorialJPA();
		Editorial editorial = new Editorial();
		editorial.setNombre("Nova");
		editorial.setDireccion("Madrid,España");
		daoEditorial.insertar(editorial);
		
		editorial = new Editorial();
		editorial.setNombre("Alianza");
		editorial.setDireccion("Barcelona, España");
		daoEditorial.insertar(editorial);
	}
	
	//Este metodo ajusta la fecha del metodo DATE
	public static Date crearFecha(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia); // Los meses en Calendar están indexados desde 0
        return cal.getTime();
    }
}
