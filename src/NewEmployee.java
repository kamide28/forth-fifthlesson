public class NewEmployee {
    private String name;
    private int age;
    private String department;

    public NewEmployee(String name, int age, String assignment) {
        this.name = name;
        this.age = age;
        this.department = assignment;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
