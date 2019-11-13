
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> storeStock = new HashMap<String, Integer>();


    public void addProduct(String product, int price, int stock) {
    

        prices.put(product, price);
        storeStock.put(product, stock);
    }

    public int price(String product) {
        if (prices.get(product) == null) {
            return -99;
        }
        return prices.get(product);

    }

    public int stock(String product) {
        if (prices.get(product) == null) {
            return 0;
        }
        return storeStock.get(product);
    }

    public boolean take(String product) {
        
        if (storeStock.get(product) == null) {
            return false;
        } else if (storeStock.get(product) <= 0) {
            
            return false;
        } else {
            storeStock.put(product, storeStock.get(product)-1);
           
            return true;
        }
    }
    
    
    public Set<String> products(){    //Interface as method return value? 
                                      // interfacet i detta fall är Map. 
        return prices.keySet(); 
        
    }
    

}
