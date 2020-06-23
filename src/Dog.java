public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String run = "";
        for (int i = 0; i < speed; i++) {
            run += "run";
            if (i < speed - 1) {
                run += ", ";
            } else {
                run += "!";
            }
        }
        System.out.println(run);
    }

    String info() {
        return "Name of the dog is " + name + ".\nBreed of the dog is " + breed + ".\nIts speed is " + speed + ".";
    }
}
