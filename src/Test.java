public class Test {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog("Тузик");
        Cat cat = new Cat("Мурзик");

        test(animal);
        System.out.println("---Dog---");
        dog.showName();
	    dog.barking();
        test(dog);
        System.out.println("---Cat---");
        test(cat);
        cat.showName();



    }
    public static void test(Animal animal){
        animal.eat();
    }
}

