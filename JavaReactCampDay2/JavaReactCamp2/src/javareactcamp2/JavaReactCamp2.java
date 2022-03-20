
package javareactcamp2;

public class JavaReactCamp2 {
    
    public static void main(String[] args) {
        
        Product product1=new Product(1,"Lenovo V14",15000,"16GB Ram");//referans oluşturma,intance
       
        Product product2=new Product(2,"Lenovo V15",15000,"32 GB Ram");
  
        Product product3=new Product(3,"HP 5",10000,"8 GB Ram");

        
        Product [] products={
            product1,
            product2,
            product3
        };
        for (Product product:products) {
            System.out.println(product.name);
        }
        System.out.println(products.length);
        
        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisayar";
        
        Category category2=new Category();
        category2.id=1;
        category2.name="Ev/Bahçe";
        
        Category [] categorys={
          category1,
          category2
        };
        for (Category category:categorys) {
            System.out.println(category.name);
        }
        
        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        
        productManager.addToCart(product2);
        
        productManager.addToCart(product3);

    }
    
}
//classlar referans tiptir.
//özellik tutan classlar 
//iş yapan classlar