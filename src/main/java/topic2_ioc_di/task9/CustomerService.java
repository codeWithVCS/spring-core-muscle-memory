package topic2_ioc_di.task9;

public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(String customerName){
        System.out.println("CustomerService (Java Config): registering customer \"<" + customerName + ">\"");
        customerRepository.save(customerName);
        System.out.println("CustomerService (Java Config): registration complete.");
    }
}
