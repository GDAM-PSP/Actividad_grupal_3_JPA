package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Libreria;

public interface DaoLibreria {
	public int insertar(Libreria l);
	public int borrar(int id);
	public Libreria modificar(Libreria l);
	public Libreria buscar(int id);
	public List<Libreria> listar();
}
