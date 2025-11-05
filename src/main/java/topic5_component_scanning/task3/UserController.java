package topic5_component_scanning.task3;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void handle(String userId){
        System.out.println("UserController: request received for " + userId);
        String value = userService.getUser(userId);
        System.out.println("UserController: response sent -> " + value);
    }
}
