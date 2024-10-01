package me.adrian.prositab.utils;

public class Zoo {

    public String zooName;
    public Animal[] animals;
    public String city;
    public static final int NB_CAGES = 25;
    public int counter;

    // Constructor
    public Zoo(String zooName, String city) {
        animals = new Animal[NB_CAGES];
        this.zooName = zooName;
        this.city = city;
        this.counter = 0;
    }

    public Zoo() {
        animals = new Animal[NB_CAGES];
        this.zooName = "";
        this.city = "";
        this.counter = 0;
    }

    // Mostrar el zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Nombre de Cages: " + NB_CAGES);
        System.out.println("City: " + city);
        for (Animal a : animals) {
            if (a != null) {
                a.displayAnimal();
            }
        }
        System.out.println();
    }

    // Añadir un animal (verifica que no haya duplicados y que no esté lleno)
    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println("Le zoo n ai plus d space");
            return false;
        }

        if (searchAnimal(a) != -1) {
            System.out.println("Animal Existente dans le zoo");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = a;
                counter++;
                return true;
            }
        }
        return false;
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            counter--;
            return true;
        }
        System.out.println("L' Animal n est pas dans le Zoo.");
        return false;
    }


    public boolean isZooFull() {
        return counter >= NB_CAGES;
    }


    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.counter > z2.counter) {
            return z1;
        } else if (z2.counter > z1.counter) {
            return z2;
        } else {
            System.out.println("Les deux Zoo ont le meme nombre d animaux.");
            return null;
        }
    }
}
