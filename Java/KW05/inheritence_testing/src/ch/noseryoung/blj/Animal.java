package ch.noseryoung.blj;

public static void main(String[]args){

    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    public class InheritanceExample {
        public void main(String[] args) {
            Animal animal = new Animal("generic animal");
            animal.makeSound();

            Dog dog = new Dog("Rufus");
            dog.makeSound();
        }
    }

    }

