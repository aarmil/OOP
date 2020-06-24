public class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 15, 20);
        System.out.println(box.Volume());
        Box box2 = new Box(11,6, 3);
        System.out.println(box2.Volume());
        Box box3 = new Box(10);
        box3.showVolume();
        Box box4 = new Box();
        box4.showVolume();

    }
}
