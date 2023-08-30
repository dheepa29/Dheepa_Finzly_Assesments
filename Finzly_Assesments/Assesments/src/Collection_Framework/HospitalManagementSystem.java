import java.util.*;

class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Patient> patients = new HashMap<>();

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int patientAge = scanner.nextInt();
                    patients.put(patientId, new Patient(patientId, patientName, patientAge));
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    int viewPatientId = scanner.nextInt();
                    if (patients.containsKey(viewPatientId)) {
                        System.out.println("Patient Details: " + patients.get(viewPatientId));
                    } else {
                        System.out.println("Patient with ID " + viewPatientId + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    int searchPatientId = scanner.nextInt();
                    if (patients.containsKey(searchPatientId)) {
                        System.out.println("Patient found: " + patients.get(searchPatientId));
                    } else {
                        System.out.println("Patient with ID " + searchPatientId + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("List of Patients:");
                    for (Patient patient : patients.values()) {
                        System.out.println(patient);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
