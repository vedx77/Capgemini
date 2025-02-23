//Happy Mart Array Class
public class HMAC_Product {
    private int productId;
    private String productName;
    private double price;

    //Constructor
    public HMAC_Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    //GETTERS
    public int getProductId(){ return productId; }
    public String getProductName(){ return productName; }
    public double getPrice(){ return price; }

    //SETTERS
    public void setProductId(int productId){ this.productId = productId; }
    public void setProductName(String productName){ this.productName = productName; }
    public void setPrice(double price){ this.price = price; }

    @Override
    public String toString(){
        return productId + " " + productName + " " + price;
    }

}