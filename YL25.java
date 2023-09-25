import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentCSVReader {

    private static final String CSV_FILE_PATH = "students.csv";

    public static void main(String[] args) throws IOException {
        List<Student> students = readStudentsFromCSV(CSV_FILE_PATH);
        
        System.out.println("Õpilaste arv: " + students.size());
        
        System.out.println("Esimesed 10 õpilast:");
        displayFirstNStudents(students, 10);
        
        System.out.println("Kolm suvalist õpilast:");
        displayRandomStudents(students, 3);
        
        System.out.println("Ainult emailid:");
        displayEmails(students);
        
        System.out.println("Nimede esitähed:");
        displayNameInitials(students);
        
        System.out.println("Paroolid:");
        generatePasswords(students);
    }

    public static List<Student> readStudentsFromCSV(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader reader = new FileReader(filePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());

        for (CSVRecord record : csvParser) {
            String name = record.get("Name");
            String email = record.get("Email");
            String lastName = record.get("Last Name");
            students.add(new Student(name, email, lastName));
        }

        csvParser.close();
        return students;
    }

    public static void displayFirstNStudents(List<Student> students, int n) {
        for (int i = 0; i < Math.min(n, students.size()); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void displayRandomStudents(List<Student> students, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(students.size());
            System.out.println(students.get(randomIndex));
        }
    }

    public static void displayEmails(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getEmail());
        }
    }

    public static void displayNameInitials(List<Student> students) {
        for (Student student : students) {
            String[] nameParts = student.getName().split(" ");
            StringBuilder initials = new StringBuilder();
            for (String part : nameParts) {
                initials.append(part.charAt(0));
            }
            System.out.println(initials.toString());
        }
    }

    public static void generatePasswords(List<Student> students) {
        Random random = new Random();
        for (Student student : students) {
            int randomNum = random.nextInt(1000); // Suvaline arv
            String password = student.getLastName() + randomNum;
            System.out.println(student.getName() + ": " + password);
        }
    }
}

class Student {
    private String name;
    private String email;
    private String lastName;

    public Student(String name, String email, String lastName) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Last Name: " + lastName;
    }