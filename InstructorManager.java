
package javacamp2;


public class InstructorManager extends UserManager {
    
    public void listSalary(Instructor instructor){
        System.out.println(instructor.getId()+" kişisinin maaşı: "+instructor.getSalary());
    }
    
}
