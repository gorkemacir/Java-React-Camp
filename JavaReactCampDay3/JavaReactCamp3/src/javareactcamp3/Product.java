
package javareactcamp3;

public class Product {  
    private int id;   
    private String name;
    private double unitprice;
    private String detail;
    private double discount;
    //Önce fieldları tanımlıyoruz.Sonra onları private hale getiriyoruz.
    public Product(){
        
    }
    public Product(int id, String name, double unitprice, String detail , double discount) {
        this.id = id;
        this.name = name;
        this.unitprice = unitprice;
        this.detail = detail;
        this.discount=discount;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitprice - (this.unitprice * this.discount / 100);
    }
    
    
}
