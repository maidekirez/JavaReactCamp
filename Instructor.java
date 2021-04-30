
package javacamp2;


public class Instructor extends User {
    
    double salary;
    
    
    public Instructor(int id,String userNumber,String firstName, String lastName,double salary){
        super(id,userNumber,firstName,lastName);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
