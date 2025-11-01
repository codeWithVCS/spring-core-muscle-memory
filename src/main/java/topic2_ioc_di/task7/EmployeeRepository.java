package topic2_ioc_di.task7;

public class EmployeeRepository {
    public void save(String employeeName){
        System.out.println("EmployeeRepository: saved employee " + employeeName + " successfully.");
    }
}
