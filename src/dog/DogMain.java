package dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("Spot");
        dog1.setBreed("Sheep dog");
        dog1.setSpeed(4);
        dog2.setName("Lex");
        dog2.setBreed("Dalmatian");
        dog2.setSpeed(6);

        //Commands to run
        dog1.run();
        dog2.run();

        // Showing info about dogs
        System.out.println(dog1.info());
        System.out.println(dog2.info());

    }

}
