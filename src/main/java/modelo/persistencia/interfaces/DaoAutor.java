package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Autor;

//Interfaz de la tabla Autor con su CRUD
public interface DaoAutor {
	public int insertar(Autor a);
	public int borrar(int id);
	public Autor modificar(Autor a);
	public Autor buscar(int id);
	public List<Autor> listar();
}
