package dog;

public class Dog {
    private String name;
    private String breed;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
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

    public String info() {
        return "Name of the dog is " + name + ".\nBreed of the dog is " + breed + ".\nIts speed is " + speed + ".";
    }
}
