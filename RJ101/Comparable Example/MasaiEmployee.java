class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String city;

    public Employee() {
    }

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Employee e) {
        Employee emp = (Employee) e;
        return Integer.compare(this.id, emp.id);
    }

}
