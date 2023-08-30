
import java.util.Objects;

class EmployeeDTO {
    private final Integer empId;
    private final String empName;
    private final Integer empSalary;

    public EmployeeDTO(Integer empId, String empName, Integer empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return this.getEmpName()+" "+this.getEmpSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO employeeDTO = (EmployeeDTO) o;
        return Objects.equals(empId, employeeDTO.empId) && Objects.equals(empName, employeeDTO.empName) && Objects.equals(empSalary, employeeDTO.empSalary);
    }
}

record EmployeeRecord(Integer empId, String empName, Integer empSalary) {
    public String toLowerCase(String name) {
        return name.toLowerCase();
    }

    public static String toUpperCase(String name) {
        return name.toUpperCase();
    }
}

public class RecordExample {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO = new EmployeeDTO(1, "Kadir", 90000);
        System.out.println(employeeDTO.getEmpName()+" "+employeeDTO.getEmpSalary()+" BDT");
        EmployeeRecord employeeRecord = new EmployeeRecord(2, "Kabir", 100000);
        System.out.println(employeeRecord.empName()+" "+employeeRecord.empSalary()+" BDT");
    }
}
