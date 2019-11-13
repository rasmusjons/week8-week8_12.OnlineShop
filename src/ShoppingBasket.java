
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket = new HashMap<String, Purchase>();

    public ShoppingBasket() {

    }

    public void add(String product, int price) {

        if (!basket.containsKey(product)) {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);

        } else {
            basket.get(product).increaseAmount();
            
            }

        
    }

    public int price() {
        int total = 0;
        for (Purchase value : basket.values()) {
            total += value.price();
        }
        return total;
    }

    public void print() {

        for (Purchase value : basket.values()) {
            System.out.println(value.toString());
        }

    }

}
