package fr.benali.myApi.fr.philliance.contoller;

 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import fr.benali.myApi.fr.philliance.model.User;
import service.my.Api.UserService;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService){

        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUsers(@RequestParam int id){
        User user = userService.getUsers(id);
        return user;
    }
    
}
