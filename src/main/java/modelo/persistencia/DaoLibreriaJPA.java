package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;
import modelo.persistencia.interfaces.DaoLibreria;

public class DaoLibreriaJPA implements DaoLibreria{
	
	private DaoManejador manejador = new DaoManejador();
	private EntityManager em;
	
	@Override
	public int insertar(Libreria l) {
	    em = manejador.abrirConexion(em);
	    if (em == null) {
	        return 0;
	    }

	    EntityTransaction tr = em.getTransaction();
	    try {
	        tr.begin();
	        
	        // Obtener los libros gestionados por el EntityManager
	        List<Libro> libros = new ArrayList<>();
	        for (Libro libro : l.getLibros()) {
	            libros.add(em.find(Libro.class, libro.getId()));
	        }
	        l.setLibros(libros); // Actualizar la lista de libros con los gestionados por el EntityManager
	        
	        // Persistir la librería y sus libros
	        em.persist(l);
	        tr.commit();
	        
	        return l.getId();
	    } catch (Exception e) {
	        if (tr != null && tr.isActive()) {
	            tr.rollback();
	        }
	        e.printStackTrace();
	        return 0;
	    } finally {
	        manejador.cerrarConexion(em);
	    }
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
		em = manejador.abrirConexion(em);
		if(em == null) {
			return null;
		}
		return em.find(Libreria.class, id);
	}

	@Override
	public List<Libreria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
