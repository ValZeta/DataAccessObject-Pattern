
package dao;

public class Obat { 
    private String name;
    private String expired;
    private String price; 
    private int rollNo;

    Obat(String name, String expired, String price, int rollNo){ 
        this.name = name;
        this.expired = expired;
        this.price = price;
        this.rollNo = rollNo;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() { 
        return name;
        
    }

    public void setName(String name) { 
        this.name = name;
        this.expired = expired;
        this.price = price;
    }

    public int getRollNo() { 
        return rollNo;
    }

    public void setRollNo(int rollNo) { 
        this.rollNo = rollNo;
    }
}
