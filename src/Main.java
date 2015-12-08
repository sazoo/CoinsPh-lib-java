
import com.sazoo.coinsph.lib.java.coinsph;

/**
 *
 * @author DeoEmboltorio
 */
public class Main {
    
    public static void main(String[] args){
        
        coinsph cp = new coinsph();
        
        System.out.println("BID: " + cp.getBidPrice("USD"));
        System.out.println("ASK: " + cp.getAskPrice("USD"));
    }
}
