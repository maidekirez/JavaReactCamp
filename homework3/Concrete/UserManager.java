
package gamedemo.Concrete;

import gamedemo.Abstracts.UserService;
import gamedemo.Entities.User;

public class UserManager implements UserService {
    
    UserValidationManager userValidationManager = new UserValidationManager();
    
    
        public UserManager(UserValidationManager userValidationManager){
        this.userValidationManager = userValidationManager;
    }

    @Override
    public void add(User user) {
        if(userValidationManager.validate(user)){
            System.out.println(user.getFirstName()+"  added.");
        }
        else
            System.out.println("Validation failed.");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName()+"  updated.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName()+"  deleted.");
    }
    
}
