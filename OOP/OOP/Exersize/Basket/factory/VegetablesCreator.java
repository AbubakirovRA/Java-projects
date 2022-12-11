package factory;
import classes.Vegetables.*;
import Interfaces.*;

public class VegetablesCreator implements ICreate{
    private static VegetablesCreator INSTANCE;
    private VegetablesCreator(){

    }

    public static VegetablesCreator runCreator(){
        return INSTANCE == null ? new VegetablesCreator() : INSTANCE;
    }

    @Override
    public Beet createBeet(){
        return new Beet();
    }

    @Override
    public Cabbage createCabbage() {
        return new Cabbage();
    }

    @Override
    public Cucumber creatCucumber() {
        return new Cucumber();
    }

    @Override
    public Potato createPotato() {
        return new Potato();
    }

    @Override
    public Tomato createTomato() {
        return new Tomato();
    }

}
