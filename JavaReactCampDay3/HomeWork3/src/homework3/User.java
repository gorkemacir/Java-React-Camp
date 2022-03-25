
package homework3;

public class User {
    private int id;
    private String fullname;
    private String Email;
    private String Password;
    
    public User(){
        
    }
    public User(int id, String fullname, String Email, String Password) {
        this.id = id;
        this.fullname = fullname;
        this.Email = Email;
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}