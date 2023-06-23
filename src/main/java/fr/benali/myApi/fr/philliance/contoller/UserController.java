package fr.benali.myApi.fr.philliance.contoller;

  
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import fr.benali.myApi.fr.philliance.contoller.my.Api.UserRequest;
import fr.benali.myApi.fr.philliance.model.User;
import service.my.Api.UserService;
 
@RestController
public class UserController {
    private UserService userService;
    private UserRequest body;
    public UserController(UserService userService){

        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUsers(@RequestParam int id){
        User user = userService.getUsers(id);
        return user;
    } 
    @PostMapping("/user")
    public User creatUser(@RequestBody String name,int age ){
       User user= userService.createUser(null, 0); 
        return user;         
    }
     @PutMapping("/user") 
    public User updateUser(@RequestParam int id,@RequestBody UserRequest body  ){
        User user=  userService.updateUser(id, body.getName(),body.getAge());
        return user;            
    }
    @DeleteMapping("/user") 
    public User deleteUser(@RequestParam int id){
        User user=  userService.deleteUser(id);
        return user;            
    }   
}
