public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.lenght = 15;
        myBox.width = 1.3;
        Box box2 = new Box();
        Box box3 = new Box();
        box2.width = 5;
        box2.height = 5;
        box2.lenght = 5;
        box3.width = 10;
        box3.height = 10;
        box3.lenght = 10;
        Box box4 = box3;
        box4.height = 100;
        double volume = myBox.height * myBox.lenght * myBox.width;
        double volume2 = box2.height * box2.lenght * box2.width;
        double volume3 = box3.height * box3.lenght * box3.width;
        System.out.println("Volume of 1 box = " + volume + "\nVolume of 2 box = " + volume2 + "\nVolume of 3 box = " + volume3);

    }
}
