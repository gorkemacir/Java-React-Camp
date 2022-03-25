
package inheritance2;

public class Main {
//birbirinin alternatifi olmayan kodlar için if yazılmaz.
    public static void main(String[] args) {
      CustomerManager customerManager = new CustomerManager();
      customerManager.add(new EMailLogger());
    }
}
