package com.Queue;

public class QDemo {
    public static void main (String args[]){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alpabet.");
        // Поместить буквенные символы в очередь bigQ
        for(i=0; i<26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.println("Contents of bigQ: ");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Использовать небольшую очередь smallQ для генерации ошибок
        for (i=0; i<5; i++){
            System.out.println("Attempting to store " +
                    (char) ('Z'-i));

            smallQ.put(((char) ('Z'-i)));

            System.out.println();
        }
        System.out.println();

        // Допольнительные ошибки при обращении к очереди smallQ
        System.out.println("Contents of smallQ: ");
        for (i=0; i<5; i++){
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
