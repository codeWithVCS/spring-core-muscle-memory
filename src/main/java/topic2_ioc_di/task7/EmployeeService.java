package topic2_ioc_di.task7;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void registerEmployee(String employeeName){
        System.out.println("EmployeeService: registering employee " + employeeName);
        employeeRepository.save(employeeName);
        System.out.println("EmployeeService: employee " + employeeName + " registration complete.");
    }
}
