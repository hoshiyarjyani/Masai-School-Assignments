public class Student {
	String Name;
	int Age;
	String Subject;

    //constructor for the Constructor Method Call
	public Student(Student student) {
		System.out.println(student.getName());

		System.out.println(student.getAge());

		System.out.println(student.getSubject());
	}
    
    // Normal Constructor
	public Student(String name, int age, String subject) {
		Name = name;
		Age = age;
		Subject = subject;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public void printDetails(Student student) {
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age);
		System.out.println("Subject: " + Subject);
	}

	public static void printStaticDetails(Student student) {
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Subject: " + student.getSubject());
	}

}
