package Lectures.Lecture1.Part3;

import java.util.Random;

public class Magigcian {
    private static int number;
    private static Random r;
    
    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static{
        Magigcian.number = 0;
        Magigcian.r = new Random();
    }
}
