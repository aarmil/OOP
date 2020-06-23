public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Spot";
        dog1.breed = "Sheep dog";
        dog1.speed = 4;
        dog2.name = "Lex";
        dog2.breed = "Dalmatian";
        dog2.speed = 6;

        //Commands to run
        dog1.run();
        dog2.run();

        // Showing info about dogs
        System.out.println(dog1.info());
        System.out.println(dog2.info());

    }

}
