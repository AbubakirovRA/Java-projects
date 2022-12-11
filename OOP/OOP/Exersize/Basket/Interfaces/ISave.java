package Interfaces;

import classes.Vegetables.*;

public interface ISave {
    void add(Vegetables vegetables);
    void del(Vegetables vegetables);
    String getSellerTray();
    Vegetables get(int i);
}
