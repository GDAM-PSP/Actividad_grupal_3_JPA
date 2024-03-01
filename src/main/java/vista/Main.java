package vista;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import modelo.entidad.Autor;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.persistencia.DaoManejador;

public class Main {

	static private EntityManager em;

	public static void main(String args[]) {
		System.out.println("------EMPIEZA--EL---PROGRAMA------");
		// Crea las tablas con la bbdd y mete los datos en cada una de las tablas
		DatosIniciales.Iniciacion();
		// Muestra los datos en la bbdd
		mostrarDatos();
		System.out.println("------ACABA----EL---PROGRAMA------");
	}

	/**
	 * 4 consultas JPQL
	 */
	@SuppressWarnings("unchecked")
	public static void mostrarDatos() {
		DaoManejador daoManejador = new DaoManejador();
		em = daoManejador.abrirConexion(em);

		// Sacamos los libros
		System.out.println("******* CONSULTA 1 **********");
		Query query = em.createQuery("Select l From Libro l JOIN FETCH l.editorial JOIN FETCH l.autor");
		List<Libro> listLibros = query.getResultList();
		for (Libro l : listLibros) {
			System.out.printf("Título: %s, Editorial: %s, Autor: %s%n", l.getNombre(), l.getEditorial().getNombre(),
					l.getAutor().getNombre());
			System.out.println();
		}
		em.close();
		em = daoManejador.abrirConexion(em);

		System.out.println("******* CONSULTA 2 **********");
		// Sacamos el autor con sus libros
		Query query2 = em.createQuery("Select a From Autor a JOIN FETCH a.libro ");
		List<Autor> listAutor = query2.getResultList();
		for (Autor l : listAutor) {
			System.out.printf("Nombre Autor: %s", l.getNombre());
			System.out.println();
			System.out.println("Nombres de sus libros");
			for (Libro libro : l.getLibro()) {
				System.out.println(libro.getNombre());
			}
			System.out.println();
		}
		em.close();
		em = daoManejador.abrirConexion(em);

		System.out.println("******* CONSULTA 3 **********");
		// Sacamos los libros de cada libreria asociadas
		Query query3 = em.createQuery("Select l From Libreria l JOIN FETCH l.libros");
		List<Libreria> listLibreria = query3.getResultList();
		for (Libreria l : listLibreria) {
			System.out.printf("Nombre Libreria: %s", l.getNombre());
			System.out.println();
			System.out.println("Nombres de sus libros");
			for (Libro libro : l.getLibros()) {
				System.out.println(libro.getNombre());
			}
			System.out.println();
		}
		em.close();
		em = daoManejador.abrirConexion(em);

		System.out.println("******* CONSULTA 4 **********");
		// Sacamos los libros y sus librerias
		Query query4 = em.createQuery("Select l From Libro l JOIN FETCH l.libreria");
		listLibros = query4.getResultList();
		for (Libro l : listLibros) {
			System.out.printf("Nombre Libro: %s", l.getNombre());
			System.out.println();
			System.out.println("Nombre de las librerias asociadas:");
			for (Libreria libreria : l.getLibreria()) {
				System.out.println(libreria.getNombre());
			}
			System.out.println();
		}
		em.close();
	}
}
