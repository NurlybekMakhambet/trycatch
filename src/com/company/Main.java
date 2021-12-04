package com.company;
import java.util.*;
public class Main {

    public static void main(String args[])
    {
//Стак класына обьект жасау
        Stack stk = new Stack();
        System.out.println("stack: " + stk);
//стекке сандар енгизу
        pushelmnt(stk, 20);
        pushelmnt(stk, 13);
        pushelmnt(stk, 89);
        pushelmnt(stk, 90);
        pushelmnt(stk, 11);
        pushelmnt(stk, 45);
        pushelmnt(stk, 18);
//стектеги элементтерди шыгару
        popelmnt(stk);
        popelmnt(stk);
//стекти тексерип егер стекте элемент калмаган болса элемент жок деп шыгарады
        try
        {
            popelmnt(stk);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }

    static void pushelmnt(Stack stk, int x)
    {
//пуш адисин шакыру
        stk.push(new Integer(x));
        System.out.println("push -> " + x);
//жана косылган сандармен шыгару
        System.out.println("stack: " + stk);
    }

    static void popelmnt(Stack stk)
    {
        System.out.print("pop -> ");
//поп методын шакыру
        Integer x = (Integer) stk.pop();
        System.out.println(x);
//поптан кейынгы калган сандарды шыгару
        System.out.println("stack: " + stk);
    }
}