package me.adrian.prositab;
import me.adrian.prositab.utils.*;

public class Main {
    public static void main(String[] args) {

        boolean check,checkl,checke;
        int search,s;

        Animal lion = new Animal("Scar", "Feline", 50, false);
        Animal lionn = new Animal("Scar", "Feline", 50, false);
        Zoo tunis = new Zoo("International Zoo of Ariana", "Tunis");

        checkl = tunis.addAnimal(lionn);
        check = tunis.addAnimal(lion);
        search = tunis.searchAnimal(lion);
        s = tunis.searchAnimal(lionn);
        System.out.println("Animal added: " + check + "" + checkl + tunis.counter);
        System.out.println("Animal searched: " + search + "" + s);

        tunis.displayZoo();
    }
}
