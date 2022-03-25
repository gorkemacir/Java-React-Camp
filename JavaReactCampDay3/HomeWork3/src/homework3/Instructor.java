
package homework3;

public class Instructor extends User {
    private int instructorNumber;
    
    public Instructor(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public Instructor(int instructorNumber, int id, String fullname, String Email, String Password) {
        super(id, fullname, Email, Password);
        this.instructorNumber = instructorNumber;
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
    
    
   
}