package modelo.persistencia;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import modelo.entidad.Libro;
import modelo.persistencia.interfaces.DaoLibro;

public class DaoLibroJPA implements DaoLibro{
	
	private DaoManejador manejador = new DaoManejador();
	private EntityManager em;
	
	@Override
	public int insertar(Libro e) {
		em = manejador.abrirConexion(em);
		if(em == null) {
			return 0;
		}
		
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.persist(e);
		tr.commit();
		manejador.cerrarConexion(em);
		//Libro creado
		return e.getId();
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
	    EntityManager em = null;
	    try {
	        em = manejador.abrirConexion(em);
	        if (em == null) {
	            System.out.println("Error: No se pudo abrir la conexión EntityManager.");
	            return null;
	        }
	        
	        Libro libro = em.find(Libro.class, id);
	        if (libro == null) {
	            System.out.println("No se encontró ningún libro con el ID proporcionado: " + id);
	        } else {
	            System.out.println("Libro encontrado: " + libro);
	        }
	        
	        return libro;
	    } catch (Exception e) {
	        System.out.println("Error al buscar el libro con ID " + id + ": " + e.getMessage());
	        return null;
	    } finally {
	        if (em != null) {
	            manejador.cerrarConexion(em);
	        }
	    }
	}


	@Override
	public List<Libro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
