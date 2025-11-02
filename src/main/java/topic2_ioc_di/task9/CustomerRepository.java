package topic2_ioc_di.task9;

public class CustomerRepository {
    public void save(String customerName){
        System.out.println("CustomerRepository (XML): saved customer \"<" + customerName + ">\" successfully");
    }
}
