import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Employee {
    private String empID;
    private String name;
    private double salary;

    public Employee(String empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

   
    public String getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class FrontDeskEmployee extends Employee {
    public FrontDeskEmployee(String empID, String name, double salary) {
        super(empID, name, salary);
    }

    public void checkInGuests() {
    }
}

class HousekeepingEmployee extends Employee {
    public HousekeepingEmployee(String empID, String name, double salary) {
        super(empID, name, salary);
    }

    public void cleanRoom() {
    }
}

public class HotelManagementSystem {
    private List<FrontDeskEmployee> frontDeskEmployees = new ArrayList<>();
    private List<HousekeepingEmployee> housekeepingEmployees = new ArrayList<>();

    public void hireEmployee(Employee employee, String category) {
        if (category.equals("Front Desk") && employee instanceof FrontDeskEmployee) {
            frontDeskEmployees.add((FrontDeskEmployee) employee);
        } else if (category.equals("Housekeeping") && employee instanceof HousekeepingEmployee) {
            housekeepingEmployees.add((HousekeepingEmployee) employee);
        }
    }

    public void fireEmployee(String empID, String category) {
        if (category.equals("Front Desk")) {
            frontDeskEmployees.removeIf(employee -> employee.getEmpID().equals(empID));
        } else if (category.equals("Housekeeping")) {
            housekeepingEmployees.removeIf(employee -> employee.getEmpID().equals(empID));
        }
    }

    public void assignTask(Employee employee, String task) {
        if (employee instanceof FrontDeskEmployee && task.equals("Check-in Guests")) {
            ((FrontDeskEmployee) employee).checkInGuests();
        } else if (employee instanceof HousekeepingEmployee && task.equals("Clean Room")) {
            ((HousekeepingEmployee) employee).cleanRoom();
        } else {
            System.out.println("Invalid task assignment for employee category.");
        }
    }

    public static void main(String[] args) {
        HotelManagementSystem hotelSystem = new HotelManagementSystem();

        FrontDeskEmployee employee1 = new FrontDeskEmployee("FD001", "John", 2500);
        HousekeepingEmployee employee2 = new HousekeepingEmployee("HK001", "Alice", 2000);

        hotelSystem.hireEmployee(employee1, "Front Desk");
        hotelSystem.hireEmployee(employee2, "Housekeeping");

        hotelSystem.assignTask(employee1, "Check-in Guests");
        hotelSystem.assignTask(employee2, "Clean Room");
    }
}
