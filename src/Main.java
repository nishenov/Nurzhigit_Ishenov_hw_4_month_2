import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> dogs = new ArrayList<>(5);
        ArrayList<String> cats = new ArrayList<>(5);
        System.out.println("Введи 5 кличек собак. Они должны быть брутальными.");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            dogs.add(scanner.nextLine());
        }
        System.out.println("Список собак следующий: " + dogs);
        System.out.println();
        System.out.println("Введи 5 кличек кошек. Они должны быть милыми");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            cats.add(scanner.nextLine());
        }
        System.out.println("Список кошек следующий: " + cats);
        System.out.println();
        ArrayList<String> dogsAndCats = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            dogsAndCats.add(dogs.get(i));
            dogsAndCats.add(cats.get(cats.size()-i-1));
        }
        System.out.println("Совмещенный список следующий :" + dogsAndCats);
        Collections.sort(dogsAndCats, Comparator.comparingInt(String::length));
        System.out.println();
        System.out.println("Отсортированный список следующий: " + dogsAndCats);
    }
}