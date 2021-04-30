
package javacamp2;


public class Main {
    
    public static void main(String[] args){
        Student student1=new Student(1,"1234","firstname1","lastname1","abcd");
	Instructor instructor1=new Instructor(2,"3456","firstname2","lastname2",15000);
	Student[] students= new Student[]{student1};
	for(Student student: students) {
            System.out.println("Students first name: "+student.getFirstName());
            System.out.println("Students last name: "+student.getLastName());
            System.out.println("Students number: "+student.getUserNumber());
	}
	StudentManager studentManager=new StudentManager();
	studentManager.add(student1);
	studentManager.listPassword(student1);
		
	Instructor[] instructors=new Instructor[]{instructor1};
        for(Instructor instructor:instructors) {
        	System.out.println("Instructors first name: "+instructor.getFirstName());
        	System.out.println("Instructors last name: "+instructor.getLastName());
        	System.out.println("Instructors salary: "+instructor.getSalary());
        }
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.listSalary(instructor1);
        
    }
}
