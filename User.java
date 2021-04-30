
package javacamp2;


public class User {
    private int id;
    private String userNumber;
    private String firstName;
    private String lastName;
    
    public User(int id,String userNumber, String firstName, String lastName){
        this.id=id;
        this.userNumber=userNumber;
        this.firstName= firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
     
}
