package topic7_java_config.task4;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public void processAccount(String accountId){
        System.out.println("AccountService: processing account " + accountId);
        accountRepository.save(accountId);
    }
}
