import Interfaces.IButton;
import Interfaces.ICreateUserAnswer;
import classes.Button;
import classes.UserAnswer;

public class Program {
    public static void main(String[] args) {
          
        IButton button = new Button();
        ICreateUserAnswer answer = new UserAnswer();

        if (answer.getUserAnswer("Do You want to buy Vegetables? (y/n)")){
            button.getVegetables();
        }
        
        System.out.println("Good bye!");
    }
}
