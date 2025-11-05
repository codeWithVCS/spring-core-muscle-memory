package topic5_component_scanning.task3;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String getUser(String userId){
        System.out.println("UserService: processing user " + userId);
        return userRepository.findById(userId);
    }
}
