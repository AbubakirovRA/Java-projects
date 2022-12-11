package classes;

import java.util.ArrayList;

import Interfaces.IBasket;
import classes.Vegetables.Vegetables;

public class Basket implements IBasket{
    private ArrayList<Vegetables> basket;

    public Basket(){
        this.basket = new ArrayList<>();
    }
    
    public void add(Vegetables vegetable) {
        basket.add(vegetable);
        
    }

    public void del(Vegetables vegetable) {
        basket.remove(vegetable);
        
    }

    @Override
    public String getItemsInBasket() {
        StringBuilder sb = new StringBuilder();
        for (Vegetables vegetable : basket) {
            sb.append(String.format("Содержимое корзины: %s по цене %s за 1 кг.\n", vegetable.name, vegetable.coast));
        }
        return sb.toString();
    }

}
