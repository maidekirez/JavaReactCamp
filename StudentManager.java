
package javacamp2;


public class StudentManager extends UserManager{
    
    
   public void listPassword(Student student){
        System.out.println(student.getId()+" kişisinin parolası: "+student.getPassword());
    }

    public StudentManager() {
        super();
    }
    
}
