
package javareactcamp3;

public class Main {
    
    public static void main(String[] args) {
        
        Product product1=new Product(1,"Lenovo V14",15000,"16GB Ram",10);//referans oluşturma,intance
        
        Product product2=new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(10);
        product2.setUnitprice(16000);
        
        System.out.println(product2.getUnitPriceAfterDiscount());
        
        Category category1 = new Category();
        category1.setId(1);
        category1.SetName("Yiyecek");
        
        Category category2 = new Category();
        category2.setId(2);
        category2.SetName("İçecek");
        
        System.out.println(category1.getName());
        System.out.println(category2.getName());
    }   
}
//classlar referans tiptir.
//özellik tutan classlar 
//iş yapan classlar