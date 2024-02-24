package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Libro;

/*
 * Interfaz de la tabla Libro con su CRUD
 */
public interface DaoLibro {
	public int insertar(Libro e);
	public int borrar(int id);
	public Libro modificar(Libro e);
	public Libro buscar(int id);
	public List<Libro> listar();
}
