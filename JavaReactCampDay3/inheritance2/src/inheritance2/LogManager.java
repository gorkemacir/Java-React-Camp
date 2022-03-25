
package inheritance2;

public class LogManager {
    public void log(int logType){
        if (logType==1) {
            System.out.println("Veritabanına Loglandı");
        }else if (logType==2) {
            System.out.println("Dosyaya Loglandı");
        }else{
            System.out.println("EMaile Loglandı");
        }
    }
}
//Database
//file
//email