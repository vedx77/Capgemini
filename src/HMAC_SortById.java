//Happy Mart Array Class
import java.util.Comparator;

class HMAC_SortById implements Comparator<HMAC_Product> {
    @Override
    public int compare(HMAC_Product a, HMAC_Product b){
        return a.getProductId() - b.getProductId();
    }
}