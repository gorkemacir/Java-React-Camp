/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer gorkem = new IndividualCustomer();
        gorkem.customerNumber = "12345";
        
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "7890";
        
        UnionCustomer abc = new UnionCustomer();
        abc.customerNumber = "999999";
        
        CustomerManager customerManager = new CustomerManager();
       /* customerManager.add(gorkem);
        customerManager.add(hepsiBurada); */
        Customer [] customers = {gorkem , hepsiBurada , abc};
        customerManager.addMultiple(customers);
    }
    
}
