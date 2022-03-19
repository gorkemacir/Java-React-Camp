
package javareactcamp;


public class JavaReactCamp {

    //****Don't Repeat Yourself*****
    public static void main(String[] args) {
        String internetSubeButonu="İnternet Şubesi";
        double dolarDun=8.20;
        double dolarBugun=8.20;
        int vade=36;
        boolean dustuMu=false;
        
        System.out.println(internetSubeButonu);
        if (dolarBugun<dolarDun) {
            System.out.println("Dolar Dustu Resmi");
        }else if (dolarBugun>dolarDun) {
            System.out.println("Dolar yukseldi Resmi");
        }
        else{
            System.out.println("Dolar Eşittir Resmi");
        }
        String [] krediler={
            "Hızlı Krediler",
            "Mutlu Emekli Kredisi",
            "Konut Kredileri",
            "Çiftçi Kredileri",
            "Msb Kredileri",
            "Meb Kredisi"
        };//foreach
        for (String kredi : krediler) {//elimde dizi var o dizideki elemanları tek tek dolaş
            System.out.println(kredi);
        }
        /*for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }*/ //bu şekilde bir döngü kullanılabilir
        int sayi1=10;//değer ataması yapılır sonra sayı1 le sayı2 arasında bağlantı kalmaz
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1);
        
        int [] sayilar1={1,2,3,4,5};
        int [] sayilar2={10,20,30,40,50};
        sayilar1 = sayilar2;//diziler referans tiptir.Tutulma şekli değişiyor.sayılar1 in adresi eşittir sayılar2.Garbage collector bellekteki sayılar1 deki değerleri siler.
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);
        
        String Sehir1="Ankara";
        String Sehir2="İstanbul";
        Sehir1=Sehir2;
        Sehir2="İzmir";
        System.out.println(Sehir1);
        
        int number = 10;
        String message = "Öğrenci Sayısı: ";
        System.out.println(message + number);
        
        double num = 12.5;
        int intnum = -129;
        char ch = 'A';
        System.out.println(num);
        System.out.println(intnum);
        System.out.println(ch);

        int number1 = 25;
        if (number1 > 50) {
            System.out.println("Sayı 50'den büyüktür");
        } else if (number1 == 20) {
            System.out.println("Sayı 50'ye eşittir.");
        } else {
            System.out.println("Sayı 50'den küçüktür");
        }

        int sayi3 = 56;
        int sayi4 = 25;
        int sayi5 = 79;
        int biggest = sayi1;

        if (biggest < sayi2) {
            biggest = sayi2;
        } else if (biggest < sayi3) {
            biggest = sayi3;
        }
        System.out.println("En büyük : " + biggest);

        

        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("LOOP DONE");
        System.out.println("Tek Sayılar");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("While Loop");
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("Do-While Loop");
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);

        String[] students = new String[]{"Ali", "Veli", "Muhammed", "Sinem", "Özlem"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Foreach");
        for (String student : students) {
            System.out.println(student);
        }
        
        
        double[] myList = {1, 2.5, 4.6, 3.7, 7};
        double total = 0;
        double max = myList[0];
        for (double sayi : myList) {
            if (max < sayi) {
                max = sayi;
            }
            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("TOTAL: " + total);
        System.out.println("Max : " + max);
        
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Şanlıurfa";
        cities[2][2] = "Gaziantep";
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------");
            for (int k = 0; k < 3; k++) {
                System.out.println(cities[i][k]);
            }
        }
        

        int nmbr = 15205;
        boolean flag = false;
        for (int i = 2; i < nmbr; ++i) {
            if (nmbr % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(nmbr + " asal sayıdır.");
        else
            System.out.println(nmbr + " asal sayı değildir.");
        
    }        
}      
       

