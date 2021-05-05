
package gamedemo.Concrete;

import gamedemo.Abstracts.UserValidationService;
import gamedemo.Entities.User;


public class UserValidationManager implements UserValidationService {

    @Override
    public boolean validate(User user) {
        if(user.getUserValidation()==true){
            return true;
        }
        return false;
    }
    
}
