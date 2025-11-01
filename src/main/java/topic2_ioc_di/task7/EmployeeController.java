package topic2_ioc_di.task7;

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void createEmployee(String employeeName){
        System.out.println("EmployeeController: request received to create employee  " + employeeName);
        employeeService.registerEmployee(employeeName);
        System.out.println("EmployeeController: response sent for employee " + employeeName);
    }
}
