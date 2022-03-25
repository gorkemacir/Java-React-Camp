
package homework3;

public class Student extends User{

    private int studentNumber;
    private String CardInformation;
    private String Address;
    
    public Student(int studentNumber, String CardInformation, String Address) {
        this.studentNumber = studentNumber;
        this.CardInformation = CardInformation;
        this.Address = Address;
    }

    public Student(int studentNumber, String CardInformation, String Address, int id, String fullname, String Email, String Password) {
        super(id, fullname, Email, Password);
        this.studentNumber = studentNumber;
        this.CardInformation = CardInformation;
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCardInformation() {
        return CardInformation;
    }

    public void setCardInformation(String CardInformation) {
        this.CardInformation = CardInformation;
    }

       
}
