
package javacamp2;

public class Student extends User {
    
   private String password;
   
   public Student(int id,String userNumber,String firstName, String lastName,String password){
       super(id,userNumber,firstName,lastName);
       this.password=password;
   }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
}
