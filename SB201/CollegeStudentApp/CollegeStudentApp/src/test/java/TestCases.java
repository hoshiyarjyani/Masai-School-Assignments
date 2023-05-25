import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import dao.CollegeDao;
import dao.StudentDao;
import entities.College;
import entities.Student;
import exceptions.CollegeException;
import exceptions.StudentException;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import utilities.EMUtil;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCases {

	private static double marks = 0;
	
	static CollegeDao clgDao;
	static StudentDao stdDao;
	
	@Test
	@Order(1)
	void basicChecks() throws Exception {
		Assertions.assertAll(() -> {
			if(Class.forName("entities.College").getDeclaredFields().length >= 4 && Class.forName("entities.College").getDeclaredAnnotationsByType(Entity.class).length == 1)
			
			if(Class.forName("entities.Student").getDeclaredFields().length >= 6 && Class.forName("entities.Student").getDeclaredAnnotationsByType(Entity.class).length == 1)	
			
			marks += 1;
			
			if(CollegeDao.class.isAssignableFrom(Class.forName("dao.CollegeDaoImpl"))) {
				clgDao = (CollegeDao) Class.forName("dao.CollegeDaoImpl").getDeclaredConstructor().newInstance();
			}
			
			if(StudentDao.class.isAssignableFrom(Class.forName("dao.StudentDaoImpl"))) {
				stdDao = (StudentDao) Class.forName("dao.StudentDaoImpl").getDeclaredConstructor().newInstance();
			}
			
			marks += 1;
			
		});
	}
	
	@Test
	@Order(2)
	void registerCollege() throws Exception {
		Assertions.assertAll(() -> {
			
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
	        College clg = getCollege("SVIT", "Pune");
	        
	        
	        College clg1 = null;
	        clg1 = clgDao.registerCollege(clg);
	        if(clg1 == null) 
	        	Assertions.fail("method is returning a null value of college object");
	        
	        if((int)College.class.getDeclaredMethod("getCollegeId").invoke(clg1) == 0)
	        	Assertions.fail("method is returning a College object without collegeId");
	        
	        College clg2 = em.find(College.class, College.class.getDeclaredMethod("getCollegeId").invoke(clg1));
	        if(clg2 == null || !College.class.getDeclaredMethod("getCollegeName").invoke(clg2).equals(College.class.getDeclaredMethod("getCollegeName").invoke(clg))) 
	        	Assertions.fail("method is not registering College defined data into the database correctly");
	        
	        marks += 1;
	        em.close();
		});
	}
	
	@Test
	@Order(3)
	void registerCollegeException() throws Exception {
		Assertions.assertAll(() -> {
			College clg = getCollege("MIT", "Mumbai");
	        
            Assertions.assertDoesNotThrow(() -> clgDao.registerCollege(clg), "Method is throwing exception even when it is saving an college object");
            
            Assertions.assertThrows(CollegeException.class,() -> clgDao.registerCollege(null), "method is not throwing exception, even when we are passing null objects while adding an college");
            
            marks += 1;
		});
	}
	
	
	@Test
	@Order(4)
	void getCollegeFromCollegeId() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			College clg = addCollege(em);
	        
	        College clg1 = clgDao.getCollegeFromCollegeId((int)College.class.getDeclaredMethod("getCollegeId").invoke(clg));
	        
	        Assertions.assertEquals(
	        		(int)College.class.getDeclaredMethod("getCollegeId").invoke(clg), 
	        		College.class.getDeclaredMethod("getCollegeId").invoke(clg1),
	        		"method is not finding the College by id correctly"
	        		);
	        
	        marks += 1;
	        em.close();
		});
	}
	
	
	@Test
	@Order(5)
	void getCollegeFromCollegeIdException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			College clg = addCollege(em);
	
	        College finalCollege = clg;
	        Assertions.assertDoesNotThrow(() -> {
	            	clgDao.getCollegeFromCollegeId(
	            		(int)College.class.getDeclaredMethod("getCollegeId").invoke(finalCollege)
	            		);
	        		},
	        		"method is throwing exception even when we are passing the College which is already register"
	        		);
	
	        Assertions.assertThrows(
	        		CollegeException.class,
	        		() -> clgDao.getCollegeFromCollegeId(-1),
	        		"method is not throwing Exception when unknown collegeId pass"
	        		);
	        
	        marks += 1;
	        em.close();
		});
	}
	
	@Test
	@Order(6)
	void getAllCollege() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			cleanData(em);
			List<College> clgs = addColleges(em);			
	        List<College> colleges = clgDao.getAllCollege();
	        
	        Assertions.assertEquals(
	        		clgs.size(),
	        		colleges.size(),
	        		"method is not finding all colleges correctly"
	        		);
	        
	        Assertions.assertEquals(
	        		true,
	        		checkColleges(colleges, clgs),
	        		"method is not finding all colleges correctly"
	        		);
	        
	        marks += 1;
	        em.close();
		});
	}
	
	@Test
	@Order(7)
	void getAllCollegeException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			
			cleanData(em);
			Assertions.assertThrows(
					CollegeException.class, 
					() -> clgDao.getAllCollege(),
					"getAllCollege method is not throwing exception even non of the college is in database"
					);
			
			addColleges(em);
			Assertions.assertDoesNotThrow(() -> {
					clgDao.getAllCollege();
					},
					"getAllCollege method is throwing exception even getting the colleges"
					);
			
			marks += 1;
			em.close();
		});
	}
	
	@Test
	@Order(8)
	void registerStudentToCollege() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			Student std = addStudent(em);
			College clg = addCollege(em);
			
			Student std1 = clgDao.registerStudentToCollege((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std), (int)College.class.getDeclaredMethod("getCollegeId").invoke(clg));
			if(Student.class.getDeclaredMethod("getCollege").invoke(std1) == null)
				Assertions.fail("Student is not register to given college");
			
			marks += 1;
			em.close();
		});
	}
	
	@Test
	@Order(9)
	void registerStudentToCollegeException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			Student std = addStudent(em);
			College clg = addCollege(em);
			
			Assertions.assertDoesNotThrow( () -> {
					clgDao.registerStudentToCollege(
							(int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std), 
							(int)College.class.getDeclaredMethod("getCollegeId").invoke(clg)
							);
					},
					"registerStudentToCollege method throwing the exception while assigning student"
					);
			
			Assertions.assertThrows(
					CollegeException.class,
					() -> clgDao.registerStudentToCollege((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std), -1), 
					"method is not throwing exception, even when we are passing null objects while getting an college"
					);
			
			Assertions.assertThrows(
					StudentException.class,
					() -> clgDao.registerStudentToCollege(-1, (int)College.class.getDeclaredMethod("getCollegeId").invoke(clg)), 
					"method is not throwing exception, even when we are passing null objects while getting an student"
					);
			
			marks += 1;
			em.close();
		});
	}
	
	@Test
	@Order(10)
	void getAllStudentsFromCollegeId() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			cleanData(em);
			College clg = addCollege(em);
			List<Student> stds = addStudentsWithCId(em, clg);
			List<Student> students = clgDao.getAllStudentsFromCollegeId((int)College.class.getDeclaredMethod("getCollegeId").invoke(clg));
			
			Assertions.assertEquals(
	        		stds.size(),
	        		students.size(),
	        		"getAllStudentsFromCollegeId method is not finding all students data correctly"
	        		);
	        
	        Assertions.assertEquals(
	        		true,
	        		checkStudents(students, stds),
	        		"getAllStudentsFromCollegeId method is not finding all students data correctly"
	        		);
			
			marks += 1;
			em.close();
		});
	}
	
	@Test
	@Order(11)
	void getAllStudentsFromCollegeIdException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			
			cleanData(em);
			College clg = addCollege(em);
			Assertions.assertThrows(
					StudentException.class, 
					() -> clgDao.getAllStudentsFromCollegeId((int)College.class.getDeclaredMethod("getCollegeId").invoke(clg)),
					"getAllStudentsFromCollegeId method is not throwing exception even non of the student register to the college"
					);
			
			addStudentsWithCId(em, clg);
			Assertions.assertDoesNotThrow(() -> {
					clgDao.getAllStudentsFromCollegeId((int)College.class.getDeclaredMethod("getCollegeId").invoke(clg));
					},
					"getAllStudentsFromCollegeId method is throwing exception even getting the student data from colleges"
					);
			
			Assertions.assertThrows(
					CollegeException.class,
					() -> clgDao.getCollegeFromCollegeId(-1), 
					"method is not throwing exception, even when we are passing null objects while getting an college"
					);
			
			marks += 1;
			em.close();
		});
	}
	
	@Test
	@Order(12)
	void registerStudent() throws Exception {
		Assertions.assertAll(() -> {
			
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
	        Student std = getStudent("Subhash", "9473983474", "prabhu@gmail.com", true);
	        
	        Student std1 = null;
	        std1 = stdDao.registerStudent(std);
	        if(std1 == null) 
	        	Assertions.fail("registerStudent method is returning a null value of student object");
	        
	        if((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std1) == 0)
	        	Assertions.fail("registerStudent method is returning a Student object without studentRoll");

	        Student std2 = em.find(Student.class, Student.class.getDeclaredMethod("getStudentRoll").invoke(std1));
	        if(std2 == null || !Student.class.getDeclaredMethod("getStudentRoll").invoke(std2).equals(Student.class.getDeclaredMethod("getStudentRoll").invoke(std))) 
	        	Assertions.fail("registerStudent method is not registering given student defined data into the database correctly");
	        
	        marks += 1;
	        em.close();
		});
	}
	
	@Test
	@Order(13)
	void registerStudentException() throws Exception {
		Assertions.assertAll(() -> {
			Student std = getStudent("Subhash", "9473983474", "prabhu@gmail.com", true);
			
            Assertions.assertDoesNotThrow(
            		() -> stdDao.registerStudent(std),
            		"registerStudent Method is throwing exception even when it is saving an student object"
            		);
            Assertions.assertThrows(CollegeException.class,() -> clgDao.registerCollege(null), "method is not throwing exception, even when we are passing null objects while adding an college");

            Assertions.assertThrows(
            		StudentException.class,
            		() -> stdDao.registerStudent(null), 
            		"registerStudent method is not throwing exception, even when we are passing null objects while adding an student"
            		);
            marks += 1;
		});
	}
	
	@Test
	@Order(14)
	void getStudentFromCollegeId() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
	        Student std = addStudent(em);
	        
	        Student std1 = stdDao.getStudentFromStudentId((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std));
	        
	        Assertions.assertEquals(
	        		(int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std), 
	        		Student.class.getDeclaredMethod("getStudentRoll").invoke(std1),
	        		"method is not finding the Student by studentid correctly"
	        		);
	        
	        marks += 1;
	        em.close();
		});
	}
	
	
	@Test
	@Order(15)
	void getStudentFromCollegeIdException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			Student std = addStudent(em);
			
	        Student finalStudent = std;
	        
	        Assertions.assertDoesNotThrow(() -> {
	            	stdDao.getStudentFromStudentId(
	            		(int)Student.class.getDeclaredMethod("getStudentRoll").invoke(finalStudent)
	            		);
	        		},
	        		"method is throwing exception even when we are passing the student which is already in the database"
	        		);
	
	        Assertions.assertThrows(
	        		StudentException.class,
	        		() -> stdDao.getStudentFromStudentId(-1),
	        		"method is not throwing Exception when unknown StudentId/roll pass"
	        		);
	        
	        marks += 1;
	        em.close();
		});
	}
	
	@Test
	@Order(16)
	void getAllActiveStudents() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			cleanData(em);
			College clg = addCollege(em);
			List<Student> stds = addStudentsWithCId(em, clg);
			
			List<Student> students = stdDao.getAllActiveStudents();
			
			checkStudents(students, stds);
			
			Assertions.assertEquals(
	        		stds.size(),
	        		students.size(),
	        		"getAllActiveStudents method is not finding all students data correctly"
	        		);
	        
	        Assertions.assertEquals(
	        		true,
	        		checkStudents(students, stds),
	        		"getAllActiveStudents method is not finding all students data correctly"
	        		);
			
			em.close();
            marks += 1;
		});
	}
	
	@Test
	@Order(17)
	void getAllActiveStudentsException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);

			cleanData(em);
			Assertions.assertThrows(
					StudentException.class, 
					() -> stdDao.getAllActiveStudents(),
					"getAllActiveStudents method is not throwing exception even non of the student register"
					);
			College clg = addCollege(em);
			addStudentsWithCId(em, clg);
			Assertions.assertDoesNotThrow(() -> {
					stdDao.getAllActiveStudents();
					},
					"getAllActiveStudents method is throwing exception even getting the student data from colleges"
					);
			
			em.close();
            marks += 1;
		});
	}
	
	@Test
	@Order(18)
	void getCollegeFromStudentId() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			cleanData(em);
			
			College clg = addCollege(em);
			Student std = addStudentsWithCId(em, clg).get(0);
			
			College college = stdDao.getCollegeFromStudentId((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std));
			
			Assertions.assertEquals(
					College.class.getDeclaredMethod("getCollegeId").invoke(clg),
					College.class.getDeclaredMethod("getCollegeId").invoke(college),
					"College information of the given studet is wrong"
					);
			
			em.close();
            marks += 1;
		});
	}
	
	@Test
	@Order(19)
	void getCollegeFromStudentIdsException() throws Exception {
		Assertions.assertAll(() -> {
			EntityManager em = (EntityManager) Class.forName("utilities.EMUtil").getDeclaredMethod("provideEntityManager").invoke(EMUtil.class);
			cleanData(em);
			
			Assertions.assertThrows(
	        		StudentException.class,
	        		() -> stdDao.getCollegeFromStudentId(-1),
	        		"getCollegeFromStudentIdsException method is not throwing Exception when unknown StudentId/roll pass"
	        		);
			
			Student std = addStudent(em);
			
			Assertions.assertThrows(
	        		CollegeException.class,
	        		() -> stdDao.getCollegeFromStudentId((int)Student.class.getDeclaredMethod("getStudentRoll").invoke(std)),
	        		"getCollegeFromStudentIdsException method is not throwing Exception even student not register to any college"
	        		);
			em.close();
            marks += 1;
		});
	}
	
	
	@Test
    @Order(20)
    void buildScore(){
        System.out.println("[MARKS] marks is " + marks);
    }
	
	static College getCollege(String clgName, String clgAdd) throws Exception {
		
		College clg = new College();
		College.class.getDeclaredMethod("setCollegeName", String.class).invoke(clg, clgName);
        College.class.getDeclaredMethod("setCollegeAddress", String.class).invoke(clg, clgAdd);
		
		return clg;
	}
	
	static Student getStudent(String studentName, String mobileNumber, String email, boolean status) throws Exception {
		
		Student std = new Student();
		Student.class.getDeclaredMethod("setStudentName", String.class).invoke(std, studentName);
		Student.class.getDeclaredMethod("setMobileNumber", String.class).invoke(std, mobileNumber);
		Student.class.getDeclaredMethod("setEmail", String.class).invoke(std, email);
		Student.class.getDeclaredMethod("setStatus", boolean.class).invoke(std, status);
		
		return std;
	}
	
	static Student getStudentWithCId(String studentName, String mobileNumber, String email, boolean status, College clg) throws Exception {
		
		Student std = new Student();
		Student.class.getDeclaredMethod("setStudentName", String.class).invoke(std, studentName);
		Student.class.getDeclaredMethod("setMobileNumber", String.class).invoke(std, mobileNumber);
		Student.class.getDeclaredMethod("setEmail", String.class).invoke(std, email);
		Student.class.getDeclaredMethod("setStatus", boolean.class).invoke(std, status);
		Student.class.getDeclaredMethod("setCollege", College.class).invoke(std, clg);
		
		return std;
	}
	
	static List<College> addColleges(EntityManager em) throws Exception {
		
		em.getTransaction().begin();
        em.persist(getCollege("DYP", "Pune"));
        em.persist(getCollege("MIT", "Mumbai"));
        em.persist(getCollege("SVIT", "Pune"));
        em.getTransaction().commit();
		
		return em.createQuery("FROM College", College.class).getResultList();
	}
	
	static College addCollege(EntityManager em) throws Exception {
	
		College clg = getCollege("DYP", "Pune");
		em.getTransaction().begin();
        em.persist(clg);
        em.getTransaction().commit();
		
		return clg;
	}
	
	static List<Student> addStudents(EntityManager em) throws Exception {
		
		em.getTransaction().begin();
        em.persist(getStudent("Subhash", "9473983474", "prabhu@gmail.com", true));
        em.persist(getStudent("Sandip", "8793983474", "sandip@gmail.com", false));
        em.persist(getStudent("Rahul", "9479883474", "rahul@gmail.com", true));
        em.getTransaction().commit();
		
		return em.createQuery("FROM Student", Student.class).getResultList();
	}
	
	static List<Student> addStudentsWithCId(EntityManager em, College clg) throws Exception {
		
		Student std1 = getStudentWithCId("Subhash", "9473983474", "prabhu@gmail.com", true, clg);
		em.getTransaction().begin();
        em.persist(std1);
        em.persist(getStudentWithCId("Sandip", "8793983474", "sandip@gmail.com", false, clg));
        em.getTransaction().commit();
		
		return Arrays.asList(std1);
	}
	
	static Student addStudent(EntityManager em) throws Exception {
		
		Student std = getStudent("Subhash", "9473983474", "prabhu@gmail.com", true);
		em.getTransaction().begin();
        em.persist(std);
        em.getTransaction().commit();
		
		return std;
	}
	
	static boolean checkColleges(List<College> colleges, List<College> clgs) throws Exception {
		
		for(int i=0; i<clgs.size(); i++) {
			if (!College.class.getDeclaredMethod("getCollegeId").invoke(colleges.get(i)).equals(College.class.getDeclaredMethod("getCollegeId").invoke(clgs.get(i)))) return false;
		}
		return true;
	}
	
	static boolean checkStudents(List<Student> students, List<Student> stds) throws Exception {
		return Student.class.getDeclaredMethod("getStudentName").invoke(stds.get(0)).equals(Student.class.getDeclaredMethod("getStudentName").invoke(students.get(0)));
	}
	
	static void cleanData(EntityManager em) {
		em.getTransaction().begin();
		em.createQuery("delete from Student").executeUpdate();
		em.createQuery("delete from College").executeUpdate();
		em.getTransaction().commit();
	}
	
}
