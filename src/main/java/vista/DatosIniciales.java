package vista;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.entidad.Autor;
import modelo.persistencia.DaoAutorJPA;
import modelo.persistencia.interfaces.DaoAutor;

public class DatosIniciales {
	public static void Iniciacion() {
			crearAutor();
		
		
	}
	public static void crearAutor() {
		DaoAutor daoAutor = new DaoAutorJPA();
		Autor autor = new Autor();
		autor.setNombre("Ana");
		autor.setApellidos("García");
		autor.setFecha(crearFecha(1982,7,5));
		daoAutor.insertar(autor);

		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Michael");
		autor.setApellidos("Johnson");
		autor.setFecha(crearFecha(1979,3,12));
		daoAutor.insertar(autor);
		
		daoAutor = new DaoAutorJPA();
		autor = new Autor();
		autor.setNombre("Li");
		autor.setApellidos("Wei");
		autor.setFecha(crearFecha(1990,11,5));
		daoAutor.insertar(autor);
	}
	public static Date crearFecha(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia); // Los meses en Calendar están indexados desde 0
        return cal.getTime();
    }
}
