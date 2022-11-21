package ad211.vietokhin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    static GenericClass g = new GenericClass();

    public static void main(String[] args) {
        int menu;

        do {

            System.out.println("\n1. Add element" +
                    "\n2. Show list" +
                    "\n3. Delete first element" +
                    "\n4. Add random collecton to list" +
                    "\n5. Delete all elements" +
                    "\n6. End program");

            Scanner menuScanner = new Scanner(System.in);
            menu = menuScanner.nextInt();

            switch (menu) {
                case 1: addElement(); break;
                case 2: g.outputElements(); break;
                case 3: g.deleteElement(); break;
                case 4: addCollection(); break;
                case 5: deleteAllElements(); break;
                case 6: System.exit(0);
            }
        }while(menu != 6);

    }

    private static <E> void deleteAllElements() {
        ArrayDeque<E> deque = g.getDeque();
        deque.clear();
        g.setDeque(deque);
    }

    private static void addElement(){
        Scanner StringScanner = new Scanner(System.in);
        System.out.println("\nInput element of the list");
        String s = StringScanner.nextLine();
        g.addElement(s);
    }

    private static void addCollection() {
        ArrayDeque<String> deque = g.getDeque();
        Collection<String> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            double n = Math.random()*100;
            list.add(String.valueOf(n));
        }
        deque.addAll(list);
        g.setDeque(deque);
    }
}

