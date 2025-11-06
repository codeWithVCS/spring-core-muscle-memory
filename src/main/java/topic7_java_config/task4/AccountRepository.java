package topic7_java_config.task4;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    public void save(String accountId){
        System.out.println("AccountRepository: saving account " + accountId);
    }
}
