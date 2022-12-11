package Interfaces;

import classes.Vegetables.Vegetables;

public interface IBasket {
    void add(Vegetables vegetables);
    void del(Vegetables vegetables);
    String getItemsInBasket();
}
