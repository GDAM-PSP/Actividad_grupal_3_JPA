package modelo.persistencia;

import java.util.List;

import modelo.entidad.Editorial;
import modelo.persistencia.interfaces.DaoEditorial;

public class DaoEditorialJPA implements DaoEditorial{

	@Override
	public int insertar(Editorial e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int borrar(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Editorial modificar(Editorial e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editorial buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editorial> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
