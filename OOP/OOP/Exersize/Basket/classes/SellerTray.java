package classes;

import java.util.ArrayList;

import Interfaces.ISave;
import classes.Vegetables.Vegetables;
/**
 * Basket
 */
public class SellerTray implements ISave {
    protected ArrayList<Vegetables> vegetables;
    
    public SellerTray(){
        this.vegetables = new ArrayList<>();
    }

    public void add(Vegetables vegetable){
        vegetables.add(vegetable);
    }

    public void del(Vegetables vegetable){
        vegetables.remove(vegetable);
    }

    public String getSellerTray(){
        StringBuilder sb = new StringBuilder();
        for (Vegetables vegetable : vegetables) {
            sb.append(String.format("Овощи на продажу: %s по цене %s за 1 кг.\n ", vegetable.name, vegetable.coast));
        }
        return sb.toString();
    }

    @Override
    public Vegetables get(int i) {
        return vegetables.get(i);
    }
    
}