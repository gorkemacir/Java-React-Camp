
package homework2;

public class HomeWork2 {


    public static void main(String[] args) {
        Courses course1=new Courses(
                1,
                "Yazılım Geliştirici Kampı{JavaScript}",
                "Eğitim 1.5 ay sürecek",
                "Engin Demiroğ",
                "Ücretsiz");
        
        Courses course2=new Courses(1,
                "Yazılım Geliştirici Kampı{Java-React}",
                "Eğitim 2 ay sürecek",
                "Engin Demiroğ",
                "Ücretsiz");
       
        Courses course3=new Courses(1,"Yazılım Geliştirici Kampı{C#-Angular}","Eğitim 2 ay sürecek","Engin Demiroğ","Ücretsiz");
        course3.id=1;
        course3.name="Yazılım Geliştirici Kampı{C#-Angular}";
        course3.detail="Eğitim 2 ay sürecek";
        course3.trainer="Engin Demiroğ";
        course3.price="Ücretsiz";
       
        Courses course4=new Courses(1,
                "Programlamaya Giriş İçin Temel Kurs",
                "Eğitim 2 ay sürecek",
                "Engin Demiroğ",
                "Ücretsiz");
        
        Courses [] course={
            course1,
            course2,
            course3,
            course4
                
        };
        for (Courses courses:course) {
            System.out.println(courses.name);
        }
        
        CoursesManager coursesManager=new CoursesManager();
        coursesManager.JoinTheProgram(course1);
        coursesManager.JoinTheProgram(course2);
        coursesManager.JoinTheProgram(course3);
        coursesManager.JoinTheProgram(course4);
    }
    
}
