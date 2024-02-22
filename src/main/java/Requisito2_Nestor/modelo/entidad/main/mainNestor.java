package Requisito2_Nestor.modelo.entidad.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class mainNestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("JPAlibreria");
		EntityManager em = factoria.createEntityManager();
		em.close();
	}

}
