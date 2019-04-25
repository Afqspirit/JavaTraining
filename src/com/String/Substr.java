package com.String;

public class Substr {
    public static void main (String args[]){
        String orgstr = "Java makes the Web move.";

        // Сформировать подстроку
        // Здесь создается новая строка, содержащая нужную подстрокую
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
