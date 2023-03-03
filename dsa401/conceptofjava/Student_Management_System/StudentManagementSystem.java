import java.util.ArrayList;

// Write you code here and Class name should be "StudentManagementApp"
class StudentManagementApp {

    ArrayList<Student> al = new ArrayList<>();

    // Write addStudent method here with method signature - public void
    // addStudent(Student student);
    public void addStudent(Student student) {
        boolean check = false;
        if (student.getRollNo() >= 10 && student.getRollNo() <= 100) {
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).getRollNo() == student.getRollNo()) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                al.add(student);
            }
        } else if (student.getRollNo() < 10 || student.getRollNo() > 100) {
            System.out.println("Please enter valid roll number");

        }
        if (check) {
            System.out.println("Student is already present in the record");
        }

    }

    // Write viewStudent method here with method signature - public void
    // viewStudent(int rollNo);
    public void viewStudent(int rollNo) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getRollNo() == rollNo) {
                System.out.println("Student details");
                System.out.println("Roll No : " + rollNo);
                System.out.println("First Name : " + al.get(i).getFirstName());
                System.out.println("Last Name : " + al.get(i).getLastName());
                System.out.println("Date of Birth : " + al.get(i).getDob());
                System.out.println("Email : " + al.get(i).getEmail());
                System.out.println("Phone Number : " + al.get(i).getPhoneNumber());
                System.out.println("City : " + al.get(i).getCity());
                System.out.println("Gender : " + al.get(i).getGender());
                return;
            }
        }
        System.out.println("Student is not present in the record");

    }

    // Write deleteStudent method here with method signature - public void
    // deleteStudent(int rollNo);

    public void deleteStudent(int rollNo) {
        boolean flag = true;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getRollNo() == rollNo) {
                System.out.println("Student details");
                System.out.println("Roll No : " + rollNo);
                System.out.println("First Name : " + al.get(i).getFirstName());
                System.out.println("Last Name : " + al.get(i).getLastName());
                System.out.println("Date of Birth : " + al.get(i).getDob());
                System.out.println("Email : " + al.get(i).getEmail());
                System.out.println("Phone Number : " + al.get(i).getPhoneNumber());
                System.out.println("City : " + al.get(i).getCity());
                System.out.println("Gender : " + al.get(i).getGender());
                al.remove(i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Student is not present in the record");
        }

    }

    // Write totalStudents method here with method signature - public void
    // totalStudents();
    public void totalStudents() {
        System.out.println(al.size());
    }
}