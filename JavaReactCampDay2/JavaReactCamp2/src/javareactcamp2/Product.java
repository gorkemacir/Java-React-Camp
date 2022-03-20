
package javareactcamp2;

public class Product {
    
    public Product(){//constructor
        System.out.println("Ben Çalıştım");
    }
    
    public Product(int id,String name,double unitprice,String detail){
        this();
        this.id=id;
        this.name=name;
        this.unitprice=unitprice;
        this.detail=detail;
    }
    
    int id;
    String name;
    double unitprice;
    String detail;
    
    
    
}
