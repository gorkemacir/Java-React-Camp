
package homework3;

public class UserManager {
    public void login(User user){
        System.out.println(user.getFullname()+ ":Have succesfully Entered ");
    }
        public void logOut(User user){
        System.out.println(user.getFullname() + ":Have succesfully Logout");
    }
}
