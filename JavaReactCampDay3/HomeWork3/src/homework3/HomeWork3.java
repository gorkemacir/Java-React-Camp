
package homework3;

public class HomeWork3 {

    public static void main(String[] args) {
        UserManager userManager = new InstructorManager();
        
        InstructorManager instructorManager = new InstructorManager();
        
        StudentManager studentManager = new StudentManager();
        
        Student student1 = new Student(123,"Ziraat Banka Kart","Elazığ/Merkez",2,"Görkem Acır","grkmacr@gmail.com","grkm23");
        System.out.println(student1.getStudentNumber());
        
        Instructor instructor1 = new Instructor(1,2,"Engin Demiroğ","engindemiroğ@kodlama.io","engin06");
        
        studentManager.SignIn(student1);
        userManager.login(student1);
        userManager.login(instructor1);
        instructorManager.delete(student1);
        
    }
}
