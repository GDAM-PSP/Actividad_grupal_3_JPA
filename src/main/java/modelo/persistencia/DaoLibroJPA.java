package modelo.persistencia;

import java.util.List;

import modelo.entidad.Libro;
import modelo.persistencia.interfaces.DaoLibro;

public class DaoLibroJPA implements DaoLibro{

	@Override
	public int insertar(Libro e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int borrar(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Libro modificar(Libro e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
