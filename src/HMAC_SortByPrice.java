//Happy Mart Array Class
import java.util.Comparator;

class HMAC_SortByPrice implements Comparator<HMAC_Product> {
    @Override
    public int compare(HMAC_Product a, HMAC_Product b){
        return (int) a.getPrice() - (int) b.getPrice();
    }
}