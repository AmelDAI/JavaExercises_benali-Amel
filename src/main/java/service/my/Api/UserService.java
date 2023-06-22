package service.my.Api;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.benali.myApi.fr.philliance.model.User;

@Service
public class UserService {
    private ArrayList<User>users;
    
    
public UserService(){
 this.users = new ArrayList<User>();

 this.users.add(new User(0, "Celine", 28));
 this.users.add(new User(0, "Alex", 34));
 this.users.add(new User(0, "Samanta", 41));
    }
    
     
    public User getUsers( int id){
        for(User user : this.users){
         if(user.getId()== id){
            return user;
         }
        }
         
        return null;
    }
}
