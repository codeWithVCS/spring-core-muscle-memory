package topic5_component_scanning.task3;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String findById(String userId){
        System.out.println("UserRepository: fetching user " + userId);
        return "User-" + userId;
    }
}
