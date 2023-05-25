package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	public static final EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("CollegeStudentUnit");
	}
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
	
}
