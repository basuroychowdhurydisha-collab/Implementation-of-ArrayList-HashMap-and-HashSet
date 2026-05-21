import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Custom Exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class CollectionExample {

    // Method for exception handling
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid Age.");
        }
    }

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Ananya");
        students.add("Riya");

        System.out.println("ArrayList Example:");
        for (String name : students) {
            System.out.println(name);
        }

        // HashMap Example
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Rahul");
        studentMap.put(102, "Ananya");
        studentMap.put(103, "Riya");

        System.out.println("\nHashMap Example:");
        for (Integer id : studentMap.keySet()) {
            System.out.println(id + " -> " + studentMap.get(id));
        }

        // HashSet Example
        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Java"); // Duplicate value

        System.out.println("\nHashSet Example:");
        for (String course : courses) {
            System.out.println(course);
        }

        // Try-Catch Example
        System.out.println("\nException Handling:");

        try {
            checkAge(15);
        }

        catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        finally {
            System.out.println("Program Executed Successfully.");
        }
    }
}
