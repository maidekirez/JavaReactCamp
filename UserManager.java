
package javacamp2;


public class UserManager {
    
    public void add(User user){
        System.out.println(user.getUserNumber()+" kaydedildi.");
    }
    
    public void addMultiple(User[] users){
        for(User user: users){
            add(user);
        }
    }
}
