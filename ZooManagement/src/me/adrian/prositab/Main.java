package me.adrian.prositab;
import me.adrian.prositab.utils.*;


public class Main {
    public static void main(String[] args) {
        Animal y = new Animal("Lion","Feline",12,false);
        Zoo x = new Zoo("Manar","Tunis",20);
        x.displayZoo();
        y.displayAnimal();

    }
}