package com.company;
public class Main {
    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("sosiska", "budka", "Palcan","Boxer");
        animals[1] = new Cat("fish", "house", "Keks","British");
        animals[2] = new Horse("apple", "paddock","Velvet", "Mustang");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
abstract class Animal {
    String food;
    String location;
    String name;
    String breed;

    Animal(String food, String location,String name,String breed) {
        this.food = food;
        this.location = location;
        this.name = name;
        this.breed = breed;
    }

    public void makeNoise() {
        System.out.println("Sids");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public void sleep() {
        System.out.println("Ыleeping");
    }
}
class Dog extends Animal {

    Dog(String food, String location, String name, String breed) {
        super(food, location, name,breed);

    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n breed: %s \n speaking: гаф");
    }
    @Override
    public void sleep() {
        System.out.printf("The dog is sleeping");
    }
}
class Cat extends Animal {

    Cat(String food, String location, String name, String breed) {
        super(food, location, name,breed);

    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n breed: %s \n speaking: мяу");
    }
    @Override
    public void sleep() {
        System.out.printf("The cat is sleeping");
    }
}
class Horse extends Animal {

    public Horse(String food, String location, String name, String breed) {
        super(food, location, name,breed);
    }
    @Override
    public void makeNoise() {
        System.out.printf("Name: %s \n breed: %s \n speaking: иго-го");
    }
    @Override
    public void eat() {
        System.out.printf("Horse eating");
    }
}
class Veterinary {
    void treatAnimal(Animal animal) {
        System.out.println("At the vet's appointment " +animal.name);
        System.out.println("Nickname " +animal.name);
        System.out.println("Breed " +animal.breed);
        System.out.println( "Eats " +animal.food);
        System.out.println("The pet is " +animal.location);
        System.out.println();
    }
}