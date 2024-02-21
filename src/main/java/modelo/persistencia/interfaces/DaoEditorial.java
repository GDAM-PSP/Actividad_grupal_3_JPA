package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Editorial;

//Interfaz de la tabla Editorial con su CRUD
public interface DaoEditorial {
	public int insertar(Editorial e);
	public int borrar(int id);
	public Editorial modificar(Editorial e);
	public Editorial buscar(int id);
	public List<Editorial> listar();
}
