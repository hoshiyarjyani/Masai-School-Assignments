// Write you code here and Class name should be "Student" and "StudentMarksNameComparator" .
class Student {
    private int roll;
    private String name;
    private int marks;

    public Student() {
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

}

class StudentMarksNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getMarks() == s2.getMarks()) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getMarks(), s2.getMarks());
        }
    }
}