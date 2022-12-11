package classes;
import Interfaces.IBasket;
import Interfaces.IButton;
import Interfaces.ICreate;
import Interfaces.ICreateUserAnswer;
import Interfaces.ISave;
import factory.*;

public class Button implements IButton{

    @Override
    public void getVegetables() {
        ICreateUserAnswer answer = new UserAnswer();
        if (answer.getUserAnswer("Do You want to show list of Vegetables? (y/n)")){
            showListOfVegetables();
        }
        
    }

    public void showListOfVegetables(){
        ICreate maker = VegetablesCreator.runCreator();
        ISave vegetables = new SellerTray();
        IBasket basket = new Basket();

        vegetables.add(maker.createBeet());
        vegetables.add(maker.creatCucumber());
        vegetables.add(maker.createCabbage());
        vegetables.add(maker.createPotato());
        vegetables.add(maker.createTomato());

        System.out.println(vegetables.getSellerTray());

        ICreateUserAnswer answer = new UserAnswer();
        if (answer.getUserAnswer("Do You want to buy Beet? (y/n)")){
            basket.add(vegetables.get(0));
        }

        if (answer.getUserAnswer("Do You want to buy Cucumber? (y/n)")){
            basket.add(vegetables.get(1));
        }

        if (answer.getUserAnswer("Do You want to buy Cabbage? (y/n)")){
            basket.add(vegetables.get(2));
        }

        if (answer.getUserAnswer("Do You want to buy Potato? (y/n)")){
            basket.add(vegetables.get(3));
        }

        if (answer.getUserAnswer("Do You want to buy Tomato? (y/n)")){
            basket.add(vegetables.get(4));
        }

        System.out.println(basket.getItemsInBasket());
    }
}
