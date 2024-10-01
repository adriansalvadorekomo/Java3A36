package me.adrian.prositab.utils;

public class Animal {
    public String name;
    public String family;
    public int age;
    public boolean isMaman;

    public Animal(String name, String family, int age, boolean isMaman) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMaman = isMaman;
    }

    public Animal() {
        name = "";
        family = "";
        age = 0;
        isMaman = false;
    }

    @Override
    public String toString() {
        return "Nom: " + name + " Family: " + family + " Age: " + age + " Is maman: " + isMaman;
    }

    public void displayAnimal() {
        System.out.println(toString());
    }
}
