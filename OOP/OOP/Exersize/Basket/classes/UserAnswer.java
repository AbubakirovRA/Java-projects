package classes;

import java.util.Scanner;

import Interfaces.ICreateUserAnswer;

public class UserAnswer implements ICreateUserAnswer{

    @Override
    public boolean getUserAnswer(String tittle) {
        System.out.println(tittle);
        boolean answer = false;
        Scanner scanner = new Scanner(System.in);
        String iScanner = scanner.next();
        
        if (iScanner.equalsIgnoreCase("y")){
            answer = true;
            // scanner.close();
        }
        return answer;
    }



}

