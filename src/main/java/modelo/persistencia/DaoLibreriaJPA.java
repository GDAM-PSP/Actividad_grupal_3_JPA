package modelo.persistencia;

import java.util.List;

import modelo.entidad.Libreria;
import modelo.persistencia.interfaces.DaoLibreria;

public class DaoLibreriaJPA implements DaoLibreria{

	@Override
	public int insertar(Libreria l) {
		return 0;
	}

	@Override
	public int borrar(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Libreria modificar(Libreria l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libreria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
