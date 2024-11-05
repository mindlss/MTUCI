import java.util.HashMap;

class Student {
    String name;
    String surname;
    int age;
    double gpa;

    public Student(String name, String surname, int age, double gpa) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", возраст: " + age + ", средний балл: " + gpa;
    }
}

public class StudentHashMap {
    private HashMap<String, Student> studentMap;

    public StudentHashMap() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String recordBookNumber, Student student) {
        studentMap.put(recordBookNumber, student);
    }

    public Student getStudent(String recordBookNumber) {
        return studentMap.get(recordBookNumber);
    }

    public void removeStudent(String recordBookNumber) {
        studentMap.remove(recordBookNumber);
    }

    public static void main(String[] args) {
        StudentHashMap students = new StudentHashMap();

        students.addStudent("12345", new Student("Иван", "Иванов", 20, 4.5));
        students.addStudent("67890", new Student("Анна", "Смирнова", 22, 4.8));

        System.out.println(students.getStudent("12345"));

        students.removeStudent("67890");

        System.out.println(students.getStudent("67890")); // Вернет null
    }
}
