package me.adrian.prositab;
import me.adrian.prositab.utils.*;

public class Main {
    public static void main(String[] args) {

        boolean check,checke,t;
        int search,s;

        Animal lion = new Animal("Scar", "Feline", 50, false);
        Animal dog = new Animal("Dog", "Mamifere", 10, false);
        Animal lionn = new Animal("Scar", "Feline", 50, false);
        Animal lionnn = new Animal("Scarface", "Feline", 20, false);
        Animal tiger = new Animal("Milky", "Feline", 13, true);
        Animal owl = new Animal("Quasimodo", "Bird", 8, true);
        Animal elephant = new Animal("Terrence", "Mamifere", 9, true);
        Zoo tunis = new Zoo("International Zoo of Ariana", "Tunis");
        Zoo sfax = new Zoo("International Zoo of Sfax", "Sfax");



        tunis.addAnimal(lion);
        tunis.addAnimal(lionn);
        tunis.addAnimal(lionnn);
        tunis.addAnimal(tiger);
        tunis.addAnimal(owl);
        tunis.addAnimal(elephant);
        tunis.removeAnimal(dog);
        sfax.addAnimal(dog);
        Zoo.compareZoo(tunis,sfax);
        tunis.displayZoo();
        sfax.displayZoo();
        System.out.println(tunis.isZooFull());
    }
}
