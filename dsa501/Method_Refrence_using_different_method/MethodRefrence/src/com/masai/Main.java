public class Main {

	public static void main(String[] args) {

        // Using Non-Static Reference

		Student student = new Student("Hoshiyar", 24, "Science");
        
		Demo demo1 = student::printDetails;

		demo1.printDetail(student);
		
		// Using Static Reference
        
		Student student2 = new Student("Ravi", 27, "Maths");
        
		Demo demo2 = Student::printStaticDetails;
		demo2.printDetail(student2);
		
		// Using using constructor
	
		Student student3 = new Student("Amit", 21, "English");
		Demo demo3 = Student::new;
		demo3.printDetail(student3);
	}

}
