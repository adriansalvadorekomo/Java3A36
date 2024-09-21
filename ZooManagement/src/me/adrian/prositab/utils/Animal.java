package me.adrian.prositab.utils;

public class Animal {
    private String name;
    private String family;
    private int age;
    boolean isMaman;

    public Animal(String name, String family, int age, boolean isMaman) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMaman = isMaman;

    }
    public void displayAnimal() {
        System.out.println("Nom: "+name + " " +"Family: "+family + " " +"Age: "+age+ " " +"Is maman : "+isMaman);
    }

}

